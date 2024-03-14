import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior = 0, menor = 0, posMaior = 0, posMenor = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Posição " + (i + 1) + "\nInsira o numero para alocar:");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor || menor == 0) {
                menor = array[i];
                posMenor = i;
            } else if (array[i] > maior || maior == 0){
                maior = array[i];
                posMaior = i;
            }
        }
        System.out.println("O Maior numero = "+maior+"   Posição = "+posMaior);
        System.out.println("O Menor numero = "+menor+"    Posição = "+posMenor);
    }
}