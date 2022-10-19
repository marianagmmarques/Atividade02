import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
    //2. Escreva um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
    Scanner ler = new Scanner(System.in);

    System.out.println("Escreva o número 1: ");
    int numero1 = ler.nextInt();
    System.out.println("Escreva o número 2: ");
    int numero2 = ler.nextInt();
    System.out.println("Escreva o número 3: ");
    int numero3 = ler.nextInt();
    
    if (numero1 > numero2 && numero1 > numero3) {
        System.out.println("O número maior é o número 1: "+numero1);
    } else if (numero2 > numero1 && numero2 > numero3) {
        System.out.println("O número maior é o número 2: "+numero2);
    } else{
        System.out.println("O número maior é o número 3: "+numero3);
    }

    if (numero1 < numero2 && numero1 < numero3) {
        System.out.println("O número menor é o número 1: "+numero1);
    } else if (numero2 < numero1 && numero2 < numero3) {
        System.out.println("O número menor é o número 2: "+numero2);
    } else{
        System.out.println("O número maior é o número 3: "+numero3);
    }
    ler.close();
    }
}
