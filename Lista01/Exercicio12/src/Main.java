import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double grade1, grade2, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota");
        grade1 = in.nextDouble();
        System.out.println("Digite o valor da segunda nota");
        grade2 = in.nextDouble();
        result = (grade1 + grade2 * 2) / 3;
        System.out.println("A média do aluno é " + result);
    }
}