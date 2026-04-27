package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		

		ArrayList<String> cores = new ArrayList <String>();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 5 cores:");
		for (int indice = 0; indice < 5; indice ++) {
			System.out.print("Cor " + (indice + 1) + ": ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
			System.out.println("\nListe todas as cores: ");
			for (int indice = 0; indice < cores.size(); indice++) {
				System.out.println(cores.get(indice));
			}
				cores.sort(null);
				
				System.out.println("\nOrdenar as cores: "); 
					for (int indice = 0; indice < cores.size(); indice++) 
						System.out.println(cores.get(indice));
					
				
				leia.close();
			}
			
		
	}
