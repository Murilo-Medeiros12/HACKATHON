package Hackathon02;

import java.util.Scanner;

public class Exercicio2_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o nome de um Pokemom:");
		String nome = ler.next().toUpperCase();

		System.out.println(nome.equals("PIKACHU")? "Pokemom popular":"Outro Pokemom");

	}

}
