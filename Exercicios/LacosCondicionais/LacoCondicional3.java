package Exercicios;

import java.util.Scanner;

public class LacoCondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade;
		boolean var;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o Nome do doador: ");
		nome = leia.nextLine();
		System.out.println("\n Digite a Idade do doador: ");
		idade = leia.nextInt();
		System.out.println("\n Primeira doação de sangue? ");
		var = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 60 && var == true) {
			System.out.println("\n" + nome + " está apto(a) para doar sangue!");
		} else if (idade > 60 && idade < 69 && var == true) {
			System.out.println("\n" + nome + " não está apto(a) para doar sangue!");
		} else if ( idade > 60 && idade <= 69 && var == false){
			System.out.println("\n" + nome + " está apto(a) para doar sangue!");
		} else {
			System.out.println("\n" + nome + " não está apto(a) para doar sangue!");
		}
	} 

}
