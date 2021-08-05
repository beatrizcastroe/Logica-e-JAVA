package AtividadesAula4;

public class Exercicio1 {
	/*Faça um programa que possua um vetor denominado A
 que armazene 6 números inteiros. O programa deve executar os seguintes passos:
 (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
 (b)Armazene em uma variável inteira (simples) a soma entre os valores das posições
 A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
 (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
 (d) Mostre na tela cada valor do vetor A, um em cada linha. */
	
	public static void main(String[] args) {
		
		int [] A = {1,0,5,-2,-5,7};
		int soma;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("A soma entre A[0] que é "+A[0]+" + A[1] que é "+A[1]+" + A[5] que é "+A[5]+" = "+soma);
		
		A [4] = 100;
		
		for (int i=0; i<6; i++)
		{
			System.out.println("Vetor A ["+i+"] = "+A[i]);
		}
		
	}
}
 
