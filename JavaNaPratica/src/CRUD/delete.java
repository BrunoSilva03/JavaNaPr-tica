package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class delete {

	public void remover(ArrayList<String> lista) {
		String elementLista = new String();
		Scanner sc = new Scanner(System.in);

		if (!lista.isEmpty()) {
			System.out.println("Digite o elemento que você quer excluir da lista");
			elementLista = sc.nextLine();

			if (lista.contains(elementLista)) {
				lista.remove(elementLista);
				System.out.println("Elemento removido da lista com Sucesso!");
			} else {
				System.out.println("O elemento especificado não se encontra presenta na lista nesse momento!");
			}
		} else {
			System.out.println(
					"Não é possível remover nenhum elemento da lista já que a mesma se encontra vazia atualmente!");
		}

	}
}
