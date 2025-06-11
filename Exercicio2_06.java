package Hackathon02;

import java.util.Scanner;

public class Exercicio2_06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("informe a sua idade:");
		int idade = ler.nextInt();

		System.out.println("informe o nivel do seu Pokemom");
		int nivel = ler.nextInt();

		if (idade >= 12 && nivel >= 20) {
			System.out.println("Pode participar do torneio");
		} else {
			System.out.println("Não pode participar");
		}

	}

}
