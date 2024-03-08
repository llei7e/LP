import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double result, n1;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor a ser calculado!");
        n1 = in.nextInt();
        result = Math.sqrt(n1);

        if (n1 <= 0) {

            System.out.println("Valor invalido!");

        } else {

            System.out.println("A raiz quadrada de " + n1 + " é = " + result);

        }
    }
}