package IfElse;

import java.util.Scanner;

public class IfElseExercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, c, soma;

		System.out.println("Digite o número A: ");
		a = leia.nextInt();

		System.out.println("Digite o número B: ");
		b = leia.nextInt();

		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
		System.out.println("A Soma de A + B é Maior do que C");
		}
		else if (soma < c) {
		System.out.println("A Soma de A + B é Menor do que C");	
		}
		else {
		System.out.println("A Soma de A + B é Igual a C");	
		}
	}

}
