package classes;

import java.util.Scanner;

public class Matriz {
	private int [][] mat;
	private String nome;
	
	Scanner sc = new Scanner(System.in);
	
	public Matriz(int lin, int col, String nome) {
		mat = new int [lin][col];
		this.nome = nome;
	}
	
	public void leMatriz() {
		for(int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[i].length; ++j) {
				mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public void imprimirMatriz() {
		for(int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[i].length; ++j) {
				System.out.print(String.format("%2d ", mat[i][j]));
			}
			System.out.println();
		}
	}
	
	public void somarElementosMatriz() {
		int soma = 0;
		for(int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[i].length; ++j) {
				soma += mat[i][j];
			}
		}
		
		System.out.printf("O valor da soma eh: %d\n", soma);
	}
	
	public void procurarElemento() {
		int x = sc.nextInt();
		boolean encontrou = false;
		
		for(int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[i].length; ++j) {
				if (x == mat[i][j]) {
					encontrou = true;
					System.out.println(encontrou);
				}
			}
		}
	}
	
	public static void somarMatriz(Matriz A, Matriz B) {
		Matriz C = new Matriz(4, 4, "C");
		//C.leMatriz();
		
		if (A.mat.length == B.mat.length && A.mat[0].length == B.mat[0].length ) {
			for(int i = 0; i < A.mat.length; ++i) {
				for (int j = 0; j < B.mat[i].length; ++j) {
					C.mat[i][j] = A.mat[i][j] + B.mat[i][j];
				}
			}
			
		}
		
		C.imprimirMatriz();
	}
	
}
