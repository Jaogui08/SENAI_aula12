package Projetos_LPA.aula11;

import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador=0;
		
		for (int i=1; i<=20; i++) {
			System.out.print("Número " + i + ": ");
			int num = scanner.nextInt();
			
			if (num%2==0) {
				contador++;
			}
		}
		
		System.out.println("\nQuantidade de números pares: " + contador);
        scanner.close();

	}

}
