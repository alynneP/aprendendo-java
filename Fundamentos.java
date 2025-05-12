
package aula1;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade;
		char sexo;
		double altura;
		boolean feliz;
		nome = "Alynne programa em Java";
		idade = 22;
		sexo = 'F';
		altura = 1.71;
		feliz = true;
		System.out.println("Uso de variáveis na linguagem Java ");
		System.out.println("Exemplos: ");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);
		System.out.println("altura: " + altura);
		System.out.println("feliz: " + feliz);
		/**
		 * 
		 */
		double i;
		i = 10;
		System.out.println("-----------------------------------");
		System.out.println("Operadores aritiméticos e atribuições");
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + ( i + 5));
		System.out.println("i = " + i + " - 5 | i = " + ( i - 5));
		System.out.println("i = " + i + " * 5 | i = " + ( i * 5));
		System.out.println("i = " + i + " / 5 | i = " + ( i / 5));
		System.out.println("i = " + i + " % 5 | i = " + ( i % 5));
		System.out.println("i += 5            | i = " + (i += 5));
		System.out.println("i -= 5            | i = " + (i -= 5));
	}

}
