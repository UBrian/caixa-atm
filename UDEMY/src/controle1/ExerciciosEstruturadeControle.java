//1- Receber número verificar se esta entre 0 e 10 e é par
//2- Receber 2 notas parciais e calcular media final, >=7 Aprovado, <7e>4 Recuperação contrario Reprovado
//3- receber uma palavra e imprimir letra por letra
//4- receber 5 valores e imprimir o maior numero

package controle1;

import java.util.Scanner;

public class ExerciciosEstruturadeControle {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

//		int numero;
//		System.out.println("Informe um número entre 0 e 10:");
//		numero = entrada.nextInt();
//
//		while (numero < 0 || numero > 10) {
//			System.out.println("Digite um numero entre 0 e 10!");
//			numero = entrada.nextInt();
//		}
//		if (numero % 2 == 0) {
//			System.out.println("Numero PAR!");
//		} else
//			System.out.println("Numero Impar!!");
//		====================================================================================

//		double nota1;
//		double nota2;
//
//		System.out.println("Digite 1º Nota: ");
//		nota1 = entrada.nextInt();
//		System.out.println("Digite 2º Nota:");
//		nota2 = entrada.nextInt();
//
//		double soma = nota1 + nota2;
//		double media = soma / 2;
//
//		if (media >= 7 ) {
//			System.out.println("Aprovado!");
//		} else if (media < 7 && media > 4) {
//			System.out.println("Recuperação!");
//		} else
//			System.out.println("Reprovado!");

//		====================================================================================
		int contador = 5;
		int num;
		int maior = 0;

		while (contador != 0) {
			contador--;
			System.out.println("Digite o número: ");
			num = entrada.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		System.out.println("Maior numero é: " + maior);
	}

}