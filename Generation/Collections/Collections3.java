package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer >numeros = new HashSet();
		
		Scanner leia = new Scanner (System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("\n Digite o " + (i+1) + "° número: ");
			int num = leia.nextInt();
			
			numeros.add(num);
			
				
				}
		
			Iterator<Integer> inumeros = numeros.iterator(); 
			
			while(inumeros.hasNext()) { //enquanto o iterator tiver algo para ser lido: 
				System.out.println("\n" + inumeros.next());
			}
		
	}
}