import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{2, 3},
                     {4, 5},
                     {6, 7}};
        int[][] b = {{8, 9},
                     {10, 11}};
        int[][] pro = new int[3][2];

        for (int z = 0; z < b[0].length; z++) {
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i == 0) {
                        pro[j][z] = a[j][i] * b[i][z];
                    } else if (i == 1) {
                        pro[j][z] = pro[j][z] + (a[j][i] * b[i][z]);
                    }
                }
            }
        }
        for (int[] ver :pro){
            System.out.println(Arrays.toString(ver));
        }
    }
}