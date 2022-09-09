package MaisExercicios;

public class Soma5Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que some 5 números inteiros.
		
		int contador = 1;
		int valor = 0;
		
		while(contador <= 5) {
			valor = valor + contador;
			contador++;
		}
		
		System.out.println("Soma dos 5 = " + valor);

	}

}
