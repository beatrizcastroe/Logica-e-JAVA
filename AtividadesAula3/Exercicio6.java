package AtividadesAula3;
import java.util.Scanner;
public class Exercicio6 {
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		int i, media, contm=0, soma=0;
		Scanner leia = new Scanner (System.in);
		
		do 
		{
			System.out.println("Digite um número: ");
			i = leia.nextInt();
			
			if (i %3 == 0 && i != 0)
			{
				soma += i;
				contm ++;
			}
		}
		while (i != 0);
		
		media = soma / contm;
		System.out.println("A média deles é: "+media);
	}

}
