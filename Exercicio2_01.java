package Hackathon02;

import java.util.Scanner;

public class Exercicio2_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("coloque o nivel de foça do seu Pokemon:");
		int forca = ler .nextInt();
		
		System.out.println(forca > 70 ? "Pokemon de Elite":"Pokemon Comum");

	}

}
