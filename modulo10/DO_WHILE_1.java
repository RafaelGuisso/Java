package modulo10;

import java.util.Scanner;

public class DO_WHILE_1 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;
        
        System.out.println("Esse programa recebe vários valores e calcula a soma dos números positivos digitados");
        System.out.println("Para sair, digite 0 ");
        
        do {
            System.out.println("Digite um número positivo: ");
            numero = scanner.nextInt();
        	if (numero > 0) {
        		soma = soma + numero;}
            
        
        } while (numero != 0); {
        }
        	
        
        System.out.println("Soma total dos números positivos \n" + soma);
        
        
        scanner.close();
        	
        }
	}