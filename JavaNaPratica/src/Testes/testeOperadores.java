package Testes;

import java.util.ArrayList;
import java.util.Scanner;

public class testeOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		String item1 = new String();
		String item2 = new String();
		String item3 = new String();
		
		
		ArrayList<String> lista = new ArrayList<String>();
		
		System.out.println("Digite item 1: ");
		item1 = sc.nextLine();
		lista.add(item1);
		
		System.out.println("Digite item 2: ");
		item2 = sc.nextLine();
		lista.add(item2);
		
		System.out.println("Digite item 3: ");
		item3 = sc.nextLine();
		lista.add(item3);
		
		if(item1.toString() == item2.toString()) {
			System.out.println("item1 = item2");
		}
		
		if(item2.toString() == item3.toString()) {
			System.out.println("item2 = item3");
		}
		
		if(item1.toString() == item3.toString()) {
			System.out.println("item1 = item3");
		}
		
		if(item1 != item2 && item2 != item3 && item1 != item3) {
			System.out.println("Nenhum dos itens são iguais");
		}
		/*
		if(item1 != "leite") {
			System.out.println("Item 1 É IGUAL");
		}
		
		if(item2 != "leite") {
			System.out.println("Item 2 É IGUAL");
		}
		
		if(item3 != "leite") {
			System.out.println("Item 3 É IGUAL");
		}
		
		
		System.out.println("Digite num1");
		int num1 = sc.nextInt();
		
		System.out.println("Digite num2");
		int num2 = sc.nextInt();
		
		System.out.println("Digite num3");
		int num3 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("num1 = num2");
		}
		
		if(num2 == num3) {
			System.out.println("num2 = num3");
		}
		
		if(num1 == num3) {
			System.out.println("num1 = num3");
		}
		
		if(num1 != num2 && num2 != num3 && num1 != num3) {
			System.out.println("Nenhum dos números digitados são iguais");
		}
		
		*/
		
		
		System.out.println("Digite item 1: ");
		String item1 = sc.next();
		
		
		System.out.println("Digite item 2: ");
		String item2 = sc.next();
	
		
		System.out.println("Digite item 3: ");
		String item3 = sc.next();
		
		
		if(item1.equals(item2)) {
			System.out.println("item1 = item2");
		}
		
		if(item2.equals(item3)) {
			System.out.println("item2 = item3");
		}
		
		if(item1.equals(item3)) {
			System.out.println("item1 = item3");
		}
		
		if(item1 != item2 && item2 != item3 && item1 != item3) {
			System.out.println("Nenhum dos itens são iguais");
		}
	}

}
