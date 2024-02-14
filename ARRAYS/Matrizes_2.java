package ARRAYS;

import java.util.Scanner;

public class Matrizes_2 {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	float[][] matriz_notas = {
    		    {4.0f, 5.0f, 7.0f, 3.0f}, {2.5f, 6.5f, 4.7f, 8.0f}, {10.0f, 8.5f, 9.5f, 8.0f},
    		    {9.0f, 6.5f, 7.6f, 8.2f}, {5.0f, 5.0f, 5.0f, 6.3f}, {7.0f, 8.0f, 9.0f, 8.5f},
    		    {5.5f, 3.5f, 2.5f, 1.0f}, {8.0f, 9.0f, 10.0f, 9.5f}, {5.6f, 5.8f, 6.5f, 7.0f},
    		    {7.5f, 8.5f, 9.5f, 10.0f}
    		};
    	
    	float[][] vetor_medias = new float[matriz_notas.length][1];
    	
    	for (int i = 0; i < matriz_notas.length; i++) {
            float soma = 0;
            for (int j = 0; j < matriz_notas[i].length; j++) {
                soma += matriz_notas[i][j];
            }
            vetor_medias[i][0] = soma / matriz_notas[i].length;
        }

        System.out.println("Médias das notas:");
        for (int i = 0; i < vetor_medias.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + vetor_medias[i][0]);
        }
    
        scanner.close();
    }
}
