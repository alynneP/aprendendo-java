
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
		sexo = 'M';
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
		
		System.out.println("-----------------------------------");
		System.out.println("Estruturas de controle condicional");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");
		}
		idade = 70;
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		System.out.println("");
		System.out.println("exemplo else if");
		if (idade < 16) {
			System.out.println("Proibido votar!");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("Voto obrigatório!");
		} else if (idade == 16 || idade == 17 || idade == 70) {
			System.out.println("Voto facultativo");
		}
		System.out.println("-----------------------------------");
		System.out.println("Exemplo switch case");
		System.out.println("Relatório de clientes");
		System.out.println("Relatório de usuários");
		System.out.println("Relatórios");
		int opcao = 1;
		switch (opcao) {
		case 4:
			System.out.println("clientes");
			break;
		case 2:
			System.out.println("usuários");
			break;
		case 3:
			System.out.println("Relatórios");
			break;
		default:
			System.out.println("Operação inválida");
			break;
		}
		
		
	}
}
