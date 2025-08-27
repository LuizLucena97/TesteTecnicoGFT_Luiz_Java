package Desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        //Laço para a quantidade de dígitos
        while (numero > 9) {
            int somaDigitos = 0;

            //Laço para percorrer o número
            while (numero > 0) {
                // Pego o último dígito usando o resto da divizão por 10
                somaDigitos += numero % 10;
                // Removo o último dígito dividindo por 10
                numero /= 10;
            }

            // Atualizo o número com a soma dos dígitos
            numero = somaDigitos;
        }

        System.out.println("Resultado final: " + numero);

        scanner.close();
    }
}

