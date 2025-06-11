package Hackathon02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe um numero de determinado mes:");
		int mes = ler.nextInt();

		if (mes == 12 || mes == 1 || mes == 2) {
			System.out.println("Verão");
		} else if (mes == 3 || mes == 4 || mes == 8) {
			System.out.println("outono");
		} else if (mes < 9 || mes > 5) {
			System.out.println("inverno");
		} else if (mes < 12 || mes > 8) {
			System.out.println("Primavera");
		} else {
			System.out.println("Mes invalido");
		}

	}

}
