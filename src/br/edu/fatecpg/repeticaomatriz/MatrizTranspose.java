package br.edu.fatecpg.repeticaomatriz;

import java.util.Scanner;

public class MatrizTranspose {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int matriz1[][] = new int[3][2];
        int matriz2[][] = new int[2][3];
        

        for (int i = 0; i < matriz1.length; i++) {
            System.out.println("Digite os valores para a " + (i + 1) + "ª linha:");
            for (int j = 0; j < matriz1[i].length; j++) { 
                matriz1[i][j] = scanner.nextInt();
            }
        }
        

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz2[j][i] = matriz1[i][j]; 
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
