package primeiraSprint;

import java.util.Calendar;
import java.util.Scanner;

public class QuestaoOitoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner input = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Calendar data = Calendar.getInstance();

		// usuarios que estao cadastrados no sistema
		String usuarios[] = { "joao", "maria", "pedro" };
		String senhas[] = { "987", "321", "123" };
		// captura horas do sistema
		int horas = data.get(Calendar.HOUR_OF_DAY);
		int len = usuarios.length;

		// verifica usuario
		System.out.println("		OLA VAMOS VERIFICAR SEU USUARIO E SENHA EM NOSSO SISTEMA");
		System.out.println("=================================================");
		System.out.println("DIGITE SEU USUARIO: ");
		String login = input.next();
		System.out.println("=================================================");

		// verifica senha
		System.out.println("DIGITE SUA SENHA DE 3 DIGITOS: ");
		System.out.println("");
		System.out.println("=================================================");
		String senha = input.next();
		
		//verifica se no siste existe o usuario e senha digitados
		for (int i = 0; i < len; i++) {

			if (login.equals(usuarios[i]) && senha.equals(senhas[i])) {
				System.out.printf("	Usuário %s logado com sucesso!. ", login);
				System.out.println("");

				if (horas >= 6 && horas <= 12) {
					System.out.println("	Bom dia, você se logou ao nosso sistema.");

				} else if (horas >= 12 && horas < 18) {
					System.out.println("	Boa tarde, você se logou ao nosso sistema.");

				} else if (horas >= 18 && horas < 24) {
					System.out.println("	Boa noite, você se logou ao nosso sistema.");

				} else if (horas >= 0 && horas < 6) {
					System.out.println("	Boa madrugada, você se logou ao nosso sistema.");

				}
				//encerra a execução do sistema
				System.exit(len);
			}

		}

		System.out.println("      			Login ou senha inválidos!	");

	}

}
