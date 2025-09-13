package classes;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cor = sc.nextLine();
		double altura = sc.nextDouble();
		double largura = sc.nextDouble();
		
		Retangulo ret1 = new Retangulo(cor, altura, largura);
		System.out.println(ret1);
		
		sc.nextLine();
		cor = sc.nextLine();
		altura = sc.nextDouble();
		largura = sc.nextDouble();
		
		Triangulo trig1 = new Triangulo(cor, altura, largura);
		System.out.println(trig1);
		
		sc.close();
	}

}
