package fundamentos1;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia");
		
		System.out.println("Bom");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome:");
		String nome = entrada.nextLine();
		System.out.println("\n\nNome = " + nome);
	}

}
