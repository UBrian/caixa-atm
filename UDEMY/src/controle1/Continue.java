package controle1;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;

			}
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) continue;  // quando a condição for true ele pula o resultado, ou seja não vai exibir o 5
			System.out.println(i);
			}
			
		}
	}

