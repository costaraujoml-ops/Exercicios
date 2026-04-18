//Contar vogais em uma string

package helloworld;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase(); // .toLowerCase() transforma tudo em minúsculo
                                                      // para não precisar checar A e a separadamente
 
        int contador = 0; // Variável para contar as vogais encontradas
 
        for (int i = 0; i < palavra.length(); i++) { // .length() retorna o tamanho da string
                                                      // Loop percorre da posição 0 até o fim
            char letra = palavra.charAt(i); // .charAt(i) pega a letra na posição i
                                            // char é o tipo para um único caractere
 
            // Verifica se a letra é uma vogal usando || (operador OU)
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++; // contador++ é o mesmo que contador = contador + 1
            }
        }
 
        System.out.println("Número de vogais: " + contador);
    }
}