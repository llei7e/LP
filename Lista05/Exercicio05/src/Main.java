import java.math.MathContext;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 78, 88};
        int valor = 16;

        System.out.println(binaria(array, valor));
    }
    static int binaria(int[] lista, int valorReceb) {
        int antigaMet = 0;
        int novaMet = lista.length/2;

        while(lista[lista.length/2] < valorReceb) {
            while (lista[novaMet] < valorReceb) {
                novaMet = (novaMet + lista.length) /2;
            }
            while(lista[novaMet] > valorReceb){
                antigaMet = (novaMet * 2) /3;
                novaMet = Math.round((float) (novaMet + antigaMet) /2);
            }
            if(lista[novaMet] == valorReceb)
                return novaMet;
            else return -1;
        }
        while (lista[lista.length/2] > valorReceb){
            while (lista[novaMet] > valorReceb) {
                antigaMet = (novaMet * 2) /3;
                novaMet = (novaMet + antigaMet) /2;
            }
            while (lista[novaMet] < valorReceb){
                antigaMet = (novaMet * 2) /3;
                novaMet = Math.round((float) (novaMet + antigaMet) /2);
            }
            if(lista[novaMet] == valorReceb)
                return novaMet;
            else return -1;
        }
        return -1;
    }
}