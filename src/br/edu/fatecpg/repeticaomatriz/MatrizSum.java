package br.edu.fatecpg.repeticaomatriz;

import java.util.Scanner;

public class MatrizSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int matriz1[][] = new int[3][3];
		int matriz2[][] = new int[3][3];
		int soma[][] = new int[3][3];
		
		System.out.println("Matriz 1");
		
		for (int i=0;i<matriz1.length;i++) {
			System.out.println("Digite os valores para a " + (i+1) + " linha:");
			for (int j=0;j<matriz1.length;j++) {
				matriz1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Matriz 2");
		
		for (int i=0;i<matriz2.length;i++) {
			System.out.println("Digite os valores para a " + (i+1) + " linha:");
			for (int j=0;j<matriz2.length;j++) {
				matriz2[i][j] = scanner.nextInt();
			}
		}
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				soma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		System.out.println("A Soma das Matrizes");
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(soma[i][j] + ",");
			}
			System.out.println();
		}
			
	}

}