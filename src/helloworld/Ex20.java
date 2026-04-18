//Calculadora simples

package helloworld;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Primeiro número: ");
        double a = sc.nextDouble(); // Usa double para suportar números decimais
 
        System.out.print("Operação (+, -, *, /): ");
        char op = sc.next().charAt(0); // sc.next() lê uma palavra, .charAt(0) pega o primeiro caractere
                                       // char é o tipo para um único caractere
 
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
 
        // switch verifica o valor de "op" e executa o caso correspondente
        switch (op) {
            case '+':                                   // Se op for '+'
                System.out.println("Resultado: " + (a + b));
                break;                                  // break sai do switch para não continuar nos outros casos
 
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
 
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
 
            case '/':
                if (b != 0) {                           // Nunca podemos dividir por zero!
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
 
            default:                                    // default é executado se nenhum case bater
                System.out.println("Operação inválida!");
        }
    }
}