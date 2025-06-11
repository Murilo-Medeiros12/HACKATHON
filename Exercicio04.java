package Hackathon02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Escreva valores do fuso horario entr -12 e +14:");
		int horario = ler.nextInt();
		
		if (horario > 0) {
			System.out.println("Horário adiantado em relação ao UTC 0");
		}else if (horario == 0 ){
			System.out.println("Horário UTC 0");
		}else {
			System.out.println("Horário atrasado em relação ao UTC 0");
		}

	}

}
