package com.trabalho;

import java.time.LocalDate;
import java.util.Scanner;

public class Atividades {

    public static void atividade01(Scanner ler) {
        System.out.println("Qual a velocidade do carro?");
        int velocidade = ler.nextInt();
        double multa = 5.0;
        if (velocidade > 80) {
            System.out.println("Você foi multado! =(");
            System.out.printf("Valor da multa: R$%.2f%n", (velocidade - 80) * multa);
        }
    }

    public static void atividade02(Scanner ler) {
        System.out.println("Digite o ano de seu nascimento:");
        int nascimento = ler.nextInt();
        int idade = LocalDate.now().getYear() - nascimento;
        if (idade >= 18) {
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }
    }

    public static void atividade03(Scanner ler) {
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

    public static void atividade04(Scanner ler) {
        System.out.println("Digite um número inteiro");
        int numero = ler.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }

    public static void atividade05(Scanner ler) {
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

    public static void atividade06(Scanner ler) {
        System.out.println("Digite o ano de nascimento:");
        int nascimento = ler.nextInt();
        int idade = LocalDate.now().getYear() - nascimento;
        if (idade >= 18) {
            System.out.printf("Passou %d ano(s) do alistamento militar.%n", idade - 18);
        } else {
            System.out.printf("Ainda falta %d ano(s) para o alistamento militar.%n", 18 - idade);
        }
    }


    public static void atividade07(Scanner ler) {
        ler.nextLine();
        System.out.println("Digite o seu nome:");
        String nome = ler.nextLine();
        char sexo;
        do {
            System.out.println("Digite o sexo: ((M)asculino | (F)eminino)");
            sexo = ler.next().charAt(0);
        } while (sexo != 'M' && sexo !='F');
        System.out.println("Digite o valor total das compras: R$");
        double valor = ler.nextDouble();

        double desconto;
        if (sexo == 'M') {
            desconto = valor - (valor * 0.08);
            System.out.printf("Olá %s! Valor total com desconto: R$%.2f%n", nome, desconto);
        }
        if (sexo == 'F') {
            desconto = valor - (valor * 0.13);
            System.out.printf("Olá %s! Valor total com desconto: R$%.2f%n", nome, desconto);
        }
    }

    public static void atividade08(Scanner ler) {
        System.out.println("Qual distância em km pretende percorrer?");
        int distancia = ler.nextInt();
        double preco;
        if (distancia <= 200) {
            preco = distancia * 0.50;
            System.out.printf("Preço da passagem: %.2f%n", preco);
        } else {
            preco = distancia * 0.45;
            System.out.printf("Preço da passagem: %.2f%n", preco);
        }
    }

    public static void atividade09(Scanner ler) {
        System.out.println("Digite o tamanho de três segmentos de reta. Somente valores maiores que 0");
        double reta1;
        do {
            System.out.println("Reta 1:");
            reta1 = ler.nextDouble();
        } while (reta1 <= 0);
        double reta2;
        do {
            System.out.println("Reta 2:");
            reta2 = ler.nextDouble();
        } while (reta2 <= 0);
        double reta3;
        do {
            System.out.println("Reta 3:");
            reta3 = ler.nextDouble();
        } while (reta3 <= 0);

        if (isTriangulo(reta1, reta2, reta3)) {
            if (reta1 == reta2 && reta2 == reta3){
                System.out.println("EQUILÁTERO");
            } else if (reta1 != reta2 && reta2 != reta3 && reta1 != reta3) {
                System.out.println("ESCALENO");
            } else {
                System.out.println("ISÓSCELES");
            }
        } else {
            System.out.println("Não forma triangulo");
        }
    }

    private static boolean isTriangulo(double reta1, double reta2, double reta3) {
        return (reta1 < reta2 + reta3) && (reta2 < reta1 + reta3) && (reta3 < reta1 + reta2);
    }

    public static void atividade10(Scanner ler) {
        System.out.println("Digite o tamanho da largura:");
        double largura = ler.nextDouble();
        System.out.println("Digite o tamanho do comprimento:");
        double comprimento = ler.nextDouble();
        double area = largura * comprimento;
        if (area < 100) {
            System.out.println("TERRENO POPULAR");
        }
        if (area >= 100 && area <= 500) {
            System.out.println("TERRENO MASTER");
        }
        if (area > 500) {
            System.out.println("TERRENO VIP");
        }
    }

    public static void atividade11(Scanner ler) {
        ler.nextLine();
        System.out.println("Digite o nome:");
        String nome = ler.nextLine();
        System.out.println("Digite o salário:");
        double salario = ler.nextDouble();
        System.out.println("Digite a quantidade de anos trabalhados na empresa:");
        int anos = ler.nextInt();
        double reajuste = 0;
        if (anos <= 3) {
            reajuste = salario + (salario * 0.03);
        }
        if (anos > 3 && anos < 10) {
            reajuste = salario + (salario * 0.125);
        }
        if (anos >= 10) {
            reajuste = salario + (salario * 0.20);
        }
        System.out.printf("O salário de %s aumentou para R$%.2f%n", nome, reajuste);
    }

    public static void atividade12() {
        for (int i = 6; i < 12; i++) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");
        System.out.println();
    }

    public static void atividade13() {
        for (int i = 10; i > 2; i--) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");
        System.out.println();
    }

    public static void atividade14() {
        for (int i = 0; i < 19; i = i+3) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");
        System.out.println();
    }

    public static void atividade15() {
        for (int i = 100; i >= 0; i = i-5) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");
        System.out.println();
    }

    public static void atividade16() {
        for (int i = 30; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.printf("[%d] ", i);
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void atividade17(Scanner ler) {
        System.out.print("Digite o primeiro valor: ");
        int inicial = ler.nextInt();
        System.out.print("Digite o último valor: ");
        int ultimo = ler.nextInt();
        System.out.print("Digite o incremento: ");
        int incremento = ler.nextInt();
        System.out.print("Contagem: ");
        for (int i = inicial; i <= ultimo; i = i + incremento) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou!");
        System.out.println();
    }

    public static void atividade18(Scanner ler) {
        System.out.print("Digite o primeiro valor: ");
        int inicial = ler.nextInt();
        System.out.print("Digite o último valor: ");
        int ultimo = ler.nextInt();
        System.out.print("Digite o incremento: ");
        int incremento = ler.nextInt();

        if (inicial < ultimo) {
            System.out.print("Contagem: ");
            for (int i = inicial; i <= ultimo; i = i + incremento) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("Contagem: ");
            for (int i = inicial; i >= ultimo; i = i - incremento) {
                System.out.print(i + " ");
            }
        }
        System.out.print("Acabou!");
        System.out.println();
    }

    public static void atividade19() {
        int soma = 0;
        for (int i = 6; i < 101; i = i + 2) {
            soma = soma + i;
        }
        System.out.println("Resultado da soma: " + soma);
    }

    public static void atividade20() {
        int soma = 0;
        for (int i = 500; i >= 0; i = i - 50) {
            soma = soma + i;
        }
        System.out.println("Resultado da soma: " + soma);
    }

    public static void atividade21(Scanner ler) {
        int soma = 0;
        int valor;
        for (int i = 1; i < 8; i++) {
            System.out.print("Digite o valor inteiro do numero " + i + ": ");
            valor = ler.nextInt();
            soma = soma + valor;
        }
        System.out.println("Valor do somatório: " + soma);
    }

    public static void atividade22(Scanner ler) {
        System.out.print("Digite o valor do primeiro termo: ");
        int primeiro = ler.nextInt();
        System.out.print("Digite o valor da razão: ");
        int razao = ler.nextInt();
        int termo = primeiro;

        System.out.print("Os 10 primeiros elementos da PA: ");
        int soma = 0;
        if (razao != 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(termo + " ");
                soma += termo;
                termo += razao;
            }
        }

        if (razao == 0) {
            for (int i = 1; i < 11; i++) {
                System.out.print(termo + " ");
                soma += termo;
            }
        }
        System.out.println();
        System.out.println("Soma dos valores da PA: " + soma);
        System.out.println();
    }
}
