package lpoo_3005.cliente;

import lpoo_3005.banco.TipoContas;
import lpoo_3005.contas.Conta;
import lpoo_3005.contas.ContaMinima;
import lpoo_3005.contas.ContaStandard;
import lpoo_3005.contas.ContaUmPorcento;

public class Cliente {

	private String cpf;
	private String nome;
	private Endereco endereco;
	private Conta conta;

	// Garanto no constructor que não terei um CPF nulo, assim no método equals eu não preciso fazer essa verificação
	public Cliente(String cpf, String n) {
		if (cpf == null) {
			throw new NullPointerException("CPF não pode ser null");
		}
		this.cpf = cpf;
		this.nome = n;
	}

	// Nesta classe, caso o cliente tenha o mesmo CPF, ele será considerado igual!
	@Override
	public boolean equals(Object c) {
		if(this == c) return true;
		if(!(c instanceof Cliente)) return false;
		Cliente cliente = (Cliente)c;
		return this.cpf.equals(cliente.cpf);
	}
	
	// Desta forma, os clientes seguirão o mesmo padrão de armazenamento dentro do HashSet, facilitando a sua busca
	@Override
	public int hashCode() {
		return this.cpf.hashCode();
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
	public void setEndereco(String nomeDaRua, int numero) {
		this.endereco = new Endereco(nomeDaRua, numero);
	}
	
	// Método que está vinculado à classe ENUM, atribuindo um tipo de conta à cada opção e 
	// gerando um número de 3 dígitos aleatório como número da conta
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

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", conta=" + conta + "]\n";
	}
}
