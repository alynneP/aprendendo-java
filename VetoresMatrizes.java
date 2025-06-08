package aula4;

public class VetoresMatrizes {
	public static void main(String[] args) {
		
		//vetor array unidimensional
		System.out.println("Exemplo de vetor (array unidimensional): ");
		int[] numeros = {11,12, 13, 14, 15};
		
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.println("Posição" + i + ":" + numeros[i]);
		}
		
		// matriz array bidirecional
		System.out.println("\nAgora um exemplo de matriz (array bidirecional):");
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		for(int linha = 0; linha < matriz.length; linha++ ) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++ ) {
				System.out.println("Posição[" + linha + "]["+ coluna + "]" + matriz[linha][coluna]);
			}
		}
		System.out.println("\nVetor de string:");
		String[] nomes = {"Alynne", "Isabele", "Sam"};
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		
	}

}
