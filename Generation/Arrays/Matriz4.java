package Exercicios;

import java.util.Scanner;

public class Matriz4 {

	public static void main(String[] args) {
		int num[][] = new int [3][3];
		int somaTotal=0;
		int l, c = 0, somaDiagP = 0, somaDiagS = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for (l=0; l<3; l++) {
			for (c=0; c<3; c++) {
				System.out.println("\n Digite um número:  ");
				num[l][c] = leia.nextInt();
				
				
			}
		}
		for (l=0; l<3; l++) {
			for (c=0; c<3; c++) {
				
			somaTotal += num[l][c];
				
				
			}
		}
		System.out.println("\n Soma da matriz: " +somaTotal);
		
		for (l=0; l<3; l++ ) {
			for (c=0; c<3; c++) {
				if (l == c) {
					somaDiagP += num[l][c];
					
				}
			}
			
		}
		System.out.println("\n Soma da Diagonal Principal: " + somaDiagP);

	}

}
