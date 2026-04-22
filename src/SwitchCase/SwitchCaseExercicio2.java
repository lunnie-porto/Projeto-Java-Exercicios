package SwitchCase;

import java.util.Scanner;

public class SwitchCaseExercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int codigo;
		float salario;
		
		System.out.println("### Empresa ###");
		
		System.out.print("Digite o nome do colaborador: ");
		nome = leia.nextLine();
				
		System.out.print("Digite o código do cargo (1 a 6): ");
		codigo = leia.nextInt();
		
		System.out.print("Salário atual: ");
        salario = leia.nextFloat();
		
		switch (codigo) {
		
		case 1:
			System.out.println("Cargo: Gerente");	
			System.out.println("Novo Salário: R$ " + (salario + (10 / 100.0 * salario)));
			break;
			
		case 2:
			System.out.println("Cargo: Vendedor");	
			System.out.println("Novo Salário: R$ " + (salario + (7 / 100.0 * salario)));
			break;
			
		case 3:
			System.out.println("Cargo: Supervisor");	
			System.out.println("Novo Salário: R$ " + (salario + (9 / 100.0 * salario)));
			break;
		case 4:
			System.out.println("Cargo: Motorista");	
			System.out.println("Novo Salário: R$ " + (salario + (6 / 100.0 * salario)));
			break;
		case 5:
			System.out.println("Cargo: Estoquista");	
			System.out.println("Novo Salário: R$ " + (salario + (5 / 100.0 * salario)));
			break;
		case 6:
			System.out.println("Cargo: Técnico de TI");	
			System.out.println("Novo Salário: R$ " + (salario + (8 / 100.0 * salario)));
			break;
			
		default:
	        System.out.println("Opção inválida!");
		}
		
		
	}

}
