package aula5;
import java.util.Scanner;

public class Lista6 {
    public static void Lista6 (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fdp;
        float val;
        String vip;
        
        System.out.println("Qual foi o valor da compra?");
        val = input.nextFloat();
        System.out.println("O cliente é VIP? (s/n)");
        vip = input.next();
        vip = vip.toLowerCase();
        switch(vip) {
            case "s":
                System.out.println("O pagamento será À vista ou parcelado?");
                System.out.println("1 - À vista");
                System.out.println("2 - Parcelado");
                fdp = input.nextInt();
                switch(fdp) {
                    case 1:
                        System.out.println("O pagamento terá 20% de desconto");
                        System.out.println("O total é: "+(val - val*0.2));
                        break;
                    case 2:
                        System.out.println("O pagamento terá 10% de desconto");
                        System.out.println("O total da compra é: "+(val - val*0.1));
                        break;
                }
                break;
            case "n":
                System.out.println("O pagamento será parcelado ou à vista?");
                System.out.println("1 - à vista");
                System.out.println("2 - Parcelado");
                fdp = input.nextInt();
                switch(fdp) {
                    case 1:
                        if (val > 500) {
                            System.out.println("O pagamento terá 15% de desconto");
                            System.out.println("O total da compra é: "+(val - val*0.15));
                        } else {
                            System.out.println("O pagamento não terá desconto");
                            System.out.println("O total da compra é: "+val);
                        }
                        break;
                    case 2:
                        if (val > 500) {
                            System.out.println("O pagamento terá 5% de desconto");
                            System.out.println("O total da compra é: "+(val - val*0.05));
                        } else {
                            System.out.println("O pagamento não terá desconto");
                            System.out.println("O total da compra é: "+val);
                        }
                        break;
                }
                break;
        }
    }
}
