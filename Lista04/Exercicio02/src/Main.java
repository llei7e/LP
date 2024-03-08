public class Main {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60,70,80,90,100};
        System.out.print("\nSoma 2:            multiplica 2:\n");
        for(int i = 0; i<array.length;i++){

            if (i%2 == 0){
              array[i] =  array[i] + 2;
                System.out.print("\npos"+i+" array "+array[i]+"!");

            }else {
                array[i] = array[i] * 2;
                System.out.println("     pos"+i+" array "+array[i]+"!");
            }
        }
    }
}