package Exercícios;

import java.util.*;
public class AreaCirculo {
	public void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double piMatematico = 3.1415D;
		double areaCirculo;
		
		
		System.out.println("Digite o valor do Raio do Círculo: ");
		raio = sc.nextInt();
		
		areaCirculo = piMatematico * (raio*raio);
		
		System.out.println("A área do círculo é: "  + areaCirculo);
		
		 
		
	}

}
