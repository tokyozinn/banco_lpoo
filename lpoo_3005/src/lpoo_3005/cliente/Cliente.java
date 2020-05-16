package lpoo_3005.cliente;

import lpoo_3005.banco.TipoContas;
import lpoo_3005.contas.Conta;
import lpoo_3005.contas.ContaMinima;
import lpoo_3005.contas.ContaStandard;
import lpoo_3005.contas.ContaUmPorcento;


public class Cliente {
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", conta=" + conta + "]\n";
	}

	private String cpf;
	private String nome;
	private Endereco endereco;
	private Conta conta;

	public Cliente(String cpf, String n) {
		if (cpf == null) {
			throw new NullPointerException("CPF não pode ser null");
		}
		this.cpf = cpf;
		this.nome = n;
	}

	@Override
	public boolean equals(Object c) {
	
		if(this == c) return true;
		
		if(!(c instanceof Cliente)) return false;
		
		Cliente cliente = (Cliente)c;
		
		return this.cpf.equals(cliente.cpf);
	}
	
	@Override
	public int hashCode() {
		return this.cpf.hashCode();
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setEndereco(String nomeDaRua, int numero) {
		this.endereco = new Endereco(nomeDaRua, numero);
	}
	
	public void setConta(TipoContas t) {
		switch (t) {
		case MINIMA:
			this.conta = new ContaMinima((int)(Math.random()*1000));
			break;
		case STANDARD:
			this.conta = new ContaStandard((int)(Math.random()*1000));
			break;
		case UM_PORCENTO:
			this.conta = new ContaUmPorcento((int)(Math.random()*1000));
			break;
		default:
			throw new IllegalArgumentException("Tipo de conta inválido: " + t);
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void sacar(double valor) throws Exception {
		this.conta.sacar(valor);
	}
	
	public void depositar(double valor) {
		this.conta.depositar(valor);
	}
	
	public void chequeEspecial(double valor) {
		this.conta.setChequeEspecial(valor);
	}
	
	public void cobrarTaxas() {
		this.conta.atualizaTaxas();
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
}
