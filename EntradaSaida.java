package cursojava.basico;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		//criaçao de variaveis
		String nome;
		int idade;
		double altura;
		
		Scanner Leitor = new Scanner(System.in);
		System.out.println("digite seu nome.");
		nome= Leitor.nextLine();
		
		System.out.println("digite sua idade.");
		idade= Leitor.nextInt();
		
		System.out.println("digite sua altura.");
		altura= Leitor.nextDouble();
		
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("altura: "+altura);
		System.out.println();
		
		System.out.printf("nome: %s \nidade: %d \naltura: %.2f",nome,idade,altura);

	}

}
