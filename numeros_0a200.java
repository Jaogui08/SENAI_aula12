package Projetos_LPA.aula11;

import java.util.Scanner;

public class numeros_0a200 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador1=0, contador2=0, contador3=0;
		
		for (int i=1; i<=20; i++) {
			System.out.print("Número " + i + ": ");
			int num = scanner.nextInt();
			
			if (num>0 && num<=100) {
				contador1++;
			} else if (num>101 && num<=200) {
				contador2++;
			} else if (num>200) {
				contador3++;
			}
		}
		System.out.println("\nQuantidade de números entre 0 e 100: " + contador1);
		System.out.println("\nQuantidade de números entre 101 e 200: " + contador2);
		System.out.println("\nQuantidade de números maiores que 200: " + contador3);
		scanner.close();
	}

}
