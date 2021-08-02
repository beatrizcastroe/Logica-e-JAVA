package AtividadesAula1;

import java.util.Scanner;

public class Exercicio7 {
	//Um sistema de equações lineares do tipo: ax+bx=c dx+ex=f pode ser resolvido segundo mostrado abaixo: 
	//x= ce-bf/ae-bd y=af-cd/ae-bd Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
	
	public static void main(String[] args) {
		int a, b, c, d, e1, f, x, y;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("\n Digite os coeficientes para calculo: a: ");
		a= leia.nextInt();
		System.out.println("\n Digite os coeficientes para calculo: b:");
		b= leia.nextInt();
		System.out.println("\n Digite os coeficientes para calculo: c:");
		c= leia.nextInt();
		System.out.println("\n Digite os coeficientes para calculo: d:");
		d= leia.nextInt();
		System.out.println("\n Digite os coeficientes para calculo: e:");
		e1= leia.nextInt();
		System.out.println("\n Digite os coeficientes para calculo: f:");
		f= leia.nextInt();
		
		
		
		x=((c*e1)-(b*f))/((a*e1)-(b*d));
		y=((a*f)-(c*d))/((a*e1)-(b*d));
		
		System.out.println("\n X é igual a:"+x);
		System.out.println("\n O Y é igual a: "+y);
		
		
		
		
	}
}
