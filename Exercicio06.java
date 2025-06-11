package Hackathon02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva um numero para um pais na america do sul ");
		int pais = ler.nextInt();

		switch (pais) {

		case 1:
			System.out.println("Brasil");
			break;
		case 2:
			System.out.println("Argentina");
			break;
		case 3:
			System.out.println("Chile");
			break;
		case 4:
			System.out.println("Peru");
			break;
		case 5:
			System.out.println("Uruguai");
			break;
		default:
			System.out.println("Codigo invalido");
		}
	}

}
