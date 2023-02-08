package aula01;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fala um numero: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("O numero é negativo.");
		} else if (numero % 2 == 0) {
			System.out.println("O numero é par.");
		} else if (numero % 2 == 1) {
			System.out.println("O numero é impar");
		}
	}

}
