import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2 , n3;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero (A)");
        n1 = in.nextDouble();

        System.out.println("Digite um numero (B)");
        n2 = in.nextDouble();

        System.out.println("Digite um numero (C)");
        n3 = in.nextDouble();

        if(n1<n2+n3 && n1>Math.abs(n2-n3) &&
                n2<n1+n3 && n2>Math.abs(n1-n3) &&
                n3<n2+n1 && n3>Math.abs(n2-n1)){

            if (n1 == n2 && n2 == n3){
                System.out.println("Esse é um TRIÂNGULO EQUILÁTERO");

            }else if(n1 == n2 || n1 == n3 || n2 == n3){
                System.out.println("Esse é um TRIÂNGULO ISÓSCELES");

            }else {
                System.out.println("Esse é um TRIÂNGULO ESCALENO");
            }

        }else {
            System.out.println("Não é um triangulo");
        }

    }
}