package br.com.senaisp.baurusecao03.aula07;

import java.util.Scanner;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(Exemplo03.class.getResourceAsStream("FakeArq.txt"));
		String linha = sc.nextLine();
		sc.close();
	}
}
