// Fatorial
//Fatorial de 5 = 5 × 4 × 3 × 2 × 1 = 120

package helloworld;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
 
        long fatorial = 1; // Usamos long (e não int) porque fatoriais ficam números muito grandes
                           // long suporta números maiores que int
 
        for (int i = 1; i <= n; i++) {  // Loop de 1 até n
            fatorial = fatorial * i;     // Multiplica o acumulador pelo valor atual de i
            // Exemplo: i=1 → fat=1 | i=2 → fat=2 | i=3 → fat=6 | i=4 → fat=24 ...
        }
 
        System.out.println("Fatorial de " + n + " = " + fatorial);
    }
}