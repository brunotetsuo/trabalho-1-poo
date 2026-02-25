package com.trabalho;

import java.util.Scanner;

public class Atividades {

    public void atividade01(Scanner ler) {
        System.out.println("Qual a velocidade do carro?");
        int velocidade = ler.nextInt();
        double multa = 5.0;
        if (velocidade > 80) {
            System.out.println("Você foi multado! =(");
            System.out.printf("Valor da multa: R$%.2f%n", (velocidade - 80) * multa);
        }
    }

    public void atividade02(Scanner ler) {

    }
}
