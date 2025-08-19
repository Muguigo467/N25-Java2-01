package br.com.senaisp.baurusecao08.aula13;

import br.com.senaisp.baurusecao05.aula11.Carta;

public class BaralhoTeste {

	public static void main(String[] args) {
		//Criando o Baralho
		Baralho br = new Baralho();
		Carta ct = null;
		do {
			ct = br.sortearCarta();
			if (ct!=null) {
				System.out.println(ct);
			}
		}while(ct!=null);
	}

}
