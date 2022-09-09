package Exercícios;

import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo e mostraremos a sequência de fibonacci com esta quantidade de números: ");
		num = sc.nextInt();
		
		if(num < 3) {
			switch(num) {
			case 0: {
				System.out.print("Precisamos de pelo menos um número para fazer a sequência de Fibonacci");
				break;
			}
			case 1: {
				System.out.print(1);
				break;
			}
			case 2: {
				System.out.print("1, 1");
				break;
			} 
			}
		}else {
		
		int[] vetor = new int[num];
		vetor[0] = 1;
		vetor[1] = 1;
		vetor[2] = 2;
		
	
		System.out.print(vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", ");
		for(int i = 3; i < num; i++) {
			vetor[i] = vetor[i - 1] + vetor[i - 2];
			System.out.print(vetor[i] + ", ");
		}
		
		
		}
	}

}
