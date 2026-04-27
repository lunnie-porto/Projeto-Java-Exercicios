package Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		System.out.println("Digite 10 valores inteiros "); // não podem repetir
		
		for (int indice = 0; indice <10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			int numero = leia.nextInt();
			numeros.add(numero);
		}
        Iterator<Integer> iNumeros = numeros.iterator();
        
        System.out.println("\nListar numeros: ");
        while (iNumeros.hasNext()) {
        	System.out.println(iNumeros.next());
        }
        leia.close();
	}

}
