package br.com.senaisp.baurusecao04.aula08;

import java.util.Scanner;

public class NameMaker {

	public static void main(String[] args) {
		//Solicitar o nome do meio e sobrenome separadamente
		//Mostrar o nome completo ao término
		Scanner scanner = new Scanner(System.in);	
		String nome, nomeDoMeio, sobrenome;
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		System.out.println("Digite seu nome do meio (caso possua): ");
		nomeDoMeio = scanner.nextLine();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = scanner.nextLine();
		String nomeCompleto = nome + " " + nomeDoMeio + " " + sobrenome;
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		scanner.close();
	
	}

}
