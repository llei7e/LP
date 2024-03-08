import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor de (1 a 7)");
        valor = in.nextInt();

        switch (valor){
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERÇA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SÁBADO");
                break;
            default:
                System.out.println("Valor não corresponde a NENHUM dia da SEMANA !!");
                break;
        }

    }
}