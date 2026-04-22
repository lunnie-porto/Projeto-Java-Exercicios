package SwitchCase;

import java.util.Scanner;

public class SwitchCaseExercicio1 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	int codigo, quantidade;
	
	System.out.println("### Menu Lanchonete ###");
	
	System.out.print("Digite o código do produto (1 a 6): ");
	codigo = leia.nextInt();
	
	System.out.print("Digite a quantidade: ");
	quantidade = leia.nextInt();
	
	switch (codigo) {
	
	case 1:
		System.out.println("\nProduto: Cachorro Quente");
		System.out.println("Valor total: R$ " + (quantidade * 10.00));
		break;
	case 2:
		System.out.println("\nProduto: X-Salada");
		System.out.println("Valor total: R$ " + (quantidade * 15.00));
		break;
	case 3:
		System.out.println("\nProduto: X-Bacon");
		System.out.println("Valor total: R$ " + (quantidade * 18.00));
		break;
	case 4:
		System.out.println("\nProduto: Bauru");
		System.out.println("Valor total: R$ " + (quantidade * 12.00));
		break;
	case 5:
		System.out.println("\nProduto: Refrigerante");
		System.out.println("Valor total: R$ " + (quantidade * 8.00));
		break;
	case 6:
		System.out.println("\nProduto: Suco de Laranja");
		System.out.println("Valor total: R$ " + (quantidade * 13.00));
		break;
		
	default:
        System.out.println("Opção inválida!");
	}
	
	

	}

}
