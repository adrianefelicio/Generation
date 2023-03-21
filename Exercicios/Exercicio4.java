package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o número1: ");
		n1 = leia.nextFloat();
		System.out.println("\n Digite o numero2: ");
		n2 = leia.nextFloat();
		System.out.println("\n Digite o número3: ");
		n3 = leia.nextFloat();
		System.out.println("\n Digite o número4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\n DIFERENÇA: %.1f", diferenca);
	}

}
