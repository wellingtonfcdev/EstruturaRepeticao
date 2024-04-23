package estrutura_if;

import java.util.Scanner;

public class EstruturaDeSelecao {

    public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("Bem-vind@ ao canal! Temos as seguintes opções:");
		System.out.println("1. Se inscrever no canal");
		System.out.println("2. Dar like no vídeo");
		System.out.println("3. Compartilhar com os amigos");
		System.out.println("4. Ativar as notificações");
		System.out.println("Digite a opção desejada:");
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		if(opcao == 1) 
			System.out.println("Obrigado por se inscrever");
		else if(opcao == 2)
		
			System.out.println("Obrigado pelo Like");
		else if(opcao == 3)
			System.out.println("Obrigado por compartilhar");
		else if(opcao == 4)
			System.out.println("Obrigado por ativar as notificações");
		else
			System.out.println("Opção não suportada");
		
		scanner.close();
	}
} 