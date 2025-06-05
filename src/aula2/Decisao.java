package aula2;

public class Decisao {
	public static void main(String[] args) {
		int nota = 75;
		
		System.out.println("Estrutura condicional if/else:");
		if(nota >= 60) {
			System.out.println("Aprovado! :) ");
		} else {
			System.out.println("Reprovado! :( ");
		}
		
		int dia = 6;
		System.out.println("\n Estrutura switch:");
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-ferira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia inválido");
		
			
		}
	}

}
