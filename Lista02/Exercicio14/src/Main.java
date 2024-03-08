import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valor, valorF;
        int menu, parcelas;

        System.out.println("Insira o valor da compra:");
        valor = in.nextDouble();
        System.out.println("Menu:\n1.Débito\n2.Pix\n3.Crédito\nEscolha uma form de pagamento:");
        menu = in.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Débito selcionado: \nValor total = " + valor * 0.95);
                break;
            case 2:
                System.out.println("Débito selcionado: \nValor total = " + valor * 0.9);
                break;
            case 3:
                System.out.println("Crédito Selecionado\nEscolha o numero de parcelas:");
                parcelas = in.nextInt();

                if (parcelas <= 4){
                    valorF = valor * 1.02;
                    System.out.println("Valor final da compra: "+valorF);
                }else {
                    valorF = valor * 1.05;
                    System.out.println("Valor final da compra: "+valorF);
                }
                break;
            default:
                System.out.println("\nOpção Inválida !!");
                break;
        }
    }
}