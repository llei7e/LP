import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        number1 = in.nextInt();
        System.out.println("Digite a segunda nota");
        number2 = in.nextInt();
        result = (number2 + number1) / 2;
        System.out.println("A média do aluno é " + result);
    }
}