package aula6;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------- EXERCÍCIO 1 --------");
        // EXERCÍCIO 1
        int num = 150;
        while (num <= 300) {
            System.out.println(num);
            num++;
        }
        System.out.println("-------- EXERCÍCIO 2 --------");
        // EXERCÍCIO 2
        int imp = 100;
        while (imp <= 200) {
            if (imp % 2 != 0) {
                System.out.println(imp);
            }
            imp++;
        }
        System.out.println("-------- EXERCÍCIO 3 --------");
        // EXERCÍCIO 3
        int reg = 100;
        while (reg >= 0) {
            System.out.println(reg);
            reg--;
        }
        System.out.println("-------- EXERCÍCIO 4 --------");
        // EXERCÍCIO 4
        int fib1 = 1, fib2 = 1;
        while (fib1 <= 1000) {
            System.out.println(fib1);
            int soma = fib1 + fib2;
            fib1 = fib2;
            fib2 = soma;
        }
    }
}