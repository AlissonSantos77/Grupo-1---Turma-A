package RPG;

import java.util.Scanner;


public class testeMenu {
	public static void main(String[] args) {
		int opcaoEscolhida, opcao;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("1 - Jogar");
			System.out.println("2 - Sinopse");
			System.out.println("3 - Instruções");
			System.out.println("4 - Créditos");
			System.out.println("5 - Sair");
			
			System.out.println("Escolha uma opção:");
			opcao = input.nextInt();
			

			switch(opcao) {
			
			case 1:
				System.out.println("Jogar");// como acessar o jogo e começar a jogar	
				break;
				
			case 2:
				System.out.println("Sinopse");// como escolher uma dessas funções e voltar ao menu no final
				break;
				
			case 3:
				System.out.println("Introdução");
				break;
				
			case 4:
				System.out.println("Credito");
				break;
			
			case 5:
				System.out.println("Sair");
				break;
				
			default:
				System.out.println("Opção Invalida!! Digite de 1 a 5");
				System.out.println("");
			}
				
		}while(opcao != 5 );	//pq nao sai..
}	
}
