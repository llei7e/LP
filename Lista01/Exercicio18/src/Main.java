import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, x;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        a = in.nextDouble();
        System.out.println("Digite o valor de B");
        b = in.nextDouble();
        if (a == 0) {
            System.out.println("A equação não é do primeiro grau");
        } else {
            x = -b / a;
            System.out.println("X é igual a " + x);
        }

    }
}