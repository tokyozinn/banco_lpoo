package lpoo_3005.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import lpoo_3005.banco.Banco;
import lpoo_3005.banco.TipoContas;

public class Teste {

	@Test
	public void saqueContaMinimaTest() throws Exception {
		
		Banco b = new Banco();
		
		b.cadastraCliente("100", "Fulano");
		b.setEndereco("100", "Rua X", 140);
		b.setConta("100", TipoContas.MINIMA);
		
		b.depositar("100", 1000.0);
		b.sacar("100", 500.0);
		
		assertEquals(500.0, b.buscaCliente("100").getConta().getSaldo(), 0.00001);
	}
	
	@Test
	public void saqueContaStandardComChequeEspecial() throws Exception {

		Banco b = new Banco();
		
		b.cadastraCliente("200", "Ciclano");
		b.setEndereco("200", "Rua Y", 240);
		b.setConta("200", TipoContas.STANDARD);
		b.setChequeEspecial("200", 5000);
		
		b.sacar("200", 4000.0);
		
		assertEquals(-4000.0, b.buscaCliente("200").getConta().getSaldo(), 0.00001);
	}
	
	@Test
	public void saqueContaUmPorcentoComSaldoEChequeEspecial() throws Exception {
		Banco b = new Banco();
	
		b.cadastraCliente("300", "Beltrano");
		b.setEndereco("300", "Rua Z", 340);
		b.setConta("300", TipoContas.UM_PORCENTO);
		
		b.setChequeEspecial("300", 8000);
		b.depositar("300", 2000.0);
		b.sacar("300", 10000.00);
		
		assertEquals(-8000.0, b.buscaCliente("300").getConta().getSaldo(), 0.0001);
	}

	}

