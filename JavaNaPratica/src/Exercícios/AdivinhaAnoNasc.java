package Exercícios;

import java.util.Calendar;
import java.util.Scanner;

public class AdivinhaAnoNasc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int age;
		int yearOfBirth;
		
		
			System.out.println("Digite um nome: ");
			name = sc.toString();
		
		
		
			System.out.println("Digite a sua idade atual: ");
			age = sc.nextInt();
			
		
		
		
		yearOfBirth = year - age;
		
		System.out.println("Você nasceu no ano de " + yearOfBirth);
		
		

	}

}
