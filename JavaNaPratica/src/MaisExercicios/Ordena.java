package MaisExercicios;

import java.util.*;
public class Ordena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar uma classe com o nome Ordena onde o usuário entra com dois valores e o sistema 
		//os exibe no console ordenando-os do menor para o maior:
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite um valor: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite mais um valor: ");
		num2 = sc.nextInt();
		
		
		if(num1 == num2) {
			System.out.println("Os dois números têm o mesmo valor!");
		} else {
			if (num1 < num2) {
				System.out.println(num1 + ", " + num2);
			} else {
				System.out.println(num2 + ", " + num1);
			}
		}

	}

}
