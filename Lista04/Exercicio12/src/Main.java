import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int det1 = 1, det2 = 1, det3 = 1, detN =0;

        int[][] m1_5x5 = new int[3][5];

        for (int i = 0; i < m1_5x5.length; i++) {
            for (int j = 0; j < m1_5x5[0].length; j++) {

                if (j == 3) {
                    m1_5x5[i][j] = m1[i][0];
                }
                else if (j == 4) {
                    m1_5x5[i][j] = m1[i][1];
                } else m1_5x5[i][j] = m1[i][j];
            }
        }

        for (int i = 0; i < m1_5x5.length; i++) {
            for (int j = 0; j < m1_5x5[0].length; j++) {
                if (i == j){
                    det1 = det1 * m1_5x5[i][j];
                }
                if(i == j-1){
                    det2 = det2 * m1_5x5[i][j];
                }
                if(i == j-2){
                    det3 = det3 * m1_5x5[i][j];
                }
            }
        }
        detN=det1+det2+det3;
        System.out.println(det1);
        System.out.println(det2);
        System.out.println(det3);
        System.out.println(detN);

        for (int[] ver : m1) {
            System.out.println(Arrays.toString(ver));
        }
        System.out.println();
        for (int[] see : m1_5x5) {
            System.out.println(Arrays.toString(see));
        }
    }
}