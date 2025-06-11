package Hackathon02;

import java.util.Scanner;

public class Exercicio2_08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("escolha um ataque entre 1 e 3:");
		int ataque = ler.nextInt();
		
		switch (ataque) {
		case 1:
			System.out.println("Fogo");
			break;
		case 2:
			System.out.println("Agua");
			break;
		case 3:
			System.out.println("Planta");
			break;
			default:
				System.out.println("Tipo desconhecido");
		}

	}

}
