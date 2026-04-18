//Tabuada de um número

package helloworld;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Tabuada de qual número? ");
        int n = sc.nextInt();
 
        // Estrutura do for: (valor inicial ; condição para continuar ; incremento)
        for (int i = 1; i <= 10; i++) { // i começa em 1, roda enquanto i <= 10, aumenta 1 a cada volta
            System.out.println(n + " x " + i + " = " + (n * i)); // Imprime a linha da tabuada
        }
    }
}