// Soma de 1 até N

package helloworld;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite N: ");
        int n = sc.nextInt();
 
        int soma = 0; // Variável acumuladora — começa em zero
 
        for (int i = 1; i <= n; i++) { // Loop de 1 até n
            soma = soma + i;            // A cada volta, adiciona o valor de i à soma acumulada
            // Exemplo: i=1 → soma=1 | i=2 → soma=3 | i=3 → soma=6 ...
        }
 
        System.out.println("Soma de 1 até " + n + " = " + soma);
    }
}
 