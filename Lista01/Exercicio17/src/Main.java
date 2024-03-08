import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double v0, acel, t, vF;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da Velocidade Inicial");
        v0 = in.nextDouble();
        System.out.println("Digite o valor da Aceleração");
        acel = in.nextDouble();
        System.out.println("Digite o valor do Tempo do Percurso");
        t = in.nextDouble();
        vF = v0 + acel * t;
        System.out.println("A Velocidade final é " + vF);
    }
}