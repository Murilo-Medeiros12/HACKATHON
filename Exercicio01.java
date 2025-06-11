package Hackathon02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("infore a latitude de um ponto geografico da terra: ");
		int latitude = ler.nextInt();
		System.out.println(0 >= latitude ? "Hemisferio Norte":"Hemisferio Sul");

	}

}
