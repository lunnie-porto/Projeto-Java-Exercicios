package projetoJavaExercicios;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a Nota 1:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a Nota 2:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a Nota 3:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a Nota 4:");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("Média final: " + media);
		
	}

}
