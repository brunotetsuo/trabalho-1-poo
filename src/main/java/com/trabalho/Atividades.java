package com.trabalho;

import java.time.LocalDate;
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
        System.out.println("Digite o ano de seu nascimento:");
        int nascimento = ler.nextInt();
        int idade = LocalDate.now().getYear() - nascimento;
        if (idade >= 18) {
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }
    }

    public void atividade03(Scanner ler) {
        ler.nextLine();
        System.out.println("Digite o seu nome:");
        String nome = ler.nextLine();
        System.out.println("Digite o valor da primeira nota:");
        double nota1 = ler.nextDouble();
        System.out.println("Digite o valor da segunda nota:");
        double nota2 = ler.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média das notas do aluno %s: %.1f%n", nome, media);
        if (media > 7.0) {
            System.out.println("Bom aproveitamento =)");
        } else {
            System.out.println("Mal aproveitamento =(");
        }
    }

    public void atividade04(Scanner ler) {
        System.out.println("Digite um número inteiro");
        int numero = ler.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }

    public void atividade05(Scanner ler) {
        System.out.println("Digite o ano:");
        int ano = ler.nextInt();
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("Ano é bissexto");
                    return;
                }
                System.out.println("Ano não é bissexto");
                return;
            }
            System.out.println("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }
    }

    public void atividade06(Scanner ler) {

    }
}
