package classes;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		String nome, telefone;
		double salario, bonusAnual;
		int pontuacao;
		
		nome  = sc.next();
		telefone = sc.next();
		salario = sc.nextDouble();
		Funcionario func1 = new Funcionario(nome, telefone, salario);
	
		nome  = sc.next();
		telefone = sc.next();
		salario = sc.nextDouble();
		bonusAnual = sc.nextDouble();
		Gerente ger1 = new Gerente(nome, telefone, salario, bonusAnual);
		
		nome  = sc.next();
		telefone = sc.next();
		Cliente cli1 = new Cliente(nome, telefone);
		
		nome  = sc.next();
		telefone = sc.next();
		pontuacao = sc.nextInt();
		Cliente cli2 = new Cliente(nome, telefone, pontuacao);
		
		System.out.println(func1);
		System.out.println(ger1);
		System.out.println(cli1);
		System.out.println(cli2);
		
		salario = sc.nextDouble();
		ger1.setSalario(salario);
		System.out.println(ger1);
		
		sc.close();
	}

}
