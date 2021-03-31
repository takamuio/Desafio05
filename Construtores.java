
import java.util.Scanner;

public class Construtores {

    Scanner ler = new Scanner(System.in);

    int multiplicador;

    public void choiceSize() {
        System.out.println("Escolha o tamanho da sequencia de Fibonnaci");
        multiplicador = ler.nextInt();
    }

    public void formFibonnaci() {
        int num1 = 1, num2 = 0;

        System.out.print(num2 + " , ");
        System.out.print(num1 + " , ");

        for (int i = 0; i < (multiplicador - 1); i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(num1 + " , ");
        }
    }

    public void choiceIndex() {
        System.out.println("\n" + "Escolha o indice da sequencia de Fibonnaci");
        multiplicador = ler.nextInt();
    }

    public void indexFibonnaci() {
        int num1 = 1, num2 = 0;

        for (int i = 0; i < (multiplicador - 1); i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
        System.out.println(num1);
    }
}
