package aula01;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fale sua altura: ");
		String alturaString = scanner.next();
		System.out.println("Fale seu peso: ");
		String pesoString = scanner.next();
		
		alturaString = alturaString.replace(",", ".");
		pesoString = pesoString.replace(",", ".");
		
		Double altura = Double.parseDouble(alturaString);
		Double peso = Double.parseDouble(pesoString);
		
		double imc = peso / Math.pow(altura, 2);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Peso ideal (Parabéns)");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Levemente acima do peso");
		} else if (imc >= 30 && imc <=  34.9) {
			System.out.println("Obesidade grau I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau II (Severa)");
		} else {
			System.out.println("Obesidade III (Mórbida)");
		}
	}
}
