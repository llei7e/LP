import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raius, result, high;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do Raio do circulo do Cilindro");
        raius = in.nextDouble();
        System.out.println("Digite o valor da Altura do Cilindro");
        high = in.nextDouble();
        result = Math.PI * Math.pow(raius, 2) * high;
        System.out.println("O volume desse Cilindro é " + result);

    }
}