package MaisExercicios;

import java.util.*;
public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa onde o usuário entra com um ano e o sistema identifica se é bissexto ou não.
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("Informe o Ano: ");
		year = sc.nextInt();
		
		if(year%4 == 0) {
			System.out.println(year + " é um ano bissexto!");
		} else {
			System.out.println(year + " não é um ano bissexto.");
		}
		

	}

}
