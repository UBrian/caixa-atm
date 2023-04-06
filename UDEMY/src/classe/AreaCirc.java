package classe;

public class AreaCirc {
	double raio;
	static final double PI = 3.14; // PI fica maiusculo pq ele é uma constante
									// pi se tornou atributo de classe ou statico
									// Final significa que não pode ser modificado

	AreaCirc(double raioInicial) { // construtor
		raio = raioInicial;
	}

	double area() {
		return raio * raio * PI;
	}
}
