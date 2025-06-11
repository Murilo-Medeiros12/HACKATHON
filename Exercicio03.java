package Hackathon02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o nome de um continente americano: ");
		String continente = ler.nextLine().toUpperCase();
		
		System.out.println(continente.equals("AMERICA DO NORTE") ? "É um continente americano": "Não é americano");

	}

}
