import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r, b, h, c, area, perimetro;
        int menu;

        System.out.println("Menu:\n1.Circulo\n2.Triangulo Retangulo\n3.Retângulo\nEscolha uma Opção:");
        menu = in.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Digite o valor do Raio:");
                r = in.nextDouble();
                area = Math.PI* Math.pow(r,2);
                perimetro = 2 * Math.PI * r;
                System.out.println("\nArea = " +area+"\nPerimetro = "+perimetro);
                break;
            case 2:
                System.out.println("Digite o valor da Base:");
                b = in.nextDouble();
                System.out.println("Digite o valor da Altura:");
                h = in.nextDouble();
                System.out.println("Digite o valor da Hipotenusa:");
                c = in.nextDouble();
                area = (b*h)/2;
                perimetro = b+h+c;
                System.out.println("\nArea = " +area+"\nPerimetro = "+perimetro);
                break;
            case 3:
                System.out.println("Digite o valor da Base:");
                b = in.nextDouble();
                System.out.println("Digite o valor da Altura:");
                h = in.nextDouble();
                area = b*h;
                perimetro = (b*h)*2;
                System.out.println("\nArea = " +area+"\nPerimetro = "+perimetro);
                break;
            default:
                System.out.println("\nOpção Inválida !!");
                break;

        }
    }
}