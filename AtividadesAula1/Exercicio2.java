package AtividadesAula1;

import java.util.Scanner;

public class Exercicio2 {
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia, anos, meses, dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seus dias de vida: ");
		dia = leia.nextInt();
		
		anos = dia / 365;
		dias = dia % 365;
		meses = dias / 30;
		dia = dias % 30;
		dias = dia;
		
		System.out.println("Você tem "+anos+" anos, "+meses+" meses e "+dias+" dias.");
	
	}

}
