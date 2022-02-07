package primeiraSprint;

import java.util.Scanner;

public class QuestaoNoveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// quantidade de funcionarios
		System.out.println("QUANTOS funcionarios deseja cadastrar? 	");
		int quantidadeFuncionarios = input.nextInt();
		System.out.println("================================================");
		double[] salarioCadastrado = new double[quantidadeFuncionarios];
		String[] nomeCadastrado = new String[quantidadeFuncionarios];
		double bonus;
		double salarioLiquido;

		for (int i = 0; i < quantidadeFuncionarios; i++) {

			System.out.println("Digite o NOME do fucionario " + ("["+(i+1)+"]"));
			String nome = input.next();
			nomeCadastrado[i] = nome;
			System.out.println("Digite o SALARIO do fucionario " + ("["+(i+1)+"]"));
			double salario = input.nextDouble();
			salarioCadastrado[i] = salario;
			System.out.println("==========**********============");
		}	
		//clearScreen();

		for (int i = 0; i < quantidadeFuncionarios; i++) {

			if (salarioCadastrado[i] <= 1000) {
				bonus = salarioCadastrado[i] * 0.2;
				salarioLiquido = salarioCadastrado[i] + bonus;
				System.out.println(" NOME: " + nomeCadastrado[i] + "\n SALARIO: " + salarioCadastrado[i] + "\n BONUS: "
						+ bonus + "\n SALARIO LIQUIDO: " + salarioLiquido);
				System.out.println("==========**********============");
			} else if (salarioCadastrado[i] > 1000 && salarioCadastrado[i] < 2000) {
				bonus = salarioCadastrado[i] * 0.1;
				salarioLiquido = salarioCadastrado[i] + bonus;
				System.out.println(" NOME: \n" + nomeCadastrado[i] + "\n SALARIO: " + salarioCadastrado[i] + "\n BONUS: "
						+ bonus + "\n SALARIO LIQUIDO: " + salarioLiquido);
				System.out.println("==========**********============");
			} else {
				double desconto = salarioCadastrado[i] * 0.1;
				salarioLiquido = salarioCadastrado[i] - desconto;
				System.out.println(" NOME: " + nomeCadastrado[i] + "\n SALARIO: " + salarioCadastrado[i] + "\n DESCONTO: "
						+ desconto + "\n SALARIO LIQUIDO: " + salarioLiquido);
				System.out.println("==========**********============");
			}

		}
		input.close();
		System.out.println(" ");
		System.out.println("==========FIM============");
	}

	/*public static void clearScreen() {
		for (int i = 0; i < 100; ++i)
			System.out.println();
	}*/

}
