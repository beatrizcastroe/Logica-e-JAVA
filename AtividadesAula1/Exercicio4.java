package AtividadesAula1;

import java.util.Scanner;

public class Exercicio4 {
/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		double a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a=leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b=leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c=leia.nextInt();
		
		r=Math.pow(a+b, 2);
		s=Math.pow(b+c, 2);
		d=((r+s)/2);
		
		System.out.println("D = "+d);
		

	}

}
