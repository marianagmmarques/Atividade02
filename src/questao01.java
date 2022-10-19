import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) throws Exception {
    //1. Escreva um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero
    Scanner ler = new Scanner(System.in);

    System.out.println("Escreva um número:");
    int numero = ler.nextInt();

    if (numero == 0) {
        System.out.println("Seu número "+numero+" é igual a 0.");
    } else if(numero > 0){
        System.out.println("Seu número "+numero+" é maior que 0.");
    } else{
        System.out.println("Seu número "+numero+" é menor que 0.");
    }
    ler.close();
    }
}
