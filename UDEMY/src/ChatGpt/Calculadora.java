package ChatGpt;


	import java.util.Scanner;

	public class Calculadora {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        double num1, num2, resultado;
	        char operador;

	        System.out.print("Digite o primeiro número: ");
	        num1 = sc.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        num2 = sc.nextDouble();

	        System.out.print("Digite o operador (+, -, *, /): ");
	        operador = sc.next().charAt(0);

	        switch (operador) {
	            case '+':
	                resultado = num1 + num2;
	                System.out.println(num1 + " + " + num2 + " = " + resultado);
	                break;

	            case '-':
	                resultado = num1 - num2;
	                System.out.println(num1 + " - " + num2 + " = " + resultado);
	                break;

	            case '*':
	                resultado = num1 * num2;
	                System.out.println(num1 + " * " + num2 + " = " + resultado);
	                break;

	            case '/':
	                if (num2 == 0) {
	                    System.out.println("Não é possível dividir por zero.");
	                } else {
	                    resultado = num1 / num2;
	                    System.out.println(num1 + " / " + num2 + " = " + resultado);
	                }
	                break;

	            default:
	                System.out.println("Operador inválido.");
	                break;
	        }

	        sc.close();
	    }
	}


