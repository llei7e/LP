public class Main {
    public static void main(String[] args) {

        int[][] matriz =
                        {{1, 2, 3, 4, 5},
                         {2, 3, 4, 6, 1},
                         {3, 4, 7, 1, 2},
                         {4, 8, 1, 2, 3},
                         {9, 10, 10, 3, 4}};

        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz[i].length; j++){
                if(i == 0 && j == 4){
                    System.out.println(matriz[i][j]);
                } else if (i == 1 && j == 3) {
                    System.out.println(matriz[i][j]);
                }else if (i == 2 && j == 2) {
                    System.out.println(matriz[i][j]);
                }
                else if (i == 3 && j == 1) {
                    System.out.println(matriz[i][j]);
                }
                else if (i == 4 && j == 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}

//CÓDIGO 1 FOR, var de array(giovanni)

/*
        int [] diagonal = new int[5];
        int[][] m = {{10,15,20,35,40},
                    {50,60,70,80,90},
                    {12,23,45,65,76},
                    {98,76,54,43,23},
                    {360,200,40,100,120}};
        System.out.println("Diagonal Principal");
        for (int i=0;i<m.length;i++){
            diagonal[i] =  m[i][m[i].length-1-i];
            System.out.println(diagonal[i]);
        }
    }
}
*/