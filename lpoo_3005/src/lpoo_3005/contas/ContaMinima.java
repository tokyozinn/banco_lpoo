package lpoo_3005.contas;

public class ContaMinima extends Conta {

	public ContaMinima(int n) {
		super(n);
	}

	@Override
	public void setChequeEspecial(double valor) {
		return;
	}

	@Override
	public String getTipo() {
		return "Mínima";
	}


}
