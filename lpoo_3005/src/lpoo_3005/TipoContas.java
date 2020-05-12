package lpoo_3005;

public enum TipoContas {

	MINIMA(new ContaMinima()),
	STANDARD(new ContaStandard()),
	UM_PORCENTO(new ContaUmPorcento());
	
	public Conta conta;
	TipoContas(Conta c) {
		this.conta = c;
	}
}
