package Hackathon02;

import java.util.Scanner;

public class Exercicio2_07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o nivel do seu pokemom");
		int nivel =ler.nextInt();
		System.out.println("informe o nivel do outro Pokemom");
		int nivelsegundo =ler.nextInt();
		
		if (nivel >nivelsegundo) {
			System.out.println("O Pokemom mais forte é : "+nivel);
		}else if (nivel == nivelsegundo) {
			System.out.println("Ambos estão inpatados");
		}else {
			System.out.println("O Pokemom mais forte é : "+nivelsegundo);
		}

	}

}
