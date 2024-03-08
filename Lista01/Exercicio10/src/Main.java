import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double miles, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor em milhas");
        miles = in.nextDouble();
        result = miles * 1.609;
        System.out.println("O mesmo valor em quilometros é " + result);
    }
}