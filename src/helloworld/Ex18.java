//Potência sem usar Math.pow
// Potência: base^expoente = multiplicar a base por ela mesma "expoente" vezes
// Exemplo: 2^3 = 2 × 2 × 2 = 8

package helloworld;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Base: ");
        int base = sc.nextInt();
 
        System.out.print("Expoente: ");
        int expoente = sc.nextInt();
 
        long resultado = 1; // Começa em 1 (elemento neutro da multiplicação)
 
        for (int i = 0; i < expoente; i++) {  // Repete a multiplicação "expoente" vezes
            resultado = resultado * base;       // A cada volta, multiplica o resultado pela base
            // Exemplo base=2, expoente=3:
            //   i=0 → resultado = 1 × 2 = 2
            //   i=1 → resultado = 2 × 2 = 4
            //   i=2 → resultado = 4 × 2 = 8
        }
 
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}