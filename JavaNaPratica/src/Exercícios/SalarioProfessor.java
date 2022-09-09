package Exercícios;

public class SalarioProfessor {

	public static void main(String[] args) {
		/*Desenvolver um código que efetue o cálculo do salário líquido de um professor, você precisará
		 * dos seguintes dados:
		 * valor da hora/aula, qtd de aulas dadas no mês e o percentual de desconto do INSS. 
		 * Deve-se também obter o salário bruto para poder efetuar o cálculo do salário líquido.
		 */

		
		int horasTrabalhadas; //horas trabalhadas no mês.
		
		double valorHoraAula; //valor da hora/aula
		
		double percentualDesconto; // percentual de desconto
		
		double salarioBruto; //Salário bruto obtido pela multiplicação de horasTrabalhadas e valorHoraAula
		
		double totalDesconto; //total de desconto obtido pela divisão de percentualDesconto por 100 multiplicado por salarioBruto
		
		double salarioLiquido; //salário líquido calculado pela subtração dos descontos do salarioBruto
		
		//Exibir na tela os valores do salário líquido e do salário bruto
		
		horasTrabalhadas = 70;
		valorHoraAula = 30.0D;
		percentualDesconto = 7.5D;
		salarioBruto = horasTrabalhadas * valorHoraAula;
		totalDesconto = (percentualDesconto / 100) * salarioBruto;
		salarioLiquido = salarioBruto - totalDesconto;
		
		
		System.out.println("Salário Bruto = "  + salarioBruto);
		System.out.println("Salário Líquido = " + salarioLiquido);
	}

}
