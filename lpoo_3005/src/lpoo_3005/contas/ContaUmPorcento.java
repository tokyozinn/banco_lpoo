package lpoo_3005.contas;

public class ContaUmPorcento extends Conta {
	
	private double taxa = -30.0;
	private double taxaChequeEspecial;

	public ContaUmPorcento(int n) {
		super(n);
	}
	
	// Nesta modalidade, há o cálculo das taxas do cheque especial independente do saldo, então sempre será calculado
	@Override
	public void atualizaTaxas() {
		this.taxaChequeEspecial = this.saldo * 0.01;
		this.saldo += (this.taxa + this.taxaChequeEspecial);
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
