programa
{
	inclua biblioteca Matematica
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: 
	 * Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
	*  Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2. */
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6], linha, coluna

		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nDigite os valores de N1 ")
				leia(N1[linha][coluna])
			}
		}
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nDigite os valores de N2 ")
				leia(N2[linha][coluna])
			}
		}
		para(linha=0;linha<4;linha++){
			para(coluna=0;coluna<6;coluna++){
				M1 [linha][coluna] = N1[linha][coluna]+N2[linha][coluna]
				escreva("\n",N1[linha][coluna]," + ",N2[linha][coluna]," = ",M1[linha][coluna])
			}
		}

		para(linha=0;linha<4;linha++){
			para(coluna=0;coluna<6;coluna++){
				M2 [linha][coluna] = N1[linha][coluna]-N2[linha][coluna]
				escreva("\n",N1[linha][coluna]," - ",N2[linha][coluna]," = ",M2[linha][coluna])
			}
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M1, 12, 30, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */