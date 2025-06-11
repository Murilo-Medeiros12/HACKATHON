package Hackathon02;

import java.util.Scanner;

public class Exercicio2_05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("informe seu nivel de treinamento");
		int nivel = ler.nextInt();
		
		if(nivel<10) {
			System.out.println("Treinador inicianste");
		}else if (nivel >30) {
			System.out.println("Treinador Experiente");
		}else {
			System.out.println("Treinador intermediario");
		}

	}

}
