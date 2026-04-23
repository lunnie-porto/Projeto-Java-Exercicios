package For;

import java.util.Scanner;

public class ForExercicio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int pares = 0, impares =0, numero, contador;
		
		for (contador = 1; contador <= 10; contador++) {
			
		System.out.println("Digite o " + contador + "º numero: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			pares++;
		} else {
			impares++;
		System.out.println("Total de números pares: " + pares);
		
		System.out.println("Total de números ímpares: " + impares);
		}
		}

	}

}
