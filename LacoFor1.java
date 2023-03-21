package Exercicios;

import java.util.Scanner;

public class LacoFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, x;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("\n Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1 < num2 ) {
			for (x=num1; x <= num2; x++) {
				if (x % 3 == 0 & x % 5 == 0) {
				System.out.println("\n " + x + " é multiplo de 3 e 5");
				} 
			}
		} else { 
			System.out.println("\n  O intervalo informado é inválido!");
		}
		
	} 
}
