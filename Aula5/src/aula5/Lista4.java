package aula5;
import java.util.Scanner;

public class Lista4 {
    public static void lista4(String[] args){
        Scanner input = new Scanner(System.in);
        
        int idade, renda, tdt, nome;
        System.out.println("Qual a sua renda?");
        renda = input.nextInt();
        System.out.println("Qual a sua idade?");
        idade = input.nextInt();
        System.out.println("Seu nome está negativado? \n1 - Sim \n2 - Não");
        nome = input.nextInt();
        if (renda < 2500 || (idade < 21 || idade > 65) || nome == 1) {
            System.out.println("Não poderá receber credito");
        } else if (renda >= 2500 && renda <= 4999) {
            System.out.println("Quantos anos trabalhados você tem?");
            tdt = input.nextInt();
            if (tdt >= 2 ) {
                System.out.println("Pode receber credito");
            }
        } else if (renda >= 5000) {
            System.out.println("Pode receber credito");
        } else {
            System.out.println("Credito negado");
        }
    }
}
