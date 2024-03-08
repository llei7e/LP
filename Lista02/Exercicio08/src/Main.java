import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero Inteiro");
        numero = in.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero " +numero+ " inserido é PAR");
        }else {
            System.out.println("O numero " +numero+ " inserido é ÍMPAR");
        }
    }
}