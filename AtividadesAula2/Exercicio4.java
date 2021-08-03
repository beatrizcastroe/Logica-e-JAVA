package AtividadesAula2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		double i, raiz, pow;
		
		System.out.println("Digite um número qualquer: ");
		i = leia.nextDouble();
		
		if (i %2 == 0)
		{
			System.out.println("O número é par");
			raiz = Math.sqrt(i);
			System.out.println("Sua raiz é: "+raiz);
		}
		else if (i %2 != 0)
		{
			System.out.println("O número é impar.");
			pow = Math.pow(i, 2);
			System.out.println("Sua potência ao quadrado é: "+pow);
		}
	}
}
