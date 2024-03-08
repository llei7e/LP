import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        a = in.nextDouble();

        System.out.println("Digite o valor de B");
        b = in.nextDouble();

        System.out.println("Digite o valor de C");
        c = in.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0 ){
            System.out.println("A equação NÃO possui uma solução REAL !!");

        }else{
            System.out.println("X = (" + x1 + "," + x2 + ")");
        }





        //System.out.println(a+"X^2 + (" + b + ")X + ("+c+") =0, \n Então \n X= ("+x1+","+x2+")");
    }
}
