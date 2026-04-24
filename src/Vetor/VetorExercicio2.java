package Vetor;

import java.util.Scanner;

public class VetorExercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[10] , soma = 0;
		float media;
	
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o  " + (indice + 1) + "º número: ");
			vetor[indice] = leia.nextInt();
			soma += vetor[indice];
			
		}
		System.out.println("\nElementos nos indicies impares: ");
		for (int indice = 1; indice <10; indice += 2) {
			System.out.print(vetor[indice] + " ");
		}
			
			System.out.println("\nElementos pares: ");
			for ( int indice = 0; indice <10; indice++) {
				if (vetor[indice] % 2 == 0) {
					System.out.print(vetor[indice] + " ");
				}
			}
					
					media = (float) soma / 10;
					System.out.print("\n\nSoma: " + soma);
					System.out.print("\n\nMedia: " + media);
					
				}
			}
		
	


