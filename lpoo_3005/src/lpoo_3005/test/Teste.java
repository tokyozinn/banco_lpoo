package lpoo_3005.test;
import lpoo_3005.banco.Banco;
import lpoo_3005.banco.TipoContas;

public class Teste {

	
	public static void main(String[] args) throws Exception {
		Banco b = new Banco();
		
		b.cadastraCliente("14", "Ana");
		b.cadastraCliente("13", "Ana Banana");
		b.cadastraCliente("22", "Bruna");
		b.cadastraCliente("21", "Bia");
		b.cadastraCliente("30", "Cassia");
		b.cadastraCliente("39", "Carol");
		b.cadastraCliente("48", "Drauzio");
		b.cadastraCliente("74", "Duda");
		b.cadastraCliente("65", "Fernanda");
		b.cadastraCliente("55", "Flavia");
		b.cadastraCliente("64", "Gabi");
		b.cadastraCliente("36", "Gio");
		b.cadastraCliente("72", "Jack");
		b.cadastraCliente("17", "Joana");

		
		b.setEndereco("14", "Rua jafágá", 14);

		
		b.setConta("14", TipoContas.STANDARD);
		b.setChequeEspecial("14", 5000);
		b.depositar("14", 2000);
		b.sacar("14", 6000);
		
		System.out.println(b.getClientes());
	}
}
