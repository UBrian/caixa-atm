package arrays;

import java.util.Scanner;

public class DesafioNota {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int qt;

		System.out.println("Quantas notas deseja cadastrar?");
		qt = s.nextInt();

		double[] qtd = new double[qt];

		for (int i = 0; i < qtd.length; i++) {
			System.out.println("Digite a" +" "+ (i + 1) + "º" +" "+ "nota:");

			qtd[i] = s.nextDouble();
		}

		double total = 0;
		for (double nota : qtd) {

			total += nota;

		}
		System.out.println("A média é"+" " + (total / qtd.length));
		s.close();
	}
}
