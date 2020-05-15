package lpoo_3005;

public class Cliente {
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", conta=" + conta + "]\n";
	}

	private String cpf;
	private String nome;
	private Endereco endereco;
	private TipoContas conta;

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
		this.conta = t;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public TipoContas getConta() {
		return this.conta;
	}
}
