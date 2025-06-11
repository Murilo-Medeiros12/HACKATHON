package Hackathon02;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva o nome de um pais");
		String pais = ler.nextLine().toUpperCase();

		if (pais.equals("BRASIL") || pais.equals("ARGENTINA") || pais.equals("PERU")) {
			System.out.println("America do sul");
		} else if (pais.equals("FRANÇA") || pais.equals("ALEMANHA")) {
			System.out.println("Europa");
		} else if (pais.equals("CHINA") || pais.equals("JAPAO")) {
			System.out.println("Asia");
		} else if (pais.equals("NIGERIA") || pais.equals("EGITO")) {
			System.out.println("Africa");
		}
	}
}