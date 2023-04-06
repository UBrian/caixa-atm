package caixaeletronico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Caixa {
	private double saldo = 0.0;
	private List<String> extrato = new ArrayList<String>();
	Date data = new Date();

	public void verSaldo() {
		System.out.println("Saldo atual: R$" + saldo);
	}

	public void depositar(double valor) {
		saldo += valor;
		extrato.add("+R$" + valor + " em " + data);
		System.out.println("Depósito realizado com sucesso!");
	}

	public void sacar(double valor) {
		if (valor % 5 != 0) {
			System.out.println("O valor solicitado deve ser múltiplo de R$ 5,00.");
		} else if (valor > saldo) {
			System.out.println("Saldo insuficiente para realizar o saque.");
		} else {
			int notas10 = (int) (valor / 10);
			int notas5 = (int) ((valor - (notas10 * 10)) / 5);
			saldo -= valor;
			extrato.add("-R$"+ valor + " em " + data);
			System.out.println("Saque realizado com sucesso! Foram entregues " + notas10 + " notas de R$ 10,00 e "
					+ notas5 + " notas de R$ 5,00.");
		}
	}

	public void verExtrato() {
		System.out.println("Extrato:");
		for (String operacao : extrato) {
			System.out.println(operacao);
		}
	}
}
