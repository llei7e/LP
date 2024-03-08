import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num;
        boolean stop = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            num = in.nextInt();
        }while(num<0);
        if(num==1)
            stop=true;
        System.out.println("Não é um número primo!");

        for (int i = 2; i < num && !stop; i++) {
            if (num % i == 0) {
                System.out.println("Não é um número primo!");
                stop = true;
            }
        }
        if (!stop) System.out.println("É um numero primo!");
    }
}