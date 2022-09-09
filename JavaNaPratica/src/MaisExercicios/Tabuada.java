package MaisExercicios;

import java.util.*;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número: ");
		num = sc.nextInt();
		
		System.out.println("Tabuada do número " + num);
		System.out.println("SOMA");
		for(int i = 0; i <=10; i++) {
			System.out.println(num + " + " + i + " = " + (num + i));
		}
		
		System.out.println(" ");
		System.out.println("SUBTRAÇÃO");
		for(int j = 0; j <= 10; j++) {
			System.out.println(num + " - " + j + " = " + (num - j));
		}
		
		System.out.println(" ");
		System.out.println("DIVISÃO");
		System.out.println(num + " /  0 = Não Existe divisão por 0");
		for(int k = 1; k <= 10; k++) {
			System.out.println(num + " / " + k + " = " + (num/k));
		}
		
		System.out.println(" ");
		System.out.println("MULTIPLICAÇÃO");
		for(int l = 0; l <= 10; l++) {
			System.out.println(num + " * " + l + " = " + (num*l));
		}
	}

}
