package modulo10;

import java.util.Scanner;

public class WHILE_1 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int menores = 0;
        int maiores = 0;
        int numero;
        
        System.out.println("Esse programa recebe varias idades e diz quantos são menores de 21 e quantos são maiores de 50 /n");
        System.out.println("Para sair, digite um número negativo ");
        
        while ((numero = scanner.nextInt()) >= 0) {
        	System.out.println("Adicione a idade de uma pessoa: ");
  
        	
        	if (numero < 21) {
        		menores++;}
        	if (numero > 50) {
        		maiores++;}
        }
        	
        
        System.out.println("Total de pessoas com idade menor que 21 anos \n" + menores);
        System.out.println("Total de pessoas com idade maior que 50 anos \n" + maiores);
        
        
        scanner.close();
        	
        }
	}