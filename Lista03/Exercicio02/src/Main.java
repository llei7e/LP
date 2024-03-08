import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int maior, menor, recNum;

        maior = 0;
        menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um número:");
            recNum = in.nextInt();
            if (i == 0) {
                menor = recNum;
            }
            for (int j = 0; j == 0; j++) {
                if (menor >recNum) {
                    menor = recNum;

                } else if (maior < recNum) {
                    maior = recNum;
                }
            }
        }
        System.out.println("Menor numero:" + menor + "\nMaior numero:" + maior);
    }
}
