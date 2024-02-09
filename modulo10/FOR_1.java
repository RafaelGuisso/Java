package modulo10;

import java.util.Scanner;

public class FOR_1 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
    	System.out.println("Esse programa analisa os multiplos de 3 e 5 dentro de um intervalo \n");
    	System.out.println("Para tal, é necessário atribuir o limite inferior e superior do intervalo de análise \n");
    	
    	System.out.println("Qual o limite inferior do intervalo?");	
    	float menor = scanner.nextFloat();
        
        System.out.println("Agora qual o maior número?\n");
        float maior = scanner.nextFloat();
        
        if (menor >= maior) {
        	System.out.println("Intervalo Inválido!");}
        	else 
        		for (int i=(int) menor; i<=maior; i++) {
        			if (i % 3 == 0 && i % 5 == 0) {
        				System.out.println(i +" é múltiplo de 3 e 5\n");
        	}
        }

        scanner.close();
    }
}