package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

      int escolha;
      String livro;
      
      Scanner leia = new Scanner (System.in);
      
      Stack <String> Pilha = new Stack<String>();
      
      do {
    	  
    	  System.out.println("\n\t Bem vindo à Bibioteca Generation: ");
    	  
    	  System.out.println("\n **********************************************");
    	  System.out.println("\n 1 - Adicionar Livro:   ");
    	  System.out.println("\n 2 - Listar todos os livros: ");
    	  System.out.println("\n 3 - Retirar Livro da Pilha: ");
    	  System.out.println("\n 0 - Sair ");
    	  System.out.println("\n **********************************************");
    	  
    	  System.out.println("\n Digite a opção: ");
    	  System.out.println();
    	  escolha = leia.nextInt();
    	  
    	  switch (escolha) {
    	  
    	  case 1: 
    		  leia.nextLine();
    		  System.out.println("\n Adicionar novo livro à Pilha: ");
    		  livro = leia.nextLine();
    		  Pilha.add(livro);
    		  System.out.println("\n Livro adicionado!");
    	 break;
    	 
    	  case 2: 
    		  System.out.println("\n Lista de Livros: "+Pilha);
    		  System.out.println();
    	break;
    	  case 3:
    		  System.out.println();
    		  if(Pilha.isEmpty() == true) {
    			  System.out.println();
    			  System.out.println("\n A pilha de livros está vazia!");
    			  
    		  } else { 
    			  System.out.println("\n Pegar um livro da Pilha " +Pilha.peek());
    			  Pilha.pop();
    		  } 
    	  case 0: 
    		  	System.out.println("\n Programa Finalizado! ");
    		  	
    	 default: 
    		 System.out.println();
    		  
    	  }
    	  
    	  
    	  
      } while(escolha!=0);
		
		
	}

}
