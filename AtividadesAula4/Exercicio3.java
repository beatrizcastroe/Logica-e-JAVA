package AtividadesAula4;

import java.util.Scanner;

public class Exercicio3 {
	
	//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 public static void main(String[] args) {
		int [][] m = new int [3][3];
		int cont = 0;
		Scanner leia = new Scanner (System.in);
		
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				System.out.println("Digite os valores da matriz: ");
				m [l][c] = leia.nextInt();
				if (m [l][c] > 10) {
					cont ++;
				}
			}	
		}
		System.out.println("\nMatriz 3X3: ");
		for (int l=0; l<3; l++) {
			System.out.println();
			for (int c=0; c<3; c++) {
				System.out.print(m[l][c]+"\t");
			}
		}
		System.out.println("Valores maiores que 10: "+cont);	 
	}
}
