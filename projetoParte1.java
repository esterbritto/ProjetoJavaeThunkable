package projeto1;

import java.util.Scanner;

public class projetoParte1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /* Declaração de variáveis */
        double mediaG = 0;
        double mediaM = 0;
        double contadorM = 0;
        int contadorF = 0;
        int mediaF = 0;

        Scanner in = new Scanner(System.in); // Scanner

        int opcoes;
        do {
            System.out.println(" [1] SOMA");
            System.out.println(" [2] SUBTRAÇÃO");
            System.out.println(" [3] DIVISÃO");
            System.out.println(" [4] FAIXA ETÁRIA");
            System.out.println(" [5] NÚMEROS PRIMOS");
            System.out.println(" [6] MUDANÇA DE BASE");
            System.out.println(" [7] SAIR");
            opcoes = in.nextInt();

            switch (opcoes) {
                /* [1] - SOMA */
                case 1:
                    System.out.println(" SOMA ");
                    System.out.println(" Digite o primeiro número: ");  // Entrada de Dados
                    int num1 = in.nextInt();
                    System.out.println(" Insira o segundo número: "); // Entrada de Dados
                    int num2 = in.nextInt();
                    System.out.println(" Resultado: " + (num1 + num2));  //Calculo

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Insira 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Esta opção é inválida.");
                        }
                    }
                    // Fim volte ao menu
                    break;

                // [2] - SUBTRAÇÃO
                case 2:
                    System.out.println(" SUBTRAÇÃO ");
                    System.out.println(" Insira o primeiro número: "); // Entrada de dados
                    int num3 = in.nextInt();
                    System.out.println(" Insira o segundo número: ");  //Entrada de dados
                    int num4 = in.nextInt();
                    System.out.println(" Resultado:" + (num3 - num4));  //Calculo

                    /* Opção para retornar ao menu principal */
                    while (opcoes != 0) {
                        System.out.println(" Insira 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Esta opção é inválida.");
                        }
                    }
                    // Fim volte ao menu
                    break;

                case 3:
                    // [3] - DIVISÃO
                    System.out.println(" DIVISÃO ");
                    System.out.println(" Insira o primeiro número: "); // Entrada de dados
                    int num5 = in.nextInt();
                    System.out.println(" Insira o segundo número: "); // Entrada de dados
                    int num6 = in.nextInt();
                    System.out.println(" Resultado:" + (num5 / num6)); // Calculo

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Insira 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" esta opção é inválida.");
                        }
                    }
                    // Fim volte ao menu
                    break;

                case 4:
                    // [4] - FAIXA ETÁRIA
                    System.out.println(" FAIXA ETÁRIA ");
                    double mediamsc = 0;
                    double mediafem = 0;
                    System.out.println(" Insira o número de pessoas");
                    int numeropessoas = in.nextInt();
                    for (int i = 0; i < numeropessoas; i++) {
                        System.out.println(" Digite sua idade ");
                        int idade = in.nextInt();
                        System.out.println(" Digite o seu sexo: (1) Masculino (2)Feminino ");
                        int sexo = in.nextInt();

                        mediaG = mediaG + idade;  // Somar TODAS as idades digitadas
                        if (sexo == 1) {

                            contadorM++;

                            mediaM = mediaM + idade;  // Soma das idades masculinas
                            mediamsc = mediaM / contadorM;  // Media da idades masculinas

                        } else if (sexo == 2) {

                            contadorF++;

                            mediaF = mediaF + idade;  // Soma das idades femininas
                            mediafem = mediaF / contadorF; // Media das idades femininas

                        }

                    }
                    //SAIDA DE DADOS
                    System.out.println(" Media Total: " + mediaT/ numeropessoas);
                    System.out.println(" Media Masculina: " + mediamsc);
                    System.out.println(" Media Feminina: " + mediafem);

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Insira 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Esta opção é inválida.");
                        }
                    }
                    // Fim volte ao menu
                    break;

                case 5:
                    // [5] NÚMEROS PRIMOS
                    // variáveis utilizadas na opção 5
                    int soma = 0;

                    // Entrada de dados
                    System.out.println("Digite um número: ");
                    int num = in.nextInt();

                    for (int j = 1; j <= num; j++) {  // testar numero QUE IRÁ AUMENTAR
                        int contador = 0;
                        for (int i = 1; i <= num; i++) { // testar FOR QUE IRÁ AUMENTAR
                            if (j % i == 0) {
                                contador++;  // Contagem de divisoes com resto 0
                            }
                        }
                        //Numeros primos só tem 2 divisões
                        if (contador == 2) {
                            soma = soma + j;  //Soma dos primos
                        }
                    }
                    //Saída de Dados
                    System.out.println("A soma dos números primos de 1 até "+num+" é igual a: "+soma);

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Insira 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Esta opção é inválida.");
                        }
                    }
                    // Fim volte ao menu
                    break;

                case 6:
                    // [6] MUDANÇA DE BASE
                    System.out.println(" MUDANÇA DE BASE");
                    System.out.println(" Insira [1] para informar um número binário e [2] para informar um número decimal: ");
                    int bindec = in.nextInt();  //Opcao para o menu (binario ou decimal

                    switch (bindec) {
                        case 1:
                            System.out.println(" Insira o valor em binário ");
                            String entrada = in.next();
                            int potencia = 0;
                            int decimal = 0;

                            for (int i = entrada.length() - 1; i >= 0; i--) {
                                decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
                                potencia++;

                            }
                            System.out.println(" O número informado em decimal é: " + decimal);
                            break;

                        case 2:
                            int dec,
                                    mod;
                            String bin = "";
                            System.out.println(" Insira um número em decimal ");
                            dec = in.nextInt();

                            while (dec > 0) {
                                mod = (dec % 2);
                                bin = mod + bin;
                                dec = dec / 2;
                            }
                            System.out.println(" O valor do número informado em binário é " + bin);

                            }
                    // Fim volte ao menu
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim volte ao menu
                    break;

            }
            if(opcoes>7){

                while(opcoes>7){
                    System.out.println("Digite [7] para sair ou [0] para voltar ao menu : ");
                    opcoes = in.nextInt();

                    if(opcoes == 7){
                        opcoes = 7;
                    } else
                    if(opcoes == 0){
                        opcoes = 0;
                    }
                }









            }


        } while (opcoes == 0);

        System.out.println("Até mais!");

    }
}
