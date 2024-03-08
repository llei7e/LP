import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2 , n3;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero Inteiro (n1)");
        n1 = in.nextInt();

        System.out.println("Digite um numero Inteiro (n2)");
        n2 = in.nextInt();

        System.out.println("Digite um numero Inteiro (n3)");
        n3 = in.nextInt();

        if (n1 > n2 && n1 > n3 && n2 >n3){
            System.out.println(n3 + " " + n2 + " " + n1);

        } else if (n1 > n2 && n1 > n3 && n3 >n2) {
            System.out.println(n2 + " " + n3 + " " + n1);

        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n3 + " " + n1 + " " + n2);

        }else if (n2 > n1 && n2 > n3 && n3 > n1) {
            System.out.println(n1 + " " + n3 + " " + n2);

        }else if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.println(n2 + " " + n1 + " " + n3);

        }else if (n3 > n1 && n3 > n2 && n2 > n1) {
            System.out.println(n1 + " " + n2 + " " + n3);
        }
    }
}
// MESMO CÓDIGO, MELHOR EFETUADO
        /*
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menor, meio, maior, aux;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 inteiros");
        menor = in.nextInt();
        meio = in.nextInt();
        maior = in.nextInt();

        if(maior<menor){
            aux = menor;
            menor = maior;
            maior = aux;
        }
        if(maior<meio){
            aux = meio;
            meio = maior;
            maior = aux;
        }
        if(meio<menor){
            aux=menor;
            menor=meio;
            meio=aux;
        }
        System.out.println(menor+" "+ meio +" "+ maior);
    }
}
        */