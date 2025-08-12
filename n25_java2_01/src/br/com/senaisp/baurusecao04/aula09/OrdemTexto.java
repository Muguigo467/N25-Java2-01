package br.com.senaisp.baurusecao04.aula09;

import java.util.Scanner;

public class OrdemTexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(OrdemTexto.class.getResourceAsStream("palavras.txrt"));
		//definindo variaveis de trabalho
		String maiorTexto, menorTexto;
		//Setando o maior e menor com primeiro texto
		maiorTexto = sc.nextLine();
		menorTexto = maiorTexto; //Igualando os endereços para o mesmo conteudo
		//Vamos usar o while (ja viu no java)
			String apoio = sc.nextLine();
			//Comparando textos - menor
			if (apoio.compareTo(menorTexto)<0) {
				menorTexto = "" + apoio;
			}
			//Comparando textos - maior
			if (apoio.compareTo(maiorTexto)<0) {
				maiorTexto = "" + apoio;
			}
			System.out.println("Maior texto foi: " + maiorTexto);
			System.out.println("Menor texto foi: " + menorTexto);
	}
	

}
