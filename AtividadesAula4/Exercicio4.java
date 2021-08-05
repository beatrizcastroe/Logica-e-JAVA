package AtividadesAula4;

import java.util.Scanner;

public class Exercicio4 {
/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
 * Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
Na terceira opção o valor da constante deve ser lido e o resultado da adição da 
constante deve ser armazenado na própria matriz.
*/
	public static void main(String[] args) {
		float [][] A = new float [2][2];
		float [][] B = new float [2][2];
		float [][] C = new float [2][2];
		int opcoes, constante;
		
		Scanner leia = new Scanner (System.in);
		
		for (int l=0; l<2; l++) {
			for (int c=0; c<2; c++) {
				System.out.println("Digite os valores da matriz A: ");
				A [l][c] = leia.nextInt();
			}
		}
		for (int l=0; l<2; l++) {
			for (int c=0; c<2; c++) {
				System.out.println("Digite os valores da matriz B: ");
				B [l][c] = leia.nextInt();
			}
		}
		
		System.out.println("\t OPÇÕES: \n");
		System.out.println("\n(1) somar as duas matrizes \r\n"
				          + "\n(2) subtrair a primeira matriz da segunda \r\n"
				          + "\n(3) adicionar uma constante as duas matrizes\r\n"
				          + "\n(4) imprimir as matrizes ");
		opcoes = leia.nextInt();
		
		switch (opcoes) {
		
		case 1: 
			//somar as duas matrizes
			System.out.println("Soma da matriz A + B = ");
			for (int l=0; l<2; l++) {
				for (int c=0; c<2; c++) {
					C [l][c] = A [l][c] + B [l][c];
				}
			}
			for (int l=0; l<2; l++) {
				System.out.println();
				for (int c=0; c<2; c++) {
					System.out.print(+C[l][c]+" ");
				}
			}
		break;	
		case 2: 
			//subtrair a primeira matriz da segunda
			System.out.println("Subtração das matrizes: ");
			for (int l=0; l<2; l++) {
				for (int c=0; c<2; c++) {
					C [l][c] = A [l][c] - B [l][c];
				}
			}

			for (int l=0; l<2; l++) {
				System.out.println();
				for (int c=0; c<2; c++) {
					System.out.print(+C[l][c]+" ");
				}
			}
			
		break;
		case 3:
			// adicionar uma constante as duas matrizes
			System.out.println("Digite um valor para a constante: ");
			constante = leia.nextInt();
			for (int l=0; l<2; l++) {
				for (int c=0; c<2; c++) {
					C [l][c] = constante;
				}
			}
			for (int l=0; l<2; l++) {
				System.out.println();
				for (int c=0; c<2; c++) {
					System.out.print(+C[l][c]+" ");
				}
			}
		break;	
		case 4: 
			//imprimir as matrizes 
			System.out.println("Matriz A: \n");
			for (int l=0; l<2; l++) {
				System.out.println();
				for (int c=0; c<2; c++) {
					System.out.print(+A[l][c]+" ");
				}
			}
			System.out.println("Matriz B: \n");
			for (int l=0; l<2; l++) {
				System.out.println();
				for (int c=0; c<2; c++) {
					System.out.print(+B[l][c]+" ");
				}
			}
			break;
		}
	}
}