// Calcular IMC
// Fórmula: IMC = peso / (altura × altura)

package helloworld;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc); // %.2f = 2 casas decimais

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}