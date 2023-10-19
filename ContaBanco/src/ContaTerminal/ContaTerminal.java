package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner captura = new Scanner (System.in);
		
		System.out.println("Por favor, digite o seu nome!");
		String nome = captura.next();
		
		System.out.println("Por favor, digite o seu sobrenome!");
		String sobrenome = captura.next();
		
		System.out.println("Por favor, digite o número da Agência!");
		String agencia = captura.next();
		
		System.out.println("Por favor, digite o número da sua conta!");
		int numero = captura.nextInt();
		
		System.out.println("Por favor, digite o valor depositado!");
		double saldo = captura.nextDouble();
		
		System.out.println("Olá " + nome +" "+ sobrenome+", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+", conta " + numero +" e seu saldo " +saldo+ "já está disponível para saque");

	}

}
