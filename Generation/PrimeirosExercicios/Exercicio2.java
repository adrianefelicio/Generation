package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, mediafinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a Nota 1:");
		nota1 = leia.nextFloat();
		System.out.println("\n Digite a Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("\n Digite a Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("\n Digite a Nota 4: ");
		nota4 = leia.nextFloat();
		
		mediafinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("\n A média final é: %.1f" ,mediafinal);
		
	}

}
