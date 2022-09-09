package MaisExercicios;

public class ClasseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "abc";
		String y = "abc";
		
		if (x == y) {
			System.out.println("Variáveis x e y têm conteúdos iguais");
		} else {
			System.out.println("Variáveis x e y têm conteúdos diferentes");
		}
		
		
		String x1 = new String("abc");
		String y1 = new String("abc");
		
		if(x1 == y1) {
			System.out.println("Variáveis x1 e y1 têm valores iguais");
		} else {
			System.out.println("Variáveis x1 e y1 têm valores diferentes");
		}
		
		if(x1.equals(y1)) {
			System.out.println("Objetos x1 e y1 são iguais");
		} else {
			System.out.println("Objetos x1 e y1 são diferentes");
		}

	}

}
