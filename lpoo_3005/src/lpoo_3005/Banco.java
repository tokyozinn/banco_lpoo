package lpoo_3005;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco implements IBanco {

	public ArrayList<Cliente> clientes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	@Override
	public void cadastraCliente(String cpf, String nome) {
		Cliente c = new Cliente(cpf, nome);
		this.clientes.add(c);
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
		
		
//		for (Cliente cliente : this.clientes) {
//			if(cliente.getCpf().equals(cpf)) {
//				cliente.setEndereco(nomeDaRua, numero);
//				return;
//			}
//			JOptionPane.showMessageDialog(null, "CPF não encontrado no sistema", "ERRO", 1);
//		}
	}

	@Override
	public void setConta(String cpf, TipoContas tipoContas) {
		// TODO Auto-generated method stub

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
	
	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}
	
	

}
