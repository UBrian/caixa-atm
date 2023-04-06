package fundamentos1;

import java.util.Scanner;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite primeiro numero");
		String valor1 = entrada.nextLine();
		
		System.out.println("Digite segundo numero");
		String valor2 = entrada.nextLine();
		
		
		System.out.println(valor1 + valor2);
		
		double numero1= Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("soma é " + soma);
		System.out.println("Média é" + soma /2);
	}

}
