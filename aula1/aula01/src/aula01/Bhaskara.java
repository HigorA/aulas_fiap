package aula01;

import java.util.Scanner;

public class Bhaskara {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 3;
		int b = -2;
		int c = 13;
		
		double delta = Math.exp(b) - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Não existe solução!");
		} else if (delta == 0) {
			double x1 = -b + Math.sqrt(delta) / 2*a;
			System.out.println("Existe uma solução!");
			System.out.println(x1);
		} else {
			double x1 = -b + Math.sqrt(delta) / 2*a;			
			double x2 = -b - Math.sqrt(delta) / 2*a;
			System.out.println("Existem duas soluções!");
			System.out.println(x1);
			System.out.println(x2);
		}
	}

}
