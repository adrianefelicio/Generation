package Exercicios;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[10]; 
		int numero, encontrado, x, i=10;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("\n AVISO: A contagem de posições é a partir do 0;");
		
		for (x=0; x< 10; x++) {
			System.out.println("\n Digite um número da lista: ");
			num[x] = leia.nextInt();
			
		
		} System.out.println("\n Digite um número: ");
		  numero = leia.nextInt();
		  
		  for (x=0; x<10; x++) {
			  if(num[x]==numero) {
				  System.out.println("\n A posição do número digitado é: " + x);
				  i++;
			  }
		  } if (i == 0) {
			  System.out.println("\n Número não encontrado! ");
		  }
	}

}
