package caixaeletronico;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Caixa cx = new Caixa();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean c = true;

		while (c) {
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Ver saldo atual");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Ver extrato");
			System.out.println("5 - Sair");

			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				cx.verSaldo();
				break;
			case 2:
				System.out.println("Digite o valor a ser depositado:");
				double valorDeposito = sc.nextDouble();
				cx.depositar(valorDeposito);
				break;
			case 3:
				System.out.println("Digite o valor a ser sacado:");
				double valorSaque = sc.nextDouble();
				cx.sacar(valorSaque);
				break;
			case 4:
				cx.verExtrato();
				break;
			case 5:
				c = false;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

			System.out.println();
		}
	}

}
