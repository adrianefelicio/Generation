package Exercicios;

import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {
		
		int n1[][] = new int [3][2];
		int n2[][] = new int [3][2];
		int m1[][] = new int [3][2];
		int m2[][] = new int [3][2];
		int l, c, numeros;
		
		Scanner leia = new Scanner (System.in);
		
		for(l= 0; l < 3; l++) {
			for (c=0; c<2; c++) {
				System.out.println("\n Digite os números para preencher a Matriz n1: ");
				n1[l][c]= leia.nextInt();
			}
		}
		for(l= 0; l < 3; l++) {
			for (c=0; c<2; c++) {
				System.out.println("\n Digite os números para preencher a Matriz n1: ");
				n2[l][c]= leia.nextInt();
			}
		}
		
		for(l= 0; l < 3; l++) {
			for (c=0; c<2; c++) {
			
				m1[l][c] = n1[l][c] + n2[l][c];
				System.out.println("\n A Matriz M1 (Soma entre matriz N1 e matriz N2) é: " + m1[l][c]);
			}
		}
		
		for(l= 0; l < 3; l++) {
			for (c=0; c<2; c++) {
			
				m2[l][c] = n1[l][c] - n2[l][c];
				System.out.println("\n A Matriz M2 (Subtração entre matriz N1 e matriz N2) é: " + m2[l][c]);
			}
		}
		
		
	}

}
