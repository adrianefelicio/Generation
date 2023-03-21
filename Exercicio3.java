package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double SalarioBruto, AdicionalNoturno, HorasExtras, Descontos, SalarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o Salário Bruto: R$ ");
		SalarioBruto = leia.nextDouble();
		System.out.println("\n Digite o Adicional Noturno: R$");
		AdicionalNoturno = leia.nextDouble();
		System.out.println("\n Digite as Horas Extras: ");
		HorasExtras = leia.nextDouble();
		System.out.println("\n Digite os Descontos: R$: ");
		Descontos = leia.nextDouble();
		
		SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras * 5) - Descontos;
		
		System.out.printf("\n Salário Líquido: R$ %.3f", SalarioLiquido);
	}

}
