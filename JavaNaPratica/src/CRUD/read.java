package CRUD;

import java.util.ArrayList;

public class read {

	public void exibir(ArrayList<String> lista) {
		int n = lista.size();

		if (n == 0) {
			System.out.println("A lista está vazia");
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("Posição %d- %s\n", i, lista.get(i));
		}
	}
}
