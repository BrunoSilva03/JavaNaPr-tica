package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class crudBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		create c = new create();
		read r = new read();
		update u = new update();
		delete d = new delete();
		int opcao = 1;

		ArrayList<String> lista = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("BEM - VINDO(A)");
		while (opcao != 0) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Exibir Lista");
			System.out.println("2 - Inserir elemento na lista");
			System.out.println("3 - Excluir elemento da lista");
			System.out.println("4 - Alterar elemento na lista");
			System.out.println("5 - Limpar lista");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();

			switch (opcao) {

			case 0: {
				System.out.println("Finalizando CRUD Básico");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				System.exit(opcao);
			}
				break;

			case 1: {
				r.exibir(lista);
			}
				break;

			case 2: {
				c.inserir(lista);
			}
				break;

			case 3: {
				d.remover(lista);
			}
				break;

			case 4: {
				u.alterar(lista);
			}
				break;

			case 5: {
				lista.clear();
				System.out.println("A lista foi esvaziada com Sucesso!!!");
			}
				break;

			default: {
				System.out.println("Opção inválida, Tente novamente: ");
			}
				break;

			}

		}

	}

}
