import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matriz =
                        {{1, 2, 3, 4, 5},
                         {2, 3, 4, 6, 1},
                         {3, 4, 7, 1, 2},
                         {4, 8, 1, 2, 3},
                         {9, 10, 10, 3, 4}};
        int maiorC = 0, maiorL = 0;

        // Maior Coluna
        for (int i = 0; i < matriz.length; i++) {
            int somaL = 0, somaC=0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaC += matriz[j][i];
                somaL += matriz[i][j];
                if (somaC > maiorC) {
                    maiorC = somaC;
                    System.out.print(maiorC+",");
                }
                if(somaL > maiorL){
                    maiorL = somaL;
                    System.out.print(maiorL+",");
                }
            }
        }
        System.out.println();
        System.out.println(maiorC+", "+maiorL);
    }

}
