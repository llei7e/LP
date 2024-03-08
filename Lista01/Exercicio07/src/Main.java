import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double milimeter, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a valor em milimetros");
        milimeter = in.nextDouble();
        result = milimeter / 25.4;
        System.out.println("O mesmo valor em polegadas é " + result);
    }
}