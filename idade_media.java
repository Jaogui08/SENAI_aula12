package Projetos_LPA.aula11;

import java.util.Scanner;

public class idade_media {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.print("Informe uma idade: ");
			int idade = scanner.nextInt();

			soma = soma + idade;
		}
		int media = soma / 20;

		System.out.println("A média das idades informadas é: " + media);

		scanner.close();

	}

}
