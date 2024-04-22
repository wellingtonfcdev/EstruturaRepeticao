
package estrutura_if;

import java.util.Scanner;

public class ChecadorDeIdentidade {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        //if (idade > 18) {
        //    System.out.println("Pode comprar o ingresso.");
        //}else{
        //    System.out.println("Esse filme é para maiores de 18 anos!");
        //}

        //If Ternário
        String validacao = (idade > 18) ? "Pode comprar o ingresso." : "Esse filme é para maiores de 18 anos!";

        System.out.println(validacao);
        scanner.close();
    }
}