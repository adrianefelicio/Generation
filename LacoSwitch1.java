package Exercicios;

import java.util.Scanner;

public class LacoSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qt, prod;
		double preco;
		double total;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n 1 - Cachorro Quente : R$ 10.00");
		System.out.println("\n 2 - X-Salada        : R$ 15.00");
		System.out.println("\n 3 - X-Bacon         : R$ 18.00");
		System.out.println("\n 4 - Bauru           : R$ 12.00");
		System.out.println("\n 5 - Refrigerante    : R$  8.00");
		System.out.println("\n 6 - Suco de Laranja : R$ 13.00");
		
		
	    System.out.println("\n Código do Produto: ");
		prod = leia.nextInt();
		
		System.out.println("\n Quantidade: ");
		qt = leia.nextInt(); 

		
		switch (prod) {
		
		case 1: 
			preco = 10.00;
			total = preco * qt;
			System.out.println("\n Produto: Cachorro Quente \n Valor total: R$ " + total);
		break;
		
		case 2: 
			preco = 15.00;
			total = preco * qt;
			System.out.println("\n Produto: X-Salada \n Valor total: R$ " + total);
		break;
		case 3:
			preco = 18.00;
			total = preco * qt;
			System.out.println("\n Produto: X-Bacon \n Valor total: R$ " + total);
		break;
		case 4:
			preco = 12.00;
			total = preco * qt;
			System.out.println("\n Produto: Bauru \n Valor total: R$ " + total);
		break;
		case 5: 
			preco = 8.00;
			total = preco * qt;
			System.out.println("\n Produto: Refrigerante \n Valor total: R$ " + total);
		break;
		case 6:
			preco = 13.00;
			total = preco * qt;
			System.out.println("\n Produto: Suco De Laranja \n Valor total: R$ " + total);
		break;
			
		default: 
			System.out.println("\n Código não Encontrado!");
		
		}
	}

}
