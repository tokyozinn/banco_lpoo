package lpoo_3005;

public class Teste {

	
	public static void main(String[] args) {
		Banco b = new Banco();
		
		b.cadastraCliente("1", "Ana");
		b.cadastraCliente("2", "Bia");
		b.cadastraCliente("3", "Carol");
		b.cadastraCliente("4", "Duda");
		b.cadastraCliente("5", "Flavia");
		b.cadastraCliente("6", "Gabi");
		b.cadastraCliente("7", "Joana");
		b.cadastraCliente("8", "Irene");
		
		b.setEndereco("1", "Rua da Flavia", 12);

		System.out.println(b.getClientes());
	}
}
