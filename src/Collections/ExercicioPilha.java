package Collections;

import java.util.Stack;
import java.util.Scanner;
import java.util.Iterator;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		int opcao = -1;
		while (opcao != 0) {

		System.out.println("*****************************************************\n");
		System.out.println("      1- Adicionar Livro na pilha ");
		System.out.println("      2- Listar todos os Livros ");
		System.out.println("      3- Retirar Livro da pilha ");
		System.out.println("      0- Sair ");
		System.out.println("*****************************************************\n");
		System.out.println("Entre com a opção desejada: ");

		opcao = leia.nextInt();
		leia.nextLine();

		switch (opcao) {
		case 1: {
			System.out.print("Digite o nome: ");
			String nome = leia.nextLine();
			pilha.push(nome);
			System.out.println("\nPilha:");
			Iterator<String> i = pilha.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
			}
			System.out.println("\nLivro adicionado!");
			break;
		}
		case 2:
			if (pilha.isEmpty()) {
				System.out.println("\nA pilha está vazia!");
			} else {
				System.out.println("\nLista de Livros na Pilha: ");
				Iterator<String> i = pilha.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
			}
			break;
		
		
		case 3: {
            if (pilha.isEmpty()) {
                System.out.println("\nA Pilha está vazia!");
            } else {
                pilha.pop();
                System.out.println("\nPilha:");
                Iterator<String> i = pilha.iterator();
                while (i.hasNext()) {
                    System.out.println(i.next());
                }
                System.out.println("\nUm Livro foi retirado da pilha!");
            }
		break;
		}
		case 0:;
			System.out.println("\nPrograma Finalizado!");
			break;
		} 
		} 

		leia.close(); 
	} 
}
	
