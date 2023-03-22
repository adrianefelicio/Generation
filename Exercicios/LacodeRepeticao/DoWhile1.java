package Exercicios;

import java.util.Scanner;

public class DoWhile1 {


		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int n, soma=0;
			
			do {
			System.out.println("Digite o número:");
			n = leia.nextInt(); 
				
					if ( n > 0 ) {
					 	soma+=n;
				 	}
			
			} while (n != 0);
			
			System.out.println("A soma dos números positivos é: "+soma);
			
			
		}

	}