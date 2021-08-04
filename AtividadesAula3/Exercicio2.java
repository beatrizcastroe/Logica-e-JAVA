package AtividadesAula3;
import java.util.Scanner; 

public class Exercicio2 {
//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num, par=0, impar=0, x;

		for (x=1; x<11; x++)
		{
			System.out.println("Digite 1 número: ");
			num = leia.nextInt();
			if (num % 2 == 0)
			{
				par ++;
			}
			else
			{
				impar ++;
			}
		}
		System.out.println("Existem "+par+" números pares e "+impar+" números impares.");
	}

}
