import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//fazer
        Scanner in = new Scanner(System.in);
        double n1, n2, media1e2;

        System.out.println("Insira a primeira nota (0-10): ");
        n1 = in.nextDouble();
        System.out.println("Insira a segunda nota (0-10): ");
        n2 = in.nextDouble();
        media1e2 = (n1 + n2) / 2;

        if (media1e2 >= 8.5){
            System.out.println("Nota A !!");

        } else if(media1e2 >= 7 && media1e2 < 8.5) {
            System.out.println("Nota B !!");

        }else if (media1e2 >= 5 && media1e2 <7){
            System.out.println("Nota C !!");

        }else {
            System.out.println("Nota D !!");

        }
    }
}