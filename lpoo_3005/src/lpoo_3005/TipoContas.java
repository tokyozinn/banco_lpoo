package lpoo_3005;

public enum TipoContas {

	MINIMA(new ContaMinima((int)(Math.random()*10000), 0.0)),
	STANDARD(new ContaStandard((int)(Math.random()*10000), 10.0)),
	UM_PORCENTO(new ContaUmPorcento((int)(Math.random()*10000), 20.0));
	
	public Conta conta;
	TipoContas(Conta c) {
		this.conta = c;
	}
}
