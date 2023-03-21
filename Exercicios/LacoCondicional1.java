package Exercicios;

import java.util.Scanner;

public class LacoCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A, B, C;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o valor de A: ");
		A = leia.nextInt();
		System.out.println("\n Digite o valor de B: ");
		B = leia.nextInt();
		System.out.println("\n Digite o valor de C: ");
		C = leia.nextInt();
		
		if ((A + B) > C ) {
			System.out.println("\n A soma de A+B é maior do que C.");		
		} else if ((A + B) < C ) {
			System.out.println("\n A soma de A+B é menor do que C.");
		} else {
			System.out.println("\n A soma de A+B é igual a C.");
		}
		
		
		
		
	}

}
