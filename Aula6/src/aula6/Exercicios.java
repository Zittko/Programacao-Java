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
        System.out.println("------------ EXTRA ------------");
        int op = 0, op2 = 0;
        long rg = 0, cpf = 0;
        do {
            System.out.println("***** CADASTRO DE CLIENTES *****");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            op = input.nextInt();
            switch(op) {
                case 1:
                    System.out.println("Digite o seu rg");
                    rg = input.nextLong();
                    System.out.println("Digite o seu cpf");
                    cpf = input.nextLong();
                    System.out.println("1 - Continuar 2 - Sair");
                    op2 = input.nextInt();
                    break;
                case 2:
                    System.out.println("RG: "+ rg);
                    System.out.println("CPF: "+ cpf);
                    break;
                case 3:
                    System.out.println("Digite o seu rg");
                    rg = input.nextLong();
                    System.out.println("Digite o seu cpf");
                    cpf = input.nextLong();
                    break;
                case 4:
                    rg = 0;
                    cpf = 0;
                    break;
            }
        } while (op != 5);
        System.out.println("------------ DESAFIO ------------");
        double temp, umi;
        int regChuva;
        String houveChuva;
        System.out.println("Digite a temperatura atual em graus Celsius (°C)");
        System.out.print("n°C: ");
        temp = input.nextDouble();
        System.out.println("Digite a umidade do ar em %");
        System.out.print("n%: ");
        umi = input.nextDouble();
        System.out.println("Houve registro de chuva nos últimos dias?");
        System.out.println("1 - Sim");
        System.out.println("0 - Não");
        regChuva = input.nextInt();
        if (regChuva == 1) {
            houveChuva = "Sim";
        } else {
            houveChuva = "Não";
        }
        System.out.println("Temperatura: " + temp);
        System.out.println("Umidade: " + umi);
        System.out.println("Chuva recente: " + houveChuva);
        if (temp < 30 && umi > 50 && regChuva == 1) {
            System.out.println("Classificação: RISCO BAIXO DE QUEIMADAS");
        } else if ((temp >= 30 && temp <= 35) && (umi >= 30 && umi <= 50) && regChuva == 0) {
            System.out.println("Classificação: RISCO MÉDIO DE QUEIMADAS");
        } else if (temp > 35 && umi < 30 && regChuva == 0) {
            System.out.println("Classificação: RISCO ALTO DE QUEIMADAS");
        } else {
            System.out.println("Classificação: RISCO BAIXO DE QUEIMADAS");
        }
    }
}