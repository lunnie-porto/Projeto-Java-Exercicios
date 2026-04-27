package Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class ExercicioFila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		int opcao = -1;
		
		while (opcao != 0) {
			
			System.out.println("====================================================\n");
			System.out.println("      1- Adicionar Cliente na Fila ");
			System.out.println("      2- Listar todos os Clientes ");
			System.out.println("      3- Retirar Cliente da Fila ");
			System.out.println("      0- Sair ");
			System.out.println("=====================================================\n");
			System.out.println("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila:");
				Iterator<String> i = fila.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				
				System.out.println("\nCliente adicionado.");
				break;
			}
			
			case 2:
			if (fila.isEmpty()) {
				System.out.println("\nA fila está vazia!");
			} else {
				System.out.println("\nLista de Clientes na Fila: ");
				Iterator<String> i = fila.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				
				}
				break;
				
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					String chamado = fila.poll();
					System.out.println("\nO Cliente " + chamado + " foi Chamado!");
				}
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
				
			}
		}
		
			leia.close();
			
			}
		}
			
	
			
		
		

	


