import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2;

        System.out.println("Insira o Primeiro número!");
        n1 = in.nextInt();
        System.out.println("Insira o Segundo número!");
        n2 = in.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + ", Numero 1 é o maior numero!");
        } else if (n2 > n1) {
            System.out.println(n2 + ", Numero 2 é o maior numero!");
        } else {
            System.out.println("Os dois numeros sao IGUAIS!");
        }
    }
}