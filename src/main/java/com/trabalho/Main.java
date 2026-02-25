package com.trabalho;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja executar: (1-22 | 0 Encerrar)");
        int atividade = ler.nextInt();
        Atividades atividades = new Atividades();

        do {
            System.out.printf("-----INICIO DA ATIVIDADE %d-----%n", atividade);
            switch (atividade) {
                case 1:
                    atividades.atividade01(ler);
                    break;
                case 2:
                    atividades.atividade02(ler);
                    break;
            }
            System.out.printf("------FIM DA ATIVIDADE %d-------%n", atividade);
            System.out.println();
            System.out.println("Digite qual atividade deseja executar: (1-22 | 0 Encerrar)");
            atividade = ler.nextInt();
        } while (atividade != 0);
    }
}
