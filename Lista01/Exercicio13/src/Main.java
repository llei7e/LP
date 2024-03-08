import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raius, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de um Raio de circulo");
        raius = in.nextDouble();
        result = Math.PI * Math.pow(raius, 2);
        System.out.println("A área desse circulo é " + result);

    }
}