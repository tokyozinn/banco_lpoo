package lpoo_3005.contas;

public class ContaUmPorcento extends Conta {
	
	private double taxa = -30.0;

	public ContaUmPorcento(int n) {
		super(n);
	}
	
	@Override
	public void atualizaTaxas() {
		if (this.saldo >= 0) {
			this.taxa += (this.saldo * 0.01);
		} else {
			this.taxa -= (this.saldo * 0.01);
		}
	}

	@Override
	public void setChequeEspecial(double valor) {
		this.valorChequeEspecial = valor;
	}

	@Override
	public String getTipo() {
		return "Um porcento";
	}

}
