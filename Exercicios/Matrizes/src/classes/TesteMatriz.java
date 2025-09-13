package classes;

public class TesteMatriz {

	public static void main(String[] args) {
		Matriz A = new Matriz(4, 4, "A");
		A.leMatriz();
		
		Matriz B = new Matriz(4, 4, "B");
		B.leMatriz();
		
		Matriz.somarMatriz(A, B);
	}
}
