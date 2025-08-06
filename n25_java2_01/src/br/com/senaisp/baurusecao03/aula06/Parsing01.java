package br.com.senaisp.baurusecao03.aula06;

public class Parsing01 {

	public static void main(String[] args) {
		int shirtPrice = Integer.parseInt("15");
		double taxRate = Double.parseDouble("0.05");
		String gibberish = "887ds7nds87dsfs";
		//mostrando valores
		System.out.println("Preço da camiseta: " + shirtPrice);
		System.out.println("Percentual imposto: " + taxRate);
		System.out.println("gibberish para int: " + Integer.parseInt(gibberish));
	}

}
