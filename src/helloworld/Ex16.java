//Inverter string

package helloworld;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
 
        String invertida = ""; // Começa com uma string vazia que vai receber as letras ao contrário
 
        // Loop começa do último índice (length-1) e vai decrementando até 0
        for (int i = palavra.length() - 1; i >= 0; i--) { // i-- diminui 1 a cada volta
            invertida = invertida + palavra.charAt(i);     // Vai concatenando as letras do fim pro início
        }
 
        System.out.println("Invertida: " + invertida);
    }
}