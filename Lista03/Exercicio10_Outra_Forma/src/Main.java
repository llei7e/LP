import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, n1, n2;

        System.out.println("\nSequência de Fibonnaci:\n\nInsira o número de termos a ser apresentado:");
        n = in.nextInt();

        n1 = 0;
        n2 = 0;

        System.out.println(n1);
        for (int i = 0; i < n-3; i++) {

            if(n1 <= 1){
                n1 = 1;
                n1 = n1 + n2;
                System.out.println(n1);
            }
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println(n1);
        }
    }
}