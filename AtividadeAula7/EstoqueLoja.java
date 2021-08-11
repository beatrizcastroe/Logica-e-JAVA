package AtividadeAula7;


import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		int op;
		
		Scanner ler = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\t\tMenu: ");
			System.out.println("---------------------------------------");
			System.out.println("\n(1) Adicionar produtos ao estoque"
					+ "\n(2) Remover produtos do estoque"
					+ "\n(3) Atualizar produto do estoque"
					+ "\n(4) Mostrar todos os produtos do estoque"
					+ "\n(0) Encerrar");
			System.out.println("---------------------------------------");
			System.out.println("\n\t\tDigite uma opção: ");
			op = ler.nextInt();
			
			switch (op)
			{
			case 1: 
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto a ser removido: ");
				String produtor = ler.nextLine();
				if (estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nEste produto não se encontra no estoque.");
				}
			
			case 3: 
				ler.nextLine();
				System.out.println("\nDigite o produto que quer atualizar");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto "+verifica+" : ");
				String novo = ler.nextLine();
				
				if (estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("Produto não encontrado.");
				}
				System.out.println("\n"+estoque);
				break;
				
			case 4: 
				System.out.println("\n Produtos do estoque: \n");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nVocê finalizou o programa, volte sempre! :D");
			}
		}
		while(op!= 0);
	}

}

