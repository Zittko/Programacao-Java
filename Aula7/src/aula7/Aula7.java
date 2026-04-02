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
                        System.out.println("Gripe");
                        System.out.println("------------------------------");
                        gripe = true;
                    } else if (coriza == 1 && tosse == 1) {
                        System.out.println("Resfriado");
                        System.out.println("------------------------------");
                        resf = true;
                    } else if (coriza == 1 && febre == 0) {
                        System.out.println("Alergia");
                        System.out.println("------------------------------");
                        alergia = true;
                    } else if (faltar == 1) {
                        System.out.println("Alerta emergencial grave");
                        System.out.println("------------------------------");
                        alert = true;
                    } else {
                        System.out.println("Não doente ou sintomas não se aplicam no sistema");
                        System.out.println("------------------------------");
                        saud = true;
                    }
                    break;
                case 2:
                    if (gripe == true) {
                        System.out.println("-------- RECOMENDAÇÃO --------");
                        System.out.println("Recomendação em caso de gripe:");
                        System.out.println("- Procurar um médico");
                        System.out.println("------------------------------");
                    } else if (resf == true) {
                        System.out.println("-------- RECOMENDAÇÃO --------");
                        System.out.println("Recomendação em caso de resfriado:");
                        System.out.println("- Tomar um banho quente");
                        System.out.println("------------------------------");
                    } else if (alergia == true) {
                        System.out.println("-------- RECOMENDAÇÃO --------");
                        System.out.println("Recomendação em caso de alergia:");
                        System.out.println("- Evitar lugares fechados");
                        System.out.println("------------------------------");
                    } else if (alert == true) {
                        System.out.println("-------- RECOMENDAÇÃO --------");
                        System.out.println("Recomendação em caso de alerta:");
                        System.out.println("- Buscar um médico imediatamente");
                        System.out.println("------------------------------");
                    } else if (saud == true) {
                        System.out.println("-------- RECOMENDAÇÃO --------");
                        System.out.println("Recomendação em caso de estar saudável:");
                        System.out.println("- Ir para casa e descansar");
                        System.out.println("------------------------------");
                    } else {
                        System.out.println("ERRO DE SINTAXE");
                    }
                    break;
                case 3:
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