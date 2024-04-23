package estrutura_switch;

import java.util.Scanner;

public class Selecao_Switch {
    public static void main(String[] args) {

        System.out.println("Bem-vind@ ao canal! Temos as seguintes opções:");
		System.out.println("1. Se inscrever no canal");
		System.out.println("2. Dar like no vídeo");
		System.out.println("3. Compartilhar com os amigos");
		System.out.println("4. Ativar as notificações");
		System.out.println("Digite a opção desejada:");

        Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		String mensagem = switch(opcao) {
			case 1 -> "Obrigado por se inscrever.";
			case 2 -> "Obrigado pelo like.";
			case 3 -> "Obrigado por compartilhar.";
			case 4 -> "Obrigado por ativar as notificações.";
			default -> "Opção não suportada.";

        };
        System.out.println(mensagem);
        scanner.close();
    }
    
}
