package Exercicios;

import java.util.Scanner;

public class LacoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, idadeMenor=0, idadeMaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.println("\n Entre com a sua idade");
			idade = leia.nextInt();
				if(idade <21 && idade >=0){
				idadeMenor++;
				}else if(idade > 50) {
					idadeMaior++;
				}
		}
		System.out.println("\n O total de pessoas menor que 21 anos é: "+idadeMenor);
		System.out.println("\n O total de pessoas maior que 50 anos é: "+idadeMaior);
	}

}