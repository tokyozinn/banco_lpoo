package lpoo_3005.contas;

public class ContaStandard extends Conta {

	private double taxa = -7.0;

	public ContaStandard(int n) {
		super(n);
	}

	@Override
	public void setChequeEspecial(double valor) {
		this.valorChequeEspecial = valor;
	}

	@Override
	public void atualizaTaxas() {
		if (this.saldo < 0) {
			this.taxa -= (this.saldo * 0.09);
		}
		return;
	}

	@Override
	public String getTipo() {
		return "Standard";
	}

}
