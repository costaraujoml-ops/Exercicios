//Verificar número primo

package helloworld;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
 
        boolean primo = true; // boolean é um tipo que só aceita true (verdadeiro) ou false (falso)
                              // Começa assumindo que é primo
 
        if (n < 2) {                   // Números menores que 2 não são primos por definição
            primo = false;
        } else {
            for (int i = 2; i < n; i++) {   // Testa todos os divisores entre 2 e n-1
                if (n % i == 0) {           // Se o resto da divisão for 0, encontrou um divisor
                    primo = false;          // Então não é primo
                    break;                  // Para o loop imediatamente, não precisa testar mais
                }
            }
        }
 
        if (primo) {                          // Se ainda for verdadeiro após o loop
            System.out.println(n + " é primo");
        } else {
            System.out.println(n + " não é primo");
        }
    }
}