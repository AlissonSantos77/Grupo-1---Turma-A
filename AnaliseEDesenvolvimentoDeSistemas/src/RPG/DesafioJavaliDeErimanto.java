package RPG;

import java.util.Scanner;

public class DesafioJavaliDeErimanto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nomeHeroi, nomeDeus, escolha;
		int s=1 , n=2, opcao;
		
		
		System.out.println("Escolha um nome para o Heroi ou Heroina de sua Jornada: ");
		nomeHeroi = input.next();
		System.out.println("");
	
		System.out.println( nomeHeroi+" � um SemiDeus filho de um Deus com um Mortal! Escolha que Deus � seu pai: ");//montar uma escolha
		System.out.println("1 - Zeus Deus do Trov�o");
		System.out.println("2 - Afrotide Deusa do Amor e Fertilidade");
		System.out.println("3 - Poseidon Deus dos Mares");
		System.out.println("4 - Ares Deus da Guerra");
		
		System.out.println("Fa�a uma escolha :");
		opcao = input.nextInt();
		nomeDeus = input.next();
		
		switch(opcao) {
		
		case 1:
			nomeDeus="Zeus";	
			break;
			
		case 2:
			nomeDeus="Afrodite";
			break;
			
		case 3:
			nomeDeus="Poseidon";
			break;
			
		case 4:
			nomeDeus="Ares";
			break;
			
		default:
			System.out.println("Op��o Invalida!! Digite de 1 a 4");
			System.out.println("");
			
		}
		
		
		
		//nomeHeroi = input.next();
		
		System.out.println("Ol� "+nomeHeroi+"! Voc� esta preste a iniciar uma jornada com muita aventura e conhecimento!");
		System.out.println("");
		System.out.println("Voc� ser� testado e vai passar por 10 desafios mitologicos!! \n "
				+ "E para que consiga resolver ter� que utilizar de seus conhecimentos em ALGORITMOS E PROGRAMA��O!!");
		System.out.println("");
		
				System.out.println("Sua jornada inicia..... Matar o Javali de Erimanto");//escrever melhor a historia
				System.out.println("");
				
				System.out.println("Utilizando seus conhecimentos de Algotismos e Programa��o desvente o enigma no codigo para que o grande Heroi "+nomeHeroi+" um semiDeus filho de "+nomeDeus+" possa abrir a Urna pegar sua espada para que consiga\n"
						+ "derrotar o Javali de Erimanto");
				System.out.println("");
				
				System.out.println("Um programa gera uma s�rie de n�meros: 10, 20, 30, 40...90,100. Utilizando o la�o FOR."
						+ "\n complete com a informa��o que falta para que o codigo funcione:\n"
						+ "for(int i=10; i<=100; i= i(????){ "
						+ "System.out.println(i); ");	
					System.out.println("");
			        System.out.println("<a> +10 ");
			        System.out.println("<b> ++");
			        System.out.println("<c> +100");
			        System.out.println("<d> 100"); 
			        System.out.println("<e> 10"); 
			        System.out.println("");
			        
			        int tentativaAtual = 1;
			        int tentativaMax = 3;
			        int tentativa = 1;
			        
			        do {
			        
			            String alternativa = input.next();

			            switch (alternativa) {
			                
			                case "a": 

			                System.out.println("Resposta correta!");
			                tentativaAtual = 4;
			                break;

			                default:  

			                if(tentativaAtual < 3) {

			                    System.out.println("Resposta incorreta! O javali joga "+nomeHeroi+" para longe por�m o heroi ainda tem for�as para lutar! Tente novamente!");
			                    tentativa++;

			                } else {

			                    System.out.println("Resposta incorreta, nas 3 tentativas!\n "
			                    		+ "Voc� foi derrotado pelo Javali de Erimanto e perdeu 10 pontos de vida!!");// criar uma condi��o de vida aqui...
			                }
			                
			                tentativaAtual++;
			                
			            }
			            
			        } while (tentativaAtual <= tentativaMax);
			        
			//}else{
				//menu
			}
		
		
		
		
			
		}



	//}

