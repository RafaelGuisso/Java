package lista2;

import java.util.Scanner;

public class L2_E5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu pedido?");
        System.out.println("1 - Cachorro Quente - 10 R$");
        System.out.println("2 - X-Salada - 15 R$");
        System.out.println("3 - X-Bacon - 18 R$");
        System.out.println("4 - Bauru - 12 R$");
        System.out.println("5 - Refrigerante - 8 R$");
        System.out.println("6 - Suco de Laranja - 13 R$");

        int comida = scanner.nextInt();
        int total = 0;
        int quantidade = 0;

        switch (comida) {
            case 1:
                System.out.println("Quantos Cachorros Quentes você quer?");
                quantidade = scanner.nextInt();
                total = quantidade * 10;
                break;
            case 2:
                System.out.println("Quantos X-Salada você quer?");
                quantidade = scanner.nextInt();
                total = quantidade * 15;
                break;
            case 3:
                System.out.println("Quantos X-Bacon você quer?");
                quantidade = scanner.nextInt();
                total = quantidade * 18;
                break;
            case 4:
                System.out.println("Quantos Bauru você quer?");
                quantidade = scanner.nextInt();
                total = quantidade * 12;
                break;
            case 5:
                System.out.println("Quantos Refrigerante você quer?");
                quantidade = scanner.nextInt();
                total = quantidade * 8;
                break;
            case 6:
                System.out.println("Quantos Suco de Laranja você quer?");
                quantidade = scanner.nextInt();
                total = quantidade * 13;
                break;
            default:
                System.out.println("Número inválido. Por favor, digite um número de 1 a 6.");
                break;
        }

        System.out.println("Total a pagar: " + total);

        scanner.close();
    }
}
