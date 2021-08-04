package AtividadesAula3;

import java.util.Scanner;

public class Exercício4 {
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, sexo, carac, hagre=0, mner=0, ocalm=0, mais40nerv=0, menos18calm=0, cont=0;
		int m=0, h=0, o=0, calmo=0, nerv=0, agre=0;
		
		while (cont<150)
		{
			System.out.println("Digite sua idade: ");
			idade=leia.nextInt();
			System.out.println("Digite seu sexo 1 para feminino, 2 para masculino e 3 para outros: ");
			sexo=leia.nextInt();
			System.out.println("Digite 1 para calmo, 2 para nervoso e 3 para agressivo: ");
			carac=leia.nextInt();
			
			switch (sexo) 
			{
				case 1:
					m++;
					break;
				case 2: 
					h++;
					break;
				case 3:
					o++;
					break;
			}
			switch (carac)
			{
				case 1:
					calmo++;
					break;
				case 2:
					nerv++;
					break;
				case 3: 
					agre++;
					break;
			}
			if (sexo == 1 && carac == 2)
			{
				mner++;
			}
			else if (sexo == 2 && carac == 3)
			{
				hagre++;
			}
			else if (sexo == 3 && carac == 1)
			{
				ocalm++;
			}
			else if (idade > 40 && carac == 2)
			{
				mais40nerv++;
			}
			else if (idade < 18 && carac == 1)
			{
				menos18calm++;
			}
			cont ++;
		}
		
		System.out.println("Número de pessoas calmas: "+calmo);
		System.out.println("Número de mulheres nervosas: "+mner);
		System.out.println("Número de seguidores do Bolsonaro: "+hagre);
		System.out.println("Número de outros calmos: "+ocalm);
		System.out.println("Número de maiores de 40 anos nervosos: "+mais40nerv);
		System.out.println("Número de menores de 18 anos calmos: "+menos18calm);
	}

}
