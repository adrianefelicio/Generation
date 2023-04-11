package Exercicios;

import java.util.Scanner;

public class ExRefeitoLacoIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a, b, c, soma1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o valor  de A: ");
		a = leia.nextInt();
		System.out.println("\n Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\n Digite o valor de C: ");
		c = leia.nextInt();
		
		soma1 = a + b;
		
		
		if ((a+ b) > c) {
			System.out.println("\n A soma de A+B: " + soma1 + " é maior que C: " + c );
		} else if ((a + b) < c ) {
			System.out.println("\n A soma de A+B: " + soma1 + " é menor que C: " + c);
		}else {
			System.out.println("\n A soma de A+B: " + soma1 + " é igual a C: " + c);
		}
	
	
	
	}

}
