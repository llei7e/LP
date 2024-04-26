import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o numero Base da Potenciação");
        num1 = in.nextInt();

        System.out.println("Digite o numero Expoente da Potenciação");
        num2 = in.nextInt();

        System.out.println("A potencia de "+num1+"^"+num2+" = " + potencia(num1, num2));
    }
    static int potencia(int n1, int n2){
            if (n2 == 0)
                return 1;
        return n1 * potencia(n1,n2 - 1);
    }
}