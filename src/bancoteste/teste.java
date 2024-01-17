package bancoteste;

import java.util.Scanner;

import banco.Conta;

public class teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Conta conta;

		System.out.print("Digite o numero da conta bancaria: ");
		int numeroConta = entrada.nextInt();
		
		System.out.print("Digite seu nome: ");
		entrada.nextLine();
		String nome = entrada.nextLine();
		
		System.out.print("Deseja iniciar com um deposito (y/n)? ");
		char response = entrada.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Digite seu deposito: ");
			double inicialDeposito = entrada.nextDouble();
			conta = new Conta(numeroConta, nome, inicialDeposito);
			
		}
		else {
			conta = new Conta(numeroConta, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta :");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("insira um valor de deposito: ");
		double depositValue = entrada.nextDouble();
		conta.deposito(depositValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira um valor para saque: ");
		double valorSaque = entrada.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		
		
		
		
		entrada.close();

	}

}
