package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collections1 {

	public static void main(String[] args) {
	
		ArrayList cores = new ArrayList();
		Scanner leia = new Scanner (System.in);
		
		
		
		for (int i=0; i<5; i++) {
			System.out.println("\n Digite a cor que você deseja adicionar à lista: ");
			String cor = leia.nextLine();
			
			
			cores.add(cor);
			
			
			
		}
		
		System.out.println("\n Todas as cores adicionadas: " + cores);
		
		Collections.sort(cores);
		System.out.println("\n Cores da lista em ordem alfabética: " + cores);
	}

}
