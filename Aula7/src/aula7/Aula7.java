package aula7;
import java.util.Scanner;

public class Aula7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade, febre, tosse, garganta, coriza, faltar, op = 0;
        boolean gripe = false, resf = false, alergia = false, alert = false, saud = false;
        System.out.println("Qual o seu nome?");
        nome = input.next();
        System.out.println("Qual a sua idade?");
        idade = input.nextInt();
        System.out.println("Você está com febre? (1 - Sim/0 - Não)");
        febre = input.nextInt();
        System.out.println("Você está com tosse? (1 - Sim/0 - Não)");
        tosse = input.nextInt();
        System.out.println("Você está com dor de garganta? (1 - Sim/0 - Não)");
        garganta = input.nextInt();
        System.out.println("Você está com coriza? (1 - Sim/0 - Não)");
        coriza = input.nextInt();
        System.out.println("Você está com falta de ar? (1 - Sim/0 - Não)");
        faltar = input.nextInt();
        do {
            System.out.println("------------ MENU ------------ \n1 - Ver diagnóstico\n2 - Ver recomendações\n3 - Informar novos sintomas\n4 - Sair\n------------------------------");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("-------- DIGANÓSTICO --------");
                    System.out.println("Nome: "+nome);
                    System.out.println("Idade: "+idade);
                    System.out.print("Possível doença: ");
                    if (febre == 1 && tosse == 1 && garganta == 1) {
                        System.out.println("Probabilidade alta para gripe");
                        gripe = true;
                    } else if (coriza == 1 && tosse == 1) {
                        System.out.println("Probabilidade alta para resfriado");
                        resf = true;
                    } else if (coriza == 1 && febre == 0) {
                        System.out.println("Probabilidade alta para alergia");
                        alergia = true;
                    } else if (faltar == 1) {
                        System.out.println("Situação emergencial grave");
                        alert = true;
                    } else {
                        System.out.println("Não doente, está liberado");
                        saud = true;
                    }
                    System.out.println("------------------------------");
                    break;
                case 2:
                    System.out.println("-------- RECOMENDAÇÃO --------");
                    if (gripe == true) {
                        System.out.println("Recomendação em caso de gripe:");
                        System.out.println("- Procurar um médico");
                    } else if (resf == true) {
                        System.out.println("Recomendação em caso de resfriado:");
                        System.out.println("- Tomar um banho quente");
                    } else if (alergia == true) {
                        System.out.println("Recomendação em caso de alergia:");
                        System.out.println("- Evitar lugares fechados");
                    } else if (alert == true) {
                        System.out.println("Recomendação em caso de alerta:");
                        System.out.println("- Buscar um médico imediatamente");
                    } else if (saud == true) {
                        System.out.println("Recomendação em caso de estar saudável:");
                        System.out.println("- Ir para casa e descansar");
                    } else {
                        System.out.println("ERRO DE SINTAXE");
                    }
                    System.out.println("------------------------------");
                    break;
                case 3:
                    // Início
                    System.out.println("Você está com febre? (1 - Sim/0 - Não)");
                    febre = input.nextInt();
                    System.out.println("Você está com tosse? (1 - Sim/0 - Não)");
                    tosse = input.nextInt();
                    System.out.println("Você está com dor de garganta? (1 - Sim/0 - Não)");
                    garganta = input.nextInt();
                    System.out.println("Você está com coriza? (1 - Sim/0 - Não)");
                    coriza = input.nextInt();
                    System.out.println("Você está com falta de ar? (1 - Sim/0 - Não)");
                    faltar = input.nextInt();
                    // Fim
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (op != 4);
    }
}