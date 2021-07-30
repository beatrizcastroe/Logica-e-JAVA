programa
{
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		inteiro matriz[3][3], x, y, soma=0, somad=0
		
		para(x=0;x<3;x++)
		{
			para(y=0;y<3;y++)
			{
				escreva("\nDigite os valores da sua matriz: ")
				leia (matriz[x][y])
				soma+=matriz[x][y]
				escreva(" ", matriz[x][y]," + ")

				se(x == y)
				{
					somad+=matriz[x][y]
				}
			}
		}
		escreva("\nA soma de todos os valores da matriz é: ",soma)
		escreva("\nA soma dos valores da diagonal principal é: ",somad)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */