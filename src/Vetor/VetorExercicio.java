package Vetor;

import java.util.Scanner;

public class VetorExercicio {

	public static void main(String[] args) {
		
		int[] vetorNumeros = {2,5,1,3,4,9,7,8,10,6};
		Scanner leia = new Scanner(System.in);
		int numeroDesejado;
		int posicao = -1; //indica que não foi encontrado ainda
		
		System.out.println("Digite o numero que voce deseja encontrar: ");
		numeroDesejado = leia.nextInt();
		
		for (int indice = 0; indice < vetorNumeros.length; indice++) {
			if (vetorNumeros[indice] == numeroDesejado) {
				posicao = indice;
				break;
				
			}
		}
			if (posicao != -1) {
				System.out.println("O número  " + numeroDesejado  + " está na posição: " + posicao);
			} else {
				System.out.println("Não foi encontrado");
				
			}
				
					
				}
			}
			
		
		
		
        					
        		
        		
        	
        

	
	


