package Hackathon02;

import java.util.Scanner;

public class Exercicio2_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o nivel do Pokemom:");
		int nivel = ler.nextInt();
		System.out.println(nivel >= 16 ? "Pode evoluir" : "Não pode evoluir");

	}

}
