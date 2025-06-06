package aula3;

/**
 * @author alynne 
 */

public class Repeticoes {

	public static void main(String[] args) {
		
		System.out.println("Estrutura de repetição: for");
		for(int i = 1; i <= 5; i++) {
			System.out.println("contando com for: " + i);
		}
		
		System.out.println("Estrutura de repetição: while");
		int j = 1;
		while(j <= 5) {
			System.out.println("Contando com while: " + j);
			j++;
		}
		System.out.println("\nEstrutura de repetição: do while");
		int k = 1;
		do {
			System.out.println("Contando com do while: " + k);
			k++;
		} while (k <= 5);
	// Agora um exemplo com array
		String[] frutas = {
				"Maçã", "Banana", "Laranja"
		};
		
		System.out.println("\nPercorrendo array com for-each:");
		for(String fruta : frutas) {
			System.out.println("Fruta :" + fruta);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
