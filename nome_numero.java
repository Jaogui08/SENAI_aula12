package Projetos_LPA.aula11;

import java.util.Scanner;

public class nome_numero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu user: ");
		String user = scanner.nextLine();
		
		System.out.print("Informe um número inteiro: ");
		int num = scanner.nextInt();
		scanner.nextLine();
		
		for (int i=1; i<=5; i++) {
			System.out.println(user + " numero " + num);
		}
		scanner.close();

	}

}
