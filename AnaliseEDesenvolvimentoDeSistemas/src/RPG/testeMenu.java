package RPG;

import java.util.Scanner;


public class testeMenu {
	public static void main(String[] args) {
		int opcaoEscolhida, opcao;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("1 - Jogar");
			System.out.println("2 - Sinopse");
			System.out.println("3 - Instru��es");
			System.out.println("4 - Cr�ditos");
			System.out.println("5 - Sair");
			
			System.out.println("Escolha uma op��o:");
			opcao = input.nextInt();
			

			switch(opcao) {
			
			case 1:
				System.out.println("Jogar");// como acessar o jogo e come�ar a jogar	
				break;
				
			case 2:
				System.out.println("Sinopse");// como escolher uma dessas fun��es e voltar ao menu no final
				break;
				
			case 3:
				System.out.println("Introdu��o");
				break;
				
			case 4:
				System.out.println("Credito");
				break;
			
			case 5:
				System.out.println("Sair");
				break;
				
			default:
				System.out.println("Op��o Invalida!! Digite de 1 a 5");
				System.out.println("");
			}
				
		}while(opcao != 5 );	//pq nao sai..
}	
}
