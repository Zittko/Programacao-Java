package aula5;
import java.util.Scanner;


public class Lista7 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        int cargo, hde, dds;
        int[] duteis = {2, 3, 4, 5, 6};
        System.out.println("Qual o seu cargo? \n 1 - Gerente\n 2 - Supervisor\n 3 - Funcionario");
        cargo = input.nextInt();
        System.out.println("Qual seu horario de entrada? (0 - 23)");
        hde = input.nextInt();
        System.out.println("Qual dia da semana? \n 1 - Domingo \n 2 - Segunda \n 3 - Terça \n 4 - Quarta \n 5 - Quinta \n 6 - Sexta \n 7 - Sabado");
        dds = input.nextInt();
        if (cargo == 1) {
            System.out.println("Acesso total");  
        } else if (cargo == 2) {
            if (hde >= 6 || hde <= 22) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Acesso negado, pois está fora do horário permitido");
            }
        } else if (cargo == 3) {
            if (hde >= 8 || hde <= 18) {
                if (dds == duteis[dds]) {
                    System.out.println("Acesso parmitido");
                } else {
                    System.out.println("Acesso negado, pois está em um dia não util");
                }
            } else {
                System.out.println("Acesso negado, pois está fora do horário permitido");
            }
        } else {
            System.out.println("Acesso negado, pois não se aplica a nenhuma opção para ter o acesso permitido");
        }
    }
    
}
