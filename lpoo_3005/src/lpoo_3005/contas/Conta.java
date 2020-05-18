package lpoo_3005.contas;

public abstract class Conta {
	
	protected int numero;
	protected double saldo = 0.0;
	protected double valorChequeEspecial = 0.0;
	
	public Conta(int n) {
		this.numero = n;
	}
	
	// Verificando se o valor a ser sacado não está acima do saldo disponível + o limite do cheque especial
	public void sacar(double valor) throws Exception {
		if (valor > (this.saldo + this.valorChequeEspecial)) {
			throw new Exception("Valor acima do permitido.");
		} else {
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// Como cada conta terá um meio de calcular suas taxas e cheque especial, deixo suas respectivas implementações para as subclasses
	public abstract void atualizaTaxas();
	public abstract void setChequeEspecial(double valor);
	public abstract String getTipo();

	public double getChequeEspecial() {
		return this.valorChequeEspecial;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}

	public int getNumero() {
		return this.numero;
	}
}
