package Projetos_LPA.aula11;

import java.util.Scanner;

public class jedi_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		for (int i=1; i<=20; i++) {
			System.out.println(frase);
		}
		scanner.close();

	}

}
