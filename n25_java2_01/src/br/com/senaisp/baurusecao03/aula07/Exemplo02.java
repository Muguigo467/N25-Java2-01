package br.com.senaisp.baurusecao03.aula07;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite seu nome completo");
			String nome = sc.next();//token padrão é espaço e, branco
			System.out.println("Seu nome é: " + nome);
			int idade = sc.nextInt();
			sc.nextLine();//captura o enter
			System.out.println("Digite seu endereço: ");
			String endereco = sc.nextLine();//token é o termino da linha \n
			System.out.println("Sua odade é: " + endereco);
			System.out.println("Sua idade é: " + idade);
			sc.close();
	}

}
