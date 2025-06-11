package Hackathon02;

import java.util.Scanner;

public class Exercicio2_10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Escolha um numero de 1 a 4 para atacar");
		int ataque = ler.nextInt();
		s
		switch (ataque) {
		 case 1:
	            System.out.print("Investida");
	            break;
	        case 2:
	        	System.out.print("Rajada de Fumaça");
	            break;
	        case 3:
	        	System.out.print("Choque do Trovão");
	            break;
	        case 4:
	        	System.out.print("Hidro Bomba");
	            break;
	        default:
	        	System.out.print("Ataque inválido");
		
		}

	}

}
