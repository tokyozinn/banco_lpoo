package lpoo_3005;

public abstract class Conta {
	
	private int numero;
	private double saldo;
	
	public Conta(int n, double s) {
		this.numero = n;
		this.saldo = s;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
}
