//Verificar palíndromo
//Palíndromo = palavra igual de frente pra trás (ex: "arara", "ovo")
package helloworld;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase(); // Converte para minúsculo para comparação justa
 
        // Reutiliza a lógica do exercício 16 para inverter a palavra
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida = invertida + palavra.charAt(i);
        }
 
        // .equals() compara o CONTEÚDO de duas strings (nunca use == para comparar strings!)
        if (palavra.equals(invertida)) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo.");
        }
    }
}