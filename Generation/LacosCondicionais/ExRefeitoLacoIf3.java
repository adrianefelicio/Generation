package Exercicios;

import java.util.Scanner;

public class ExRefeitoLacoIf3 {

	public static void main(String[] args) {
		
	
	int idade;
	String nome;
	boolean doacao = true;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("\n Digite o nome do doador: ");
	nome = leia.nextLine();
	
	System.out.println("\n Digite a Idade do doador: ");
	idade = leia.nextInt();
		

	System.out.println("\n Primeira doação de sangue? ");
	doacao = leia.hasNext();
	
	if (idade >= 18 && idade < 60) {
		System.out.println("\n " + nome + " está apto(a) para doar sangue!");
	} else if (idade > 60 && idade <= 69 && doacao == false) {
		System.out.println("\n " + nome + " está apto(a) para doar sangue!");
	} else {
		System.out.println("\n " + nome + " não está apto(a) para doar sangue!");
	}
	
	
		}
	}


