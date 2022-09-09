package Exercícios;

import java.util.*;
public class Ordena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner infor= new  Scanner (System.in);
		int x, y, z;
		
		System.out.println("Digite o valor de x: ");
		x = infor.nextInt();
		System.out.println("Digite o valor de y: ");
		y = infor.nextInt();
		
		if (x < y) { 
			System.out.print(x + ", " + y);
		} else {
			System.out.print(y + ", " + x);
		}

	}

}
