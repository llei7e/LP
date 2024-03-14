import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int received;
        boolean stop = false;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nInsira um numero:");
        received = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (received == array[i]) {
                System.out.println(received + ". Está presente no array!!" + " Posição: " + i);
                stop = true;
                break;
            }
        }
        if (!stop) {
            System.out.println(received + ". Não está presente no array!!");
        }
    }
}
//CÓDIGO MAIS SIMPLES (ricardo)

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] matriz = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int numero;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor a consultar");
        numero = in.nextInt();

        for (int i = 0; i <=9; i++) {
            if (numero == matriz[i]) {
                System.out.println("A posição do numero é: " + i);
                return;
            }
        }
                System.out.println("VALOR NÃO ENCONTRADO!");
    }
}
*/