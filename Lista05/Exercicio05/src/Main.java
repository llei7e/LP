import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int valor = 42;

        System.out.println(binaria(array, valor));

    }

    static int binaria(int[] lista, int valorB) {
        int i, aux, index;
        int[] novalista = new int[lista.length / 2];
        int[] nlista2 = new int[novalista.length / 2];


        if (lista[lista.length / 2] == valorB) {
            return lista.length / 2;
        } else if (lista[lista.length / 2] < valorB) {
            for (index = 0; index < (lista.length / 2); index++) {
                novalista[index] = lista[lista.length / 2 + index + 1];
            }
            if (novalista[novalista.length / 2] == valorB) {
                return novalista.length / 2;
            } else if (novalista[novalista.length / 2] < valorB) {
                for (index = 0; index < (novalista.length / 2); index++) {
                    nlista2[index] = novalista[novalista.length / 2 + index + 1];
                    System.out.println(Arrays.toString(nlista2));
                }
            } else if (novalista[novalista.length / 2] > valorB) {
                for (index = 0; index < (novalista.length / 2); index++) {
                    nlista2[index] = novalista[novalista.length / 2 - index - 1];
                    System.out.println(Arrays.toString(nlista2));
                }
                if(nlista2[nlista2.length/2] == valorB){
                    return nlista2.length/2;
                }
            }
            else if (lista[lista.length / 2] > valorB) {
                for (index = 0; index < (lista.length / 2); index++) {
                    novalista[index] = lista[lista.length / 2 - index - 1];
                    System.out.println(Arrays.toString(novalista));
                }
            }

        }
        return 0;
    }
}