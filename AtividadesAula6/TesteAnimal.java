package AtividadesAula6;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		int ani; 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite qual animal você deseja: \n1- Cachorro \n2- Cavalo \n3-Preguiça \n");
		ani = leia.nextInt();
		
		switch (ani) {
		
		case 1: 
			Cachorro cachorro = new Cachorro ("Tony", 2, true, true); 
			cachorro.imprimirInfo();
			break;
			
		case 2:
			Cavalo cavalo = new Cavalo ("Cavalinho", 11, true, true);
			cavalo.imprimirInfo();
			break;
			
		case 3:
			Preguica piriguicinha = new Preguica ("Pripri", 11, true, true);
			piriguicinha.imprimirInfo();
			break;
		}

	}

}
