package lpoo_3005;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Banco implements IBanco {

	private Set<Cliente> clientes = new HashSet<Cliente>();
	private Map<String, Cliente> cpfCliente = new HashMap<>();
	
	@Override
	public void cadastraCliente(String cpf, String nome) {
		Cliente c = new Cliente(cpf, nome);
		this.clientes.add(c);
		this.cpfCliente.put(cpf, c);
	}

	@Override
	public void setEndereco(String cpf, String nomeDaRua, int numero) {
		
		boolean isInList = false;
		for(Cliente cliente : clientes) {
			if(cliente.getCpf().equals(cpf)) {
				isInList = true;
				cliente.setEndereco(nomeDaRua, numero);
				return;
			} else {
				isInList = false;
			}
		}
		
		if (! isInList) {
			JOptionPane.showMessageDialog(null, "CPF não encontrado!", "Erro", 1);
		} 
		
	}

	@Override
	public void setConta(String cpf, TipoContas tipoContas) {

		boolean isInList = false;
		for(Cliente c : clientes) {
			if (c.getCpf().equals(cpf)) {
				c.setConta(tipoContas);
				isInList = true;
				break;
			}
		}
		
		if (! isInList) {
			JOptionPane.showMessageDialog(null, "CPF não encontrado", "ERRO", 1);
		}

	}

	@Override
	public boolean sacar(String cpf, double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void depositar(String cpf, double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setChequeEspecial(String cpf, double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cobrarTaxas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirRelatorio() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Banco [clientes=" + clientes + "]";
	}
	
	public Set<Cliente> getClientes() {
		return Collections.unmodifiableSet(this.clientes);
	}
	
	
	public Cliente buscaCliente(String cpf) {
		return this.cpfCliente.get(cpf);
	}
	
	

}
