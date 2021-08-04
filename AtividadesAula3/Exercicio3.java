package AtividadesAula3;
import java.util.Scanner;

public class Exercicio3 {
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int i=0, ouro=0, porcelana=0;
		
		
		while (i!=-99)
		{
			System.out.println("Digite a idade: ");
			i = leia.nextInt();
			if (i < 21 && i > 0)
			{
				porcelana++;
			}
			else if(i > 50)
			{
				ouro++; 
			}
		}
		
		System.out.println("Quantidade de pessoas com menos de 21 anos: "+porcelana);
		System.out.println("Quantidade de pessoas com mais de 50 anos: "+ouro);

	}

}
