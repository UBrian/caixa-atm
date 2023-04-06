package controle1;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int contador = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) { // != diferente
			System.out.println("Informe a nota:");

			nota = entrada.nextInt();

			if (nota <= 10 && nota >= 0) {
				total += nota; // total vai receber a nota mais o valor dela
				++contador;
			} else if (nota != -1) {
				System.out.println("Nota inválida !!!");
			}

		}
		double media = total / contador;
		System.out.println("Media:" + media);
	}
}
