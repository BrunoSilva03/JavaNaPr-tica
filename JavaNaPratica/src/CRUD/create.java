package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class create {

	public void inserir(ArrayList<String> lista) {
		Scanner sc = new Scanner(System.in);
		String item = new String();
		System.out.println("Digite o item a ser adicionado na lista: ");
		item = sc.nextLine();
		lista.add(item);
	}
}
