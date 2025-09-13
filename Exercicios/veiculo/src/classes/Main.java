package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String marca = sc.next();
		String modelo = sc.next();
		String cor = sc.next();
		int numPortas = sc.nextInt();
		double tamCorrente;
		
		Carro car1 = new Carro(marca, modelo, cor, numPortas);
		
		System.out.println(car1);
		car1.acelerar();
		car1.frear();
		
		marca = sc.next();
		modelo = sc.next();
		cor = sc.next();
		tamCorrente = sc.nextDouble();
		
		Moto moto1 = new Moto(marca, modelo, cor, tamCorrente);
		System.out.println(moto1);
		
		cor = sc.next();
		
		moto1.setCor(cor);
		System.out.println(moto1);
		
		sc.close();
	}

}
