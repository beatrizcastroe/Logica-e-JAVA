package AtividadesAula1;

import java.util.Scanner;

public class Exercicio6 {
	//6. Construa um programa, tendo como dados de entrada dois pontos
	//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula D = raiz de (x2-x1)^2+(y2-y1)^2//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double px1, px2, py1, py2, d;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor de px1: ");
		px1=leia.nextDouble();
		System.out.println("Digite o valor de px2: ");
		px2=leia.nextDouble();
		System.out.println("Digite o valor de py1: ");
		py1=leia.nextDouble();
		System.out.println("Digite o valor de py2: ");
		py2=leia.nextDouble();
		
		d= (Math.pow(px2-px1, 2.0))+(Math.pow(py2-py1, 2.0));
		d = Math.sqrt(d);
		
		System.out.println("A distância entre eles é de: "+d);
		
	}

}
