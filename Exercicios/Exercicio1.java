package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario1, salario2, abono;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o Salário: ");
		salario1 = leia.nextDouble();
		System.out.println("\n Digite o Abono: ");
		abono = leia.nextDouble();
		
		salario2 = salario1 + abono;
		
		System.out.printf("\n Seu novo salário é: R$  %.3f" ,salario2);
		
	}

}
