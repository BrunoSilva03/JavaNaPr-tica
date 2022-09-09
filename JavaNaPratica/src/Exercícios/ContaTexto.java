package Exercícios;

import java.util.*;

public class ContaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String text;
		int qtdLetras;
		
		System.out.println("Digite um texto e contaremos quantas letras tem no texto no total!");
		text = sc.toString();
		
		qtdLetras = text.length();
		
		System.out.println("A quantidade de letras no texto é : " + qtdLetras);
		System.out.println(text);
		
		//Deu errado

	}

}
