package br.edu.fatecpg.repeticaomatriz;

import java.util.Scanner;

public class MatrizLoginVerification {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		String[][] login = {
	            {"João", "123"},
	            {"Felipe", "abc"},
	            {"Jonas", "456"},
	            {"Alessandro", "dbe"},
	            {"Thiago", "789"},
	            {"Carlos", "fgh"}
	        };
		
		System.out.println("Digite o usuário:");
		String user = scanner.nextLine();
		System.out.println("Digite a senha:");
		String password = scanner.nextLine();
		
		boolean loginSuccess = false;
		
		for (int i=0;i<login.length;i++) {
			if(user.equals(login[i][0]) && password.equals(login[i][1])) {
				loginSuccess = true;
			} 	
		}
		
		if(loginSuccess) {
			System.out.println("Login efetuado com sucesso!");
		} else {
			System.out.println("Usuário ou senha incorretos ou não cadastrados!");
		}

	}

}