import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pol, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor em polegadas");
        pol = in.nextDouble();
        result = pol * 25.4;
        System.out.println("O mesmo valor em milimetros é " + result);
    }
}