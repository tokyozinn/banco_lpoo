package lpoo_3005;

public class Endereco {

	private String rua;
	private int numero;
	
	public Endereco(String r, int n) {
		this.rua = r;
		this.numero = n;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + "]";
	}
}
