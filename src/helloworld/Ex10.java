//Positivo, negativo ou zero

package helloworld;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
 
        if (n > 0) {              // Se n for maior que zero
            System.out.println("Positivo");
        } else if (n < 0) {       // Se n for menor que zero
            System.out.println("Negativo");
        } else {                  // A única possibilidade que sobra é n = 0
            System.out.println("Zero");
        }
    }
}
 