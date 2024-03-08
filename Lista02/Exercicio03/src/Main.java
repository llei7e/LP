import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, media;

        System.out.println("Insira a primeira nota (0-100)");
        n1 = in.nextInt();
        System.out.println("Insira a segunda nota (0-100)");
        n2 = in.nextInt();
        media = (n1 + n2) / 2;
        System.out.println("A média entre as duas notas é = " + media +"\n");

        if (media >= 50){
            System.out.println("APROVADO!!");

        }else {
            System.out.println("REPROVADO!!");

        }
    }
}