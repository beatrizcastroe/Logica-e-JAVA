package AtividadesAula5;

public class TesteCliente {

		public static void main(String[] args) {
			
			Cliente adega = new Cliente ("Beatriz Castro", "Campinas", "Brasil");
			
			System.out.println("\n~~ NOVOS CLIENTES DA FORNECEDORA ~~~\n");
			adega.imprimirInfo();
			
		}
}
