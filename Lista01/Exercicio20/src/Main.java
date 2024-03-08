import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double b, c, x1, x2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de X1");
        x1 = in.nextDouble();

        System.out.println("Digite o valor de X2");
        x2 = in.nextDouble();

        b = -(x1 + x2);
        c = x1 * x2;

        System.out.println("A equação do 2º é\t X²+(" + b + "X+" + c + ") = 0");
    }
}