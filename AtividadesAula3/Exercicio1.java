package AtividadesAula3;
public class Exercicio1 {

	//Informar todos os números de 1000 a 1999 que quando divididos por 11
	//obtemos resto = 5.
	
	public static void main(String[] args) {
		int x;
		
		System.out.println("Números de 1000 a 1999 que divididos por 11 tem resto = 5: ");
		
		for (x=1000; x<2000; x++)
		{
			if(x % 11 == 5)
			{
				System.out.printf("\n%d",x);
			}

		}
	}

}
