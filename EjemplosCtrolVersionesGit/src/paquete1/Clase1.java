package paquete1;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {
		Scanner entradan = new Scanner(System.in);
		boolean xd = false;
		int c = 0;
		while(xd== false) {
			if (entradan.next().charAt(0)== 'q') xd = true;
			System.out.println("Hola mundo "+c);
			c++;
		}

	}

}
