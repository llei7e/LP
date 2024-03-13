public class Main {
    public static void main(String[] args) {

        int[][] matriz =
                        {{1, 2, 3, 4, 5},
                         {2, 3, 4, 6, 1},
                         {3, 4, 7, 1, 2},
                         {4, 8, 1, 2, 3},
                         {9, 10, 10, 3, 4}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}

//CÓDIGO 1 FOR, var de array(giovanni)

/*

public class Main {
    public static void main(String[] args) {

        int [] diagonal = new int[5];
        int[][] m = {{10,15,20,35,40},
                    {50,60,70,80,90},
                    {12,23,45,65,76},
                    {98,76,54,43,23},
                    {360,200,40,100,120}};
        System.out.println("Diagonal Principal");
        for (int i=0;i<m.length;i++){
            diagonal[i] =  m[i][i];
            System.out.println(diagonal[i]);
        }
    }
}
 */