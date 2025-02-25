package br.edu.fatecpg.repeticaomatriz;

import java.util.Scanner;

public class MatrizTranspose {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		for (int i=0;i<matriz.length;i++) {
			System.out.println("Digite os valores para a " + (i+1) + " linha:");
			for (int j=0;j<3;j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				System.out.print(matriz[j][i] + ",");
			}
			System.out.println();
		}

	}

}