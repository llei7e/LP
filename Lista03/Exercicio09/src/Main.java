import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int j, resposta, reiniciar;
        boolean continuar = true;

        while (continuar) {

            System.out.println("\nJogo da tabuada: Responda as tabuadas do 1 ao 10 uma operação por vez:\n\nPressione 'Enter' para começar");
            System.in.read();

            for (int k = 1; k <= 10 && continuar; k++) {
                System.out.println(" ");

                for (int i = 0; i <= 10; i++) {

                    j = i * k;

                    System.out.println(i + " x " + k + "\nDigite o resultado:");
                    resposta = in.nextInt();
                    if (resposta != j) {
                        System.out.println("Resposta Incorreta!!");
                        continuar = false;
                        break;
                    }
                }
            }
            if (!continuar) {
                System.out.println("Deseja jogar novamente?\nSim(1), Não(2)");
                reiniciar = in.nextInt();
                if (reiniciar == 2) {
                    System.out.println("FIM DE JOGO!!");

                } else if (reiniciar == 1) {
                    continuar = true;
                }
            } else {
                System.out.println("Parabéns você concluiu!!!\nDeseja jogar novamente??\nSim (1), Não (2)");
                reiniciar = in.nextInt();
                if (reiniciar == 2) {
                    System.out.println("FIM DE JOGO!!");
                    continuar = false;
                } else if (reiniciar == 1) {
                    continuar = true;
                }
            }
        }
    }
}

/*
int resposta, op;
        resposta = 0;
        Scanner in = new Scanner(System.in);
        do{
            for(int i=1;i<=10;i++){
                int j;
                for(j=0;j<=10;j++){
                    System.out.println(i+"x"+j+"=");
                    resposta = in.nextInt();
                    if(resposta!=i*j){
                        System.out.println("Voce errou");
                        break;
                    }
                }
                System.out.println(i + " " + j);
                if(resposta!=i*(j-1))
                    break;
                if(i==10 && j==10)
                    System.out.println("Parabens voce ganhou!");
            }
            System.out.println("Deseja jogar novamente?\n1.Sim\n2.Nao");
            op=in.nextInt();
        }while (op==1);
        System.out.println("Obrigado por jogar.");
 */