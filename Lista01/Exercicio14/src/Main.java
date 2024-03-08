import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double high, base, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da altura do Triangulo");
        high = in.nextDouble();
        System.out.println("Digite o valor da base do Triangulo");
        base = in.nextDouble();
        result = base * high / 2;
        System.out.println("A área desse Triangulo é " + result);

    }
}