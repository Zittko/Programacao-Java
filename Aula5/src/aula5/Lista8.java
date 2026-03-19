package aula5;
import java.util.Scanner;

public class Lista8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp, tos, far, sox;
        
        System.out.println("Qual a temperatura do paciente?");
        temp = input.nextDouble();
        System.out.println("Paciente está com tosse?\n1 - Sim\n2 - Não");
        tos = input.nextDouble();
        System.out.println("Paciente está com falta de ar?\n1 - Sim\n2 - Não");
        far = input.nextDouble();
        System.out.println("Qual a saturação de oxigênio do paciente?");
        sox = input.nextDouble();
        
        if (temp >= 39 && far == 1 && sox < 92) {
            System.out.println("Emergência");
        } else if (temp <= 38 && tos == 1) {
            System.out.println("Suspeita infecciosa");
        } else if (temp <= 37.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Monitoramento");
        }
    }
    
}
