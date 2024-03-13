import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int received;
        boolean stop = false;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nInsira um numero:");
        received = in.nextInt();

        while (!stop) {

            for (int i = 0; i < array.length; i++) {
                if (received == array[i]) {
                    System.out.println(received + ". Está presente no array!!");
                    stop = true;
                }
            }
           if(!stop){
               System.out.println(received + ". Não está presente no array!!");
               break;
           }

        }
    }
}