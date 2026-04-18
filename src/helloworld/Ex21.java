//Ler 10 números e mostrar o maior

package helloworld;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // cria 10 espaços

        // Passo 1: preencher o array
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Passo 2: assumir que o primeiro é o maior
        int maior = numeros[0];

        // Passo 3: comparar com os outros
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; // atualiza se encontrar um maior
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}