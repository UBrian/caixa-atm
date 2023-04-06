package controle1;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String texto ;
		
		do {
			System.out.println("Você precisa pedir pra sair por favor!");
			texto = entrada.nextLine();

		} while (!texto.equalsIgnoreCase("por favor"));
		System.out.println("tchau");
	}
}

