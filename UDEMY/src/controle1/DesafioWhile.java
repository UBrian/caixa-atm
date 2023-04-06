package controle1;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String valor = "";
		
		//**enquanto não tiver sair dentro de valor continue**\\
		//  ( ! ) esclamação significa não
		
		while (!valor.equalsIgnoreCase("sair")) { 
			System.out.println("Você diz:");
			valor = entrada.nextLine();
		}

		entrada.close();
	}
}
