package com.trabalho;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja executar: (1-22 | 0 Encerrar)");
        int atividade = ler.nextInt();

        do {
            System.out.printf("-----INICIO DA ATIVIDADE %d-----%n", atividade);
            switch (atividade) {
                case 1 -> Atividades.atividade01(ler);

                case 2 -> Atividades.atividade02(ler);

                case 3 -> Atividades.atividade03(ler);

                case 4 -> Atividades.atividade04(ler);

                case 5 -> Atividades.atividade05(ler);

                case 6 -> Atividades.atividade06(ler);

                case 7 -> Atividades.atividade07(ler);

                case 8 -> Atividades.atividade08(ler);

                case 9 -> Atividades.atividade09(ler);

                case 10 -> Atividades.atividade10(ler);

                case 11 -> Atividades.atividade11(ler);

                case 12 -> Atividades.atividade12();

                case 13 -> Atividades.atividade13();

                case 14 -> Atividades.atividade14();

                case 15 -> Atividades.atividade15();

                case 16 -> Atividades.atividade16();

                case 17 -> Atividades.atividade17(ler);

                case 18 -> Atividades.atividade18(ler);

                case 19 -> Atividades.atividade19();

                case 20 -> Atividades.atividade20();

                case 21 -> Atividades.atividade21(ler);

                case 22 -> Atividades.atividade22(ler);

                default -> System.out.println("Atividade não existe");
            }
            System.out.printf("------FIM DA ATIVIDADE %d-------%n", atividade);
            System.out.println();
            System.out.println("Digite qual atividade deseja executar: (1-22 | 0 Encerrar)");
            atividade = ler.nextInt();
        } while (atividade != 0);
    }
}
