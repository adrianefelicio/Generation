package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {

      int escolha;
      String nome;
      
      Scanner leia = new Scanner (System.in);
      
      Queue<String> fila = new LinkedList<String>();
      
      do {
    	  
    	  System.out.println("\n\t Bem vindo ao Banco Generation: ");
    	  
    	  System.out.println("\n **********************************************");
    	  System.out.println("\n 1 - Adicionar Cliente:   ");
    	  System.out.println("\n 2 - Listar todos os clientes: ");
    	  System.out.println("\n 3 - Retirar cliente da fila: ");
    	  System.out.println("\n 0 - Sair ");
    	  System.out.println("\n **********************************************");
    	  
    	  System.out.println("\n Digite a opção: ");
    	  System.out.println();
    	  escolha = leia.nextInt();
    	  
    	  switch (escolha) {
    	  
    	  case 1: 
    		  leia.nextLine();
    		  System.out.println("\n Digite o cliente que deseja: ");
    		  nome = leia.next();
    		  fila.add(nome);
    		  System.out.println("\n Nome adicionado!");
    	 break;
    	 
    	  case 2: 
    		  System.out.println("\n Lista de clientes: "+fila);
    		  System.out.println();
    	break;
    	  case 3:
    		  System.out.println();
    		  if(fila.isEmpty() == true) {
    			  System.out.println();
    			  System.out.println("\n A lista está vazia!");
    			  
    		  } else { 
    			  System.out.println("\n Pegar um cliente da lista " +fila.poll());
    		  } 
    		  
    	  case 0: 
    		  	System.out.println("\n Programa Finalizado! ");
    		  	
    	 default: 
    		 System.out.println();
    		  
    	  }
    	  
    	  
    	  
      } while(escolha!=0);
		
		
	}

}
