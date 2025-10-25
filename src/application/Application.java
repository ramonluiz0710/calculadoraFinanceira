package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		double valor = 0;
		double porcentagem = 0;
		int tempo = 0;
		double montante = 0;
		 
		
		System.out.println("Bem vindo a nossa calculadora financeira!");
		System.out.println();
		
		do {
			System.out.println("Escolha uma das opções: ");
			System.out.println("1 - Calculo de juros simples:");
			System.out.println("2 - Calculo de juos composto: ");
			System.out.println("3 - Conversão de dolar para real:");
			System.out.println("4 - Desconto percentual:");
			System.out.println("5 - Sair:");
			System.out.print("Digite aqui: ");
			
			do {
				try {
					opcao = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Opcao invalida!");
					opcao = 0;
				}finally {
					sc.nextLine();
					System.out.println();
				}
			}while(opcao == 0);
			
			switch(opcao) {
			case 1:
				do {
					try {
						System.out.print("Digite o valor inicial: ");
						valor = sc.nextDouble();
					}catch(InputMismatchException e) {
						System.out.println("Valor invalido!");
						valor = 0;
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(valor == 0);
				
				do {
					try {	
						System.out.print("Digite o tempo (meses) que o dinheiro vai render: ");
						tempo = sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Tempo invalido!");
						tempo = 0;
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(tempo == 0);
				
				do {
					try {
						System.out.print("Digite a porcentagem do juros: ");
						porcentagem = sc.nextDouble();
					}catch(InputMismatchException e) {
						System.out.println("Porcentagem invalida!");
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(porcentagem == 0);
				
				montante = valor + valor * ((porcentagem/100) * tempo);
				System.out.printf("Total depois de %d meses: R$ %.2f\n", tempo, montante);
				System.out.println();
				break;
			case 2:
				do {
					try {
						System.out.print("Digite o valor inicial: ");
						valor = sc.nextDouble();
					}catch(InputMismatchException e) {
						System.out.println("Valor invalido!");
						valor = 0;
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(valor == 0);
				
				do {
					try {	
						System.out.print("Digite o tempo (meses) que o dinheiro vai render: ");
						tempo = sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Tempo invalido!");
						tempo = 0;
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(tempo == 0);
				
				do {
					try {
						System.out.print("Digite a porcentagem do juros: ");
						porcentagem = sc.nextDouble();
					}catch(InputMismatchException e) {
						System.out.println("Porcentagem invalida!");
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(porcentagem == 0);
				
				montante = valor * (Math.pow(1 + (porcentagem/100), tempo));
				System.out.printf("Total depois de %d meses: R$ %.2f\n", tempo, montante);
				System.out.println();
				break;
			case 3:
				do {
					try {
						System.out.print("Digite o valor a ser convertido: ");
						valor = sc.nextDouble();
					}catch(InputMismatchException e) {
						System.out.println("Valor invalido!");
						valor = 0;
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(valor == 0);
				
				montante = valor * 5.50;
				
				System.out.printf("Valor em real: R$ %.2f\n", montante);
				System.out.println();
				break;
			case 4:
				do {
					try {
						System.out.print("Digite o valor: ");
						valor = sc.nextDouble();
					}catch(InputMismatchException e) {
						System.out.println("Valor invalido!");
						valor = 0;
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(valor == 0);
				
				do {
					try{
						System.out.print("Digite a porcentagem a ser descontada: ");
						porcentagem = sc.nextDouble();
					}catch(InputMismatchException e) {
						System.out.println("Porcentagem invalida!");
						porcentagem = 0;
					}finally {
						sc.nextLine();
						System.out.println();
					}
				}while(porcentagem == 0);
				
				montante = valor - (valor * (porcentagem/100));
				
				System.out.printf("Valor com desconto: R$ %.2f\n", montante);
				System.out.println();
				break;
			case 5:
				System.out.println("Saindo...");
				System.out.println();
				break;
			default:
				System.out.println("Opção invalida!");
			}
		}while(opcao != 5);
		
		System.out.println("Obrigado por usar nosso sistema!");
	}
}
