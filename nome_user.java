package Projetos_LPA.aula11;

import java.util.Scanner;

public class nome_user {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu user: ");
		String user = scanner.nextLine();
		
		for (int i=1; i<=10; i++) {
			System.out.println(user);
		}
		scanner.close();

	}

}
