import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double valor, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero Real");
        valor = in.nextDouble();
        result = valor / 5;
        System.out.println("A quinta parte do numero digitado é " + result);
    }
}