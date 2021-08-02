package AtividadesAula1;

import java.util.Scanner;

public class Exercicio5 {
	//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,//
	//respectivamente.//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1,nota2,nota3,media,mp;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escreva a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Escreva a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Escreva a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		mp = (nota1*2+nota2*3+nota3*5)/10;
		
		System.out.println("Média: "+media);
		System.out.printf("\n Média arredondada: %2.2f", media);
		System.out.println("Média ponderada: "+mp);
	}

}
