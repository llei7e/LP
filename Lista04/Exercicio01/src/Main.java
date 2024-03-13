import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[10];

        for (int i = 0; i<10;i++) array[i] = 10*(i+1);

        for(int i = array.length-1; i>=0;i--){
            System.out.println(array[i]);
        }
    }
}