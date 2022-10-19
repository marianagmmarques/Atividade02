import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
    //3. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16).
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite sua idade:");
    int idade = ler.nextInt();

    if (idade>=16) {
        System.out.println("Você já pode votar!");        
    } else {
        System.out.println("Você não pode votar, lamento!");
    }
    ler.close();
    }
}
