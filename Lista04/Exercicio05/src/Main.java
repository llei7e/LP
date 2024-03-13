public class Main {
    public static void main(String[] args) {
//Terminar
        int [] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] array2 = new int [10];

        for (int i = 0; i< array1.length;i++){
            array2[array1.length-1-i]=array1[i];
        }
        System.out.print("v1 = ");
        for (int v1:array1) System.out.print(v1+", ");
        System.out.println();
        System.out.print("v2 = ");
        for (int v2:array2) System.out.print(v2+", ");

    }
}