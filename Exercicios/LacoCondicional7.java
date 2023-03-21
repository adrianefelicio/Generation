package Exercicios;

import java.util.Scanner;

public class LacoCondicional7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float numero1, numero2, resultado;
		int op;
		
		Scanner leia = new Scanner (System.in);
		
	
		System.out.println();
		System.out.println("\n 1 - Soma ");
		System.out.println("\n 2 - Substração ");
		System.out.println("\n 3 - Multiplicação ");
		System.out.println("\n 4 - Divisão ");
		
		op = leia.nextInt();
		
		switch (op) {
		
		case 1: 
			
			float soma;
			System.out.println("\n Digite o primeiro número: ");
			numero1 = leia.nextFloat();
			System.out.println("\n Digite o segundo número: ");
			numero2 = leia.nextFloat();
			
			soma = numero1 + numero2;
			System.out.println("\n o resultado é: " + soma);
		
		break;
		
		case 2:
			float subtração;
			System.out.println("\n Digite o primeiro número: ");
			numero1 = leia.nextFloat();
			System.out.println("\n Digite o segundo número: ");
			numero2 = leia.nextFloat();
			
			subtração = numero1 - numero2;
			System.out.println("\n o resultado é: " + subtração);
		break;
		
		case 3:
			float multiplicação;
			System.out.println("\n Digite o primeiro número: ");
			numero1 = leia.nextFloat();
			System.out.println("\n Digite o segundo número: ");
			numero2 = leia.nextFloat();
			
			multiplicação = numero1 * numero2;
			System.out.println("\n o resultado é: " + multiplicação);
		break;
		
		case 4: 
			float divisão;
			System.out.println("\n Digite o primeiro número: ");
			numero1 = leia.nextFloat();
			System.out.println("\n Digite o segundo número: ");
			numero2 = leia.nextFloat();
			
			divisão = numero1 / numero2;
			System.out.println("\n o resultado é: " + divisão);
		
		
		
		}
		
	}

}
