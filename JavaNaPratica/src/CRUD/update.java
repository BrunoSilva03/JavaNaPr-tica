package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class update {

	public void alterar(ArrayList<String> lista) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento.");
		} else {
			Scanner sc = new Scanner(System.in);
			String elementoAnterior = new String();
			String novoElemento = new String();
			
			System.out.println("Digite o elemento da lista a ser substituído");
			elementoAnterior = sc.nextLine();
			
			if(lista.contains(elementoAnterior)) {
				System.out.println("Digite o elemento que que substituirá " + elementoAnterior);
				novoElemento = sc.nextLine();
				
				for(int i = 0; i < lista.size(); i++) {
					System.out.println("elementoAnterior = " + elementoAnterior);
					System.out.println("lista.get(i) = " + lista.get(i));
					if(elementoAnterior.equals(lista.get(i))) {
						lista.set(i, novoElemento);
					}
				}
				
				System.out.println("Elemento Alterado na lista com Sucesso!");
				
			} else {
				System.out.println("O elemento especificado não encontra-se na lista neste momento");
			}
		}
	}
}
