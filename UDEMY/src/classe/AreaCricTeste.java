package classe;

public class AreaCricTeste {
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		
		System.out.println(a.area());
		System.out.println(Math.PI); // Math.pi pertence a API do java
		System.out.println(AreaCirc.PI); // posso acessar PI sem usar instância
	}
}
