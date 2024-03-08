import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocity, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em km/h");
        velocity = in.nextDouble();
        result = velocity /3.6;
        System.out.println("A velocidade em m/s é " + result);
    }
}