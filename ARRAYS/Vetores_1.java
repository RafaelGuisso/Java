package ARRAYS;

import java.util.Scanner;

public class Vetores_1 {

    public static void main(String[] args) {
    	
    	int numero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja verificar: ");
        numero = scanner.nextInt();
        
        
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        for ( int i=0; i < vetor.length; i++) {
        	if	(vetor[i] == numero) {
        		System.out.println("O número digitado está na posição " + i); 
        			System.exit(0);
        		}
        }
        	System.out.println("O número digitado não está no vetor");

        scanner.close();}
    }
    	
