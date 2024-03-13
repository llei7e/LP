public class Main {
    public static void main(String[] args) {
//Terminar
        int [] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] array2 = new int [10];

        for (int i = 0; i< array1.length;i++){
            for (int j = array2.length-1; j>0;j--){
                array2[j] = array1[i];

            }
        }
        for (int v1:array1) System.out.print(v1);

        for (int v2: array2) System.out.print("\n"+v2);

    }
}