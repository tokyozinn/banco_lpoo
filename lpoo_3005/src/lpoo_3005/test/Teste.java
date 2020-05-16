package lpoo_3005.test;
import lpoo_3005.banco.Banco;
import lpoo_3005.banco.TipoContas;

public class Teste {

	
	public static void main(String[] args) throws Exception {
		Banco b = new Banco();
		
		b.cadastraCliente("1", "Ana");
		b.cadastraCliente("2", "Bia");
		b.cadastraCliente("3", "Carol");
		b.cadastraCliente("4", "Duda");
		b.cadastraCliente("5", "Flavia");
		b.cadastraCliente("6", "Gabi");
		b.cadastraCliente("7", "Joana");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		b.cadastraCliente("8", "Irene");
		
		b.setEndereco("1", "Rua jafágá", 14);

		
		b.setConta("1", TipoContas.STANDARD);
		b.setChequeEspecial("1", 5000);
		b.depositar("1", 2000);
		b.sacar("1", 6000);
		
		System.out.println(b.getClientes());
	}
}
