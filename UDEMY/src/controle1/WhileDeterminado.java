package controle1;

public class WhileDeterminado {
	public static void main(String[] args) {
		int a = 1;

		while (a <= 3) {
			System.out.printf(" i = %d\n", a);
			++a;
		}
		int b = 1;
		while (b <= 6) {
			System.out.printf(" i = %d\n", b);
			b += 2; // acrescenta de 2 em 2
		}
	}
}
