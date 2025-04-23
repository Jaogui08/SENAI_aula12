package Projetos_LPA.aula11;

import java.util.Scanner;

public class numeros_maior8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 8) {
                contador++;
            }
        }

        System.out.println("\nQuantidade de números maiores que 8: " + contador);
        scanner.close();

	}

}
