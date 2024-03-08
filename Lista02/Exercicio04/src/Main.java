import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, media1e2;

        System.out.println("Insira a primeira nota (0-100): ");
        n1 = in.nextInt();
        System.out.println("Insira a segunda nota (0-100): ");
        n2 = in.nextInt();
        media1e2 = (n1 + n2) / 2;
        System.out.println("A média entre as duas notas é = " + media1e2 + "\n");


        if (media1e2 >= 50) {
            System.out.println("APROVADO!!");

        } else {
            int recuperacao, mediaRecuperacao;
            System.out.println("Insira a nota de recuperação(0-100): ");
            recuperacao = in.nextInt();
            mediaRecuperacao = (recuperacao + media1e2) /2;

            if (mediaRecuperacao >= 50) {
                System.out.println("A média entre as duas notas é = " + mediaRecuperacao + "\n");
                System.out.println("APROVADO!!");

            } else {
                System.out.println("A média entre as duas notas é = " + mediaRecuperacao + "\n");
                System.out.println("REPROVADO!!");
            }
        }
    }
}
