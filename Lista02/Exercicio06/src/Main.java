import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha uma opção entre 5 e 9:");
        opcao = in.nextInt();

        if (opcao == 5){
            System.out.println("Opção numero 5 escolhida !!");
        }else if (opcao == 6){
            System.out.println("Opção numero 6 escolhida !!");
        }else if (opcao == 7){
            System.out.println("Opção numero 7 escolhida !!");
        }else if (opcao == 8){
            System.out.println("Opção numero 8 escolhida !!");
        }else if (opcao == 9){
            System.out.println("Opção numero 9 escolhida !!");
        }else {
            System.out.println("ERRO: OPÇÃO INVÁLIDA !! (escolha um numero entre 5 e 9).");
        }

    }
}