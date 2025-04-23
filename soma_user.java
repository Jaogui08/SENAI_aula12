package Projetos_LPA.aula11;

import java.util.Scanner;

public class soma_user {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe um numero: ");
			int num = scanner.nextInt();

			soma = soma + num;
		}

		System.out.println("O resultado da soma é: " + soma);

		scanner.close();

	}

}
