/*
Faça um programa que o usuairo coloca q quantidade de números que ele quer
ver em números da sequência de fibonnaci.
E o usuário insere qual número está naquela posição (indice)

F(0) = 0
F(1) = 1
F(2) = F(2 - 1) + F(2 - 2)      = F(1) + F(0) = 1 + 0 = 1
F(3) = F(3 - 1) + F(3 - 2)      = F(2) + F(1) = 1 + 1 = 2
F(4) = F(4 - 1) + F(4 - 2)      = F(3) + F(2) = 2 + 1 = 3

 */

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Construtores c1 = new Construtores();

        c1.choiceSize();

        c1.formFibonnaci();
        
        c1.choiceIndex();

        c1.indexFibonnaci();

    }

}
