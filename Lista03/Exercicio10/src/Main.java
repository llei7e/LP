import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, n1 = 1, n2 = 0;

        System.out.println("\nSequência de Fibonnaci:\n\nInsira o número de termos a ser apresentado:");
        n = in.nextInt();

        System.out.println(n2);

        for (int i = 0; i < n-1; i++) {
            System.out.println(n1);
            n1 = n1 + n2;

            n2 = n1 - n2;
        }
    }
}

//CÓDIGO CAINA

/*
int n,n1,n2,aux;
        n1=0;
        n2=1;
        System.out.println("Digite o limite esperado para a sequencia de Fibonacci: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(0);

        while (n2<n){
            System.out.println(n2);
            aux=n1;
            n1=n2;
            n2=aux+n2;
 */