package AtividadesAula2;
import java.util.*;
public class Exercicio3 {

	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int i;
	
		System.out.println("Digite a sua idade: ");
		i = leia.nextInt();
	
		if (i >= 10 && i <=14) {
			System.out.println("\nCategoria Infantil.");
		}
		else if (i >= 15 && i <= 17) {
			System.out.println("\nCategoria Juvenil");
		}	
		else if (i >= 18 && i <= 25){
			System.out.println("\nCategoria Adulto");
		}	
		else 
		{
			System.out.println("\nERRO!");
		}

	}
}