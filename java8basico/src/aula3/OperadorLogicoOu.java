package aula3;

import java.util.Scanner;

public class OperadorLogicoOu {

	public static void main(String[] args) {
		int a, b, c, d, x, y, z;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("A: ");
		a = ler.nextInt();
		
		System.out.print("B: ");
		b = ler.nextInt();
		
		System.out.print("C: ");
		c = ler.nextInt();
		
		System.out.print("D: ");
		d = ler.nextInt();
		
		x = a + b;
		y = c * d;
		z = x - y;
		
		System.out.printf("\nX: %d",x);
		System.out.printf("\nY: %d",y);
		
		System.out.printf("\nA subtituição de %d, %d e %d.", x, y, z);
		
		ler.close();

	}

}
