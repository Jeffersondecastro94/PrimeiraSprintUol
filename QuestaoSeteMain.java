package primeiraSprint;
import java.util.Random;
import java.util.Scanner;
public class QuestaoSeteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		try (Scanner input = new Scanner(System.in)) {
			
			// pergutas armazenadas
			String[] perguntas = { "Qual a capital de Pernambuco? ", "Qual a capital da Bahia? ",
					"Qual a capital do Ceará? ", "Qual a capital do Distrito Federal? " };

			// possiveis respostas corretas armazenadas
			String[] respostasCorretas = { "recife", "salvador", "fortaleza", "brasilia", "rio branco", "belem",
					"porto velho", "boa vista", "palmas", "sao luiz", "joao pessoa", "terezina", "natal", "aracaju",
					"goiania", "campo grande", "cuiaba", "vitoria", "belo horizonte", "rio de janeiro", "sao paulo",
					"porto alegre", "florianopolis", "manaus", "macapa", "maceio", "fortaleza", "curitiba" };

			// serve para rodas o programa de acordo com a quantidade de perguntas
			// armazenadas
			int len = perguntas.length;

			int tamanhoPossiveisRespostas = respostasCorretas.length;

			// array para guardar respostas do usuario
			String[] respostas = new String[tamanhoPossiveisRespostas];

			// contadores de acertos
			int contadorAcerto = 0;
			int contadorErro = 0;

			// INICIO DO PROGRAMA

			System.out
					.println("                   ==============BEM VINDO AO QUIZ DE CAPITAIS DO BRASIL==============");
			System.out.println();
			System.out.println("Informe seu nome: ");
			String userName = input.next();

			// PERGUNTAS
			for (int i = 0; i < len; i++) {
				int numero = random.nextInt(tamanhoPossiveisRespostas);
				if (numero < 9) {
					numero = numero + 4;

					int numero1 = numero + 8;
					int numero2 = numero + 7;
					int numero3 = numero + 10;
					System.out.println(userName + ", " + perguntas[i]);
					System.out.println();
					System.out.println("DIGITE A PALAVRA DE SUA ESCOLHA");
					System.out.println(">> - " + respostasCorretas[numero]);
					System.out.println(">> - " + respostasCorretas[numero3]);
					System.out.println(">> - " + respostasCorretas[numero1]);
					System.out.println(">> - " + respostasCorretas[numero2]);
					System.out.println(">> - " + respostasCorretas[i]);
					System.out.println();

				} else if (numero == 9 && numero < 15) {

					int numero1 = numero - 2;
					int numero2 = numero - 3;
					int numero3 = numero - 1;

					System.out.println(userName + ", " + perguntas[i]);
					System.out.println();
					System.out.println("DIGITE A PALAVRA DE SUA ESCOLHA");
					System.out.println(">> - " + respostasCorretas[numero]);
					System.out.println(">> - " + respostasCorretas[numero1]);
					System.out.println(">> - " + respostasCorretas[i]);
					System.out.println(">> - " + respostasCorretas[numero3]);
					System.out.println(">> - " + respostasCorretas[numero2]);
					System.out.println();

				} else {
					int numero1 = numero - 2;
					int numero2 = numero - 3;
					int numero3 = numero - 1;

					System.out.println(userName + ", " + perguntas[i]);
					System.out.println();
					System.out.println("DIGITE A PALAVRA DE SUA ESCOLHA");
					System.out.println(">>  " + respostasCorretas[i]);
					System.out.println(">>  " + respostasCorretas[numero1]);
					System.out.println(">>  " + respostasCorretas[numero3]);
					System.out.println(">>  " + respostasCorretas[numero]);
					System.out.println(">>  " + respostasCorretas[numero2]);
					System.out.println();
				}

				// RESPOSTAS DO USUARIO
				System.out.println("Digite sua resposta: ");
				String respostasUser = respostas[i] = input.next();

				if (respostasUser.equalsIgnoreCase(respostasCorretas[i])) {

					System.out.println("Parabéns você ACERTOU");
					System.out.println("=============================================");
					contadorAcerto++;
				} else {
					System.out.println("Infelizmente você ERROU");
					System.out.println("=============================================");
					contadorErro++;
				}

				if (i == len - 1) {
					System.out.println("FIM DO QUIZ, " + userName + "!!");
					System.out.println("VOCÊ ACERTOU: " + contadorAcerto);
					System.out.println("VOCÊ ERROU: " + contadorErro);
				}

			}
		}

	}

}
