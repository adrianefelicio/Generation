package Exercicios;

import java.util.Scanner;

public class LacoCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite um número: ");
		num = leia.nextInt();
		
		
		if (num > 0 && num % 2 == 0) {
			
			System.out.println("\n O número " + num + " é par e positivo!");
		} else if (num < 0 && num % 2 != 0) {
			System.out.println("\n O número " + num + " é ímpar e negativo");
		} else if (num < 0 && num % 2 == 0) {
			System.out.println("\n O número " + num + " é par e negativo");
		} else if (num > 0 && num % 2 != 0) {
			System.out.println("\n O número " + num + " é ímpar e positivo");
		} else {
			System.out.println("ERRO!");
		}
			
	}

}
