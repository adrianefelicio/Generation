package Exercicios;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		int numeros[][] = new int [3][3];
		int l, c, diagS, diagSomaP = 0, diagSomaS=0;
		Scanner leia = new Scanner (System.in);
		
		for (l=0; l<3; l++) {
			for (c =0; c<3; c++) {
				System.out.println("\n Digite os números: ");
				numeros[l][c] = leia.nextInt();
				
			}
		}
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				if (l == c) {
					System.out.println("\n O número " + numeros[l][c] + " é da diagonal principal");
					diagSomaP += numeros[l][c];
				}
				} 
			}
			for (l=0; l<3; l++) {
				for(c=0; c<3; c++) {
					if(l + c == 3 - 1) {
						System.out.println("\n O número " + numeros[l][c] + " é da diagonal secundária! ");
						diagSomaS += numeros[l][c];
				}
			}
		}
		System.out.println("\n A soma da Diagonal Principal é : " + diagSomaP);
		System.out.println("\n A soma da diagonal secundária é : " + diagSomaS) ;
		
		
		
		
	 }
	 
}
