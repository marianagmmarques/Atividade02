import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
    //4. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode dirigir (idade>=18).
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite sua idade:");
    int idade = ler.nextInt();

    if (idade>=18) {
        System.out.println("Você já pode dirigir!");        
    } else {
        System.out.println("Você não pode dirigir, lamento!");
    }
    ler.close();
    }
}
