package Exercícios;

public class ExibeImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExibeImpar ei;
		ei = new ExibeImpar();
		ei.exibir();

	}

	
	public void exibir() {
		int contador = 1; //Declarando uma variável local
		
		
		while (contador <= 20) {
			if (contador%2 != 0) {
				System.out.println(contador + " é ímpar");
			} // final do if
			
			contador++; //incrementando em uma unidade
		} // final do while
	}
}
