package controle1;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana");
		String dia = entrada.next();

		// if (dia == "Domingo") { System.out.println(1);
		// nao usar == pra comparar String pois nao funciona

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1); // forma de usar equals
		} else if ("segunda".equalsIgnoreCase(dia.toLowerCase())) /* toLowerCase transforma todas as letras em minuscula mas 
			ideal é usar equals pois ignora maiuscula e minusculas*/
			
			System.out.println("2"); // segunda forma de usar equals
		else if (dia.equalsIgnoreCase("terça")|| dia.equalsIgnoreCase("terca"))
			System.out.println("3");
		else if (dia.equalsIgnoreCase("quarta"))
			System.out.println("4");
		else if (dia.equalsIgnoreCase("quinta"))
			System.out.println("5");
		else if (dia.equalsIgnoreCase("sexta"))
			System.out.println("6");
		else if (dia.equalsIgnoreCase("sábado"))
			System.out.println("7");
		else
			System.out.println("Informe dia da semana!");

		entrada.close();

	}
}
