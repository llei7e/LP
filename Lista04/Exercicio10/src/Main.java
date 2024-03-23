import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {5, 6},
                {8, 7},
                {3, 3}};
        int[][] b = {
                {9, 1},
                {6, 1}};
        int[][] pro = new int[a.length][b[0].length];

        for (int z = 0; z < b[0].length; z++) {
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a.length; j++) {
                    pro[j][z] = pro[j][z] + (a[j][i] * b[i][z]);
                }
            }
        }
        for (int[] ver : pro) {
            System.out.println(Arrays.toString(ver));
        }
    }
}

/*

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {5, 6},
                {8, 7},
                {3, 3}};
        int[][] b = {
                {9, 1},
                {6, 1}};
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            c[i][0]= (a[i][0] * b[0][0]) + (a[i][1] * b[1][0]);
            c[i][1]= (a[i][0] * b[0][1]) + (a[i][1] * b[1][1]);
        }
        for (int[] ver : c){
            System.out.println(Arrays.toString(ver));
        }
    }
}

 */