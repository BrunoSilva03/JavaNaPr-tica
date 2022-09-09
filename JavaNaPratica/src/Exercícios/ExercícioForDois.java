package Exercícios;

public class ExercícioForDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Soma dos números: ");
		int soma = 0;
		
		for(int x = 0; x <= 30; x++) {
			soma = soma + x;
		}  // fim da estrutura de repetição

		System.out.println(soma);
		
		//------------------------------------------------------------------------------
		
		
		System.out.println();
		System.out.println("Tabuada de um número");
		
		int numTabuada = 6;
		for(int y = 0; y <=10; y++) {
			System.out.println(y * numTabuada);
		}
		
		
	}

}
