package lpoo_3005.banco;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import lpoo_3005.cliente.Cliente;

public class Banco implements IBanco {

	// O Set é uma Coleção do Java que não aceita elementos repetidos
	private Set<Cliente> clientes = new HashSet<Cliente>();
	// O Map é uma estrutura de dados que cria um vínculo de um objeto com uma chave, 
	// neste caso, o CPF de um cliente com o objeto Cliente
	private Map<String, Cliente> cpfCliente = new HashMap<>();
	
	// Método que adiciona o cliente
	@Override
	public void cadastraCliente(String cpf, String nome) throws Exception {
		Cliente c = new Cliente(cpf, nome);
		// Uma pequena verificação se o CPF já está cadastrado no sistema
		if (clientes.contains(c)) {
			throw new Exception(String.format("CPF '%s' já cadastrado no sistema!", c.getCpf()));
		} else {
		// Adicionando o cliente ao Set
		this.clientes.add(c);
		// Criando o vínculo CPF : Cliente
		this.cpfCliente.put(cpf, c);
		}
	}
	
	// Método que será usado diversas vezes para buscar um cliente pelo seu CPF, através do Map cpfCliente
	public Cliente buscaCliente(String cpf) {
		// Se o resultado da busca não for nulo, ele me retorna o objeto atrelado ao CPF
		if (! (this.cpfCliente.get(cpf) == null)) {
			return this.cpfCliente.get(cpf);
		// Senão, lança uma exceção	
		} else {
			throw new NoSuchElementException("CPF não encontrado");
		}
	}
	
	// Método que vincula o Cliente à um endereço
	@Override
	public void setEndereco(String cpf, String nomeDaRua, int numero) {	
		Cliente c = buscaCliente(cpf);
		c.setEndereco(nomeDaRua, numero);
	}

	// Método que atribui um tipo de conta ao cliente
	@Override
	public void setConta(String cpf, TipoContas tipoContas) {
		Cliente c = buscaCliente(cpf);
		c.setConta(tipoContas);
	}

	// Método que simula uma operação de saque
	@Override
	public void sacar(String cpf, double valor) throws Exception {
		Cliente c = buscaCliente(cpf);
		c.sacar(valor);;
	}

	// Método que aumenta o saldo na conta
	@Override
	public void depositar(String cpf, double valor) throws Exception {
		if (valor < 0) {
			throw new Exception("Erro no valor digitado. Favor digite um número válido.");
		} else { 
		Cliente c = buscaCliente(cpf);
		c.depositar(valor);
		}
	}

	// Método que estebelece o valor do cheque especial da conta do cliente
	@Override
	public void setChequeEspecial(String cpf, double valor) {
		Cliente c = buscaCliente(cpf);
		c.chequeEspecial(valor);
	}

	// Método que vai iterar em todos os clientes, cobrando as taxas de cada um
	@Override
	public void cobrarTaxas() {
		clientes.forEach(cliente -> {
			cliente.cobrarTaxas();
		});
	}
	
	// Método que retorna no console o nome, tipo de conta, o saldo e o limite do cheque especial de todos os clientes
	@Override
	public void imprimirRelatorio() {
		clientes.forEach(cliente -> {
			System.out.println(String.format("Nome: %s | Conta: nº %d Tipo: %s | Saldo: %.2f | Cheque especial: %.2f" , 
					cliente.getNome(), cliente.getConta().getNumero(), cliente.getConta().getTipo(), 
					cliente.getConta().getSaldo(), cliente.getConta().getChequeEspecial()));
			});
		System.out.println("\n");
			
//			System.out.println("Nome: " + cliente.getNome() + " | Tipo de conta: " + cliente.getConta().getTipo() + " | Saldo: " 
//		+ cliente.getConta().getSaldo() + " | Valor liberado p/ cheque especial: " + cliente.getConta().getChequeEspecial());
//		});
	}

	@Override
	public String toString() {
		return "Banco [clientes=" + clientes + "]";
	}
	
	public Set<Cliente> getClientes() {
		return Collections.unmodifiableSet(this.clientes);
	}

}
