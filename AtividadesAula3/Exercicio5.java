package AtividadesAula3;
import java.util.Scanner;

public class Exercicio5 {
	/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int i, soma=0;
		
		do 
		{
			System.out.println("DIGITE UM NÚMERO DO TECLADO: ");
			i = leia.nextInt();
			
			soma = soma + i;
			
		}
		while (i != 0);
		System.out.println("Soma dos números = "+soma);
	}

}
