package lpoo_3005.banco;

public interface IBanco {
		
	public void cadastraCliente(String cpf, String nome) throws Exception;
		
	public void setEndereco(String cpf, String nomeDaRua, int numero);
			
	public void setConta(String cpf, TipoContas tipoContas);
	
	public void sacar(String cpf, double valor) throws Exception;
		
	public void depositar(String cpf, double valor) throws Exception;
		
	public void setChequeEspecial(String cpf, double valor);
		
	public void cobrarTaxas();
		
	public void imprimirRelatorio();
	

}
