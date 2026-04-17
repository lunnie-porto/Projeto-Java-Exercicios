package projetoJavaExercicios;

import java.util.Scanner;

public class salarioEAbono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		String salario, abono;
		float salario1;
		float abono1;
		float novoSalario1;
		
		System.out.println("Digite o Salario: ");
		salario1 = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono1 = leia.nextFloat();
		
		novoSalario1 = salario1 + abono1;
		
		System.out.println("Novo Salario " + novoSalario1);
	}

}
