package Hackathon02;

import java.util.Scanner;

public class Exercicio2_09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome de um pokemom");
		String nome = ler.next().toUpperCase();

		switch (nome) {
		case "Bulbasaur":
			System.out.println("Kanto");
			break;
		case "Chimchar":
			System.out.println("Sinnoh");
			break;
		case "Torchic":
			System.out.println("Hoenn");
			break;
		default:
			System.out.println("Região desconhecida");
		}
	}

}
