import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor em quilometros");
        km = in.nextDouble();
        result = km / 1.6;
        System.out.println("O mesmo valor em milhas é " + result);
    }
}