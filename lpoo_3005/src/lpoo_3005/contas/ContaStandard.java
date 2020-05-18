package lpoo_3005.contas;

public class ContaStandard extends Conta {

	private double taxa = -7.0;
	private double taxaChequeEspecial;

	public ContaStandard(int n) {
		super(n);
	}

	@Override
	public void setChequeEspecial(double valor) {
		this.valorChequeEspecial = valor;
	}

	// Somo o valor fixo da taxa mensal da conta à sua % de desconto caso haja uso do cheque especial (saldo negativo)
	@Override
	public void atualizaTaxas() {
		if (this.saldo < 0) {
			this.taxaChequeEspecial = this.saldo * 0.09;
			this.saldo += (this.taxa + this.taxaChequeEspecial);
		} else {
		this.saldo += this.taxa;
		}
		return;
	}

	@Override
	public String getTipo() {
		return "Standard";
	}

}
