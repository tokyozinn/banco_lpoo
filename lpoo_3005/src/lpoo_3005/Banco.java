package lpoo_3005;

import java.util.ArrayList;

public class Banco implements IBanco {

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@Override
	public void cadastraCliente(String cpf, String nome) {
		Cliente c = new Cliente(cpf, nome);
		clientes.add(c);
	}

	@Override
	public void setEndereco(String cpf, String nomeDaRua, int numero) {
		for (Cliente cliente : clientes) {
			if(cliente.equals(cpf)) {
				
			}
		}

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

}
