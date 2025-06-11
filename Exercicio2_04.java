package Hackathon02;

import java.util.Scanner;

public class Exercicio2_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe se seu pokemom é lemdario ou comum");
		String nome = ler.next().toUpperCase();
		
		System.out.println(nome.equals("LEMDARIO")? "Extremamente raro":"comum");

	}

}
