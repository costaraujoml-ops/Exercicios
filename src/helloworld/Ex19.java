//Fequência Fibonacci
//Fibonacci: cada número é a soma dos dois anteriores → 0, 1, 1, 2, 3, 5, 8, 13...

package helloworld;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Quantos termos da sequência? ");
        int n = sc.nextInt();
 
        long a = 0; // Primeiro termo da sequência
        long b = 1; // Segundo termo da sequência
 
        System.out.print("Fibonacci: " + a); // Já imprime o primeiro termo
 
        for (int i = 1; i < n; i++) {        // Loop começa em 1 porque o primeiro já foi impresso
            System.out.print(", " + b);       // Imprime o próximo termo
 
            long proximo = a + b; // Calcula o próximo: soma dos dois anteriores
            a = b;                // "Anda" para frente: a recebe o valor de b
            b = proximo;          // b recebe o novo próximo
            // Exemplo:
            //   a=0, b=1 → próximo=1, a=1, b=1
            //   a=1, b=1 → próximo=2, a=1, b=2
            //   a=1, b=2 → próximo=3, a=2, b=3 ...
        }
 
        System.out.println(); // Pula uma linha no final
    }
}
 