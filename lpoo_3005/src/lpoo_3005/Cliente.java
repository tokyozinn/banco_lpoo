package lpoo_3005;

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

	public String getCpf() {
		return this.cpf;
	}

	public void setEndereco(String nomeDaRua, int numero) {
		this.endereco = new Endereco(nomeDaRua, numero);
	}
	
	public String getNome() {
		return this.nome;
	}
}
