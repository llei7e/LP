public class Main {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90,100};
        int aux;

        for (int i = 0;i<array.length/2;i++){
            aux = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = aux;
        }
        for (int j = 0; j<array.length;j++){
            System.out.println(array[j]);
        }
    }
}