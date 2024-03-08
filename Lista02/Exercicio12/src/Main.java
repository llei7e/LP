import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n1, n2, result;
        int operacao;

        System.out.println("Digite um numero:");
        n1 = in.nextDouble();
        System.out.println("Digite outro numero:");
        n2 = in.nextDouble();
        System.out.println("Menu:\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão\nEscolha uma Opção");
        operacao = in.nextInt();

        switch (operacao) {
            case 1:
                result = n1+n2;
                System.out.println("A soma dos numeros " +n1+ " e " +n2+ "\nÉ igual a " + result);
                break;
            case 2:
                result = n1-n2;
                System.out.println("A subtração dos numeros " +n1+ " e " +n2+ "\nÉ igual a " + result);
                break;
            case 3:
                result = n1*n2;
                System.out.println("A multiplicação dos numeros " +n1+ " e " +n2+ "\nÉ igual a " + result);
                break;
            case 4:
                result = n1/n2;
                System.out.println("A divisão2 dos numeros " +n1+ " e " +n2+ "\nÉ igual a " + result);
                break;
            default:
                System.out.println("\nOpção Inválida !!");
                break;

        }
    }
}