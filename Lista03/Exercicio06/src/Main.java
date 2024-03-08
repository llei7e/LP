import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o primeiro numero:");
        n1 = in.nextInt();
        System.out.println("Insira o segundo numero:");
        n2 = in.nextInt();

        for (int i = n1; i < n2; i++) {
            System.out.println(i);
        }
        for (int i = n1; i > n2; n2++) {
            System.out.println(n2);
        }
    }
}