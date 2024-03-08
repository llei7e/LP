import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double celsius, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor em graus Celsius");
        celsius = in.nextDouble();
        result = (celsius * 9/5) +32;
        System.out.println("O mesmo valor em graus Fahrenheit é " + result);
    }
}