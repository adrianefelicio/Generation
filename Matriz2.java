package Exercicios;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		
		int l, c;
		float notas [][] = new float [3][3];
		float soma[] = new float [3];
		float medial [] = new float [3];
		float somaMedia=0;
		
		
		Scanner leia = new Scanner (System.in);
		
		for (l=0; l<3; l++) {
			for (c=0; c<3; c++) {
				System.out.println("\n Digite as notas dos Alunos: ");
				notas[l][c] = leia.nextFloat();
				somaMedia += notas[l][c];
				soma[l] = somaMedia;
			}
			somaMedia = 0;
			
		}
		for (l=0; l<3; l++) {
			medial[l] = soma[l] / 4;
		System.out.println("\n A média do Aluno é: " + medial[l]);	
		}
	}

}
