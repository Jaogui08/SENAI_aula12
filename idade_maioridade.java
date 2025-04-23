package Projetos_LPA.aula11;

import java.util.Scanner;

public class idade_maioridade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 20; i++) {
			System.out.print("\nInforme uma idade: ");
			int idade = scanner.nextInt();

			if (idade>=18) {
				System.out.println("Você é maior de idade");
			}
		}
		scanner.close();

	}

}
