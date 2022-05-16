package RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Classe �nica utilizada para a constru��o do RPG
public class ex {

    static Scanner entrada = new Scanner(System.in);

    //M�todo criado para apresentar a estrutura do Menu ao usu�rio na tela inicial e obter a escolha
    static int menu() {
        int opcao;

        //estrutura de repeti��o seguida por estrutura condicional para valida��o da op��o escolhida pelo usu�rio
        do {
            System.out.println("\n1 - Jogar");
            System.out.println("2 - Sinopse");
            System.out.println("3 - Instru��es");
            System.out.println("4 - Cr�ditos");
            System.out.println("5 - Sair");

            System.out.print("\nDigite a op��o desejada: ");
            opcao = entrada.nextInt();

            if (opcao > 5 || opcao < 1) {
                System.out.println("\nOp��o inv�lida.");
            }
        } while (opcao > 5 || opcao < 1);

        return opcao;
    }

    //M�todo criado para determinar a fun��o que ser� executada de acordo com o par�metro escolhido pelo usu�rio no menu
    static void controlador(int opcao) {
        switch (opcao) {
            case 1:
                jogar();
                break;
            case 2:
                sinopse();
                break;
            case 3:
                instrucao();
                break;
            case 4:
                creditos();
                break;
            case 5:
                sair();
                break;
        }
    }

    //M�todo criado para apresentar as instru��es b�sicas do jogo ao usu�rio
    static void instrucao() {
        System.out.println("\n**********************************INTRU��ES**************************************");
        System.out.println("\nVoc� s� pode concluir a hist�ria se enfrentar os desafios que forem apresentados.");
        System.out.println("\nQuando iniciar o jogo, voc� encontrar� alguns campos para digitar suas escolhas.");
        System.out.println("\nUtilize apenas os n�meros na frente das frases para selecionar sua op��o.");
        System.out.println("\nPor exemplo:");
        System.out.println("\nVoc� est� entendendo a explica��o?");
        System.out.println("1 - Sim \n2 - N�o");
        System.out.println("Digite sua escolha:_____");
        System.out.println("\nNesse caso, voc� digitaria o n�mero 1 ou o n�mero 2 para escolher.");
        System.out.println("\nCaso voc� escreva alguma palavra, o jogo ler� sua escolha como inv�lida.");
        System.out.println("\nVoc� s� poder� prosseguir com a hist�ria se digitar corretamente.");
        System.out.println("\nSempre que encontrar falas do narrador, voc� visualizar� um - antes da frase.");
        System.out.println("*********************************************************************************");
    }

    //M�todo criado para apresentar uma breve descri��o do jogo ao usu�rio
    static void sinopse() {
        System.out.println("\n***********************************************************SINOPSE**************************************************************");
        System.out.println("\nDEMA � um lugar silencioso, cinzento, obscuro e solit�rio que � regido por um grupo macabro e misterioso conhecido como A ORDEM.\n"
                + "\n� tamb�m o lugar onde voc� est� prestes a adentrar...\n"
                + "\nMas ser� que voc� � capaz de escapar de toda essa tormenta?\n"
                + "\nTente aproveitar todas as suas chances para vencer os desafios e prove a si mesmo que � capaz.\n"
                + "\nDurante sua jornada voc� contar� com a ajuda da IRMANDADE, mas tamb�m ter� de enfrentar A ORDEM para alcan�ar seu objetivo.\n"
                + "\nGuarde todos os conhecimentos que ir� adquirir nessa jornada, pois esse mundo � mais real do que se imagina.\n"
                + "\nE lembre-se, DEMA n�o nos controla!");
        System.out.println("********************************************************************************************************************************");
    }

    //Fun��o para apresentar os cr�ditos aos criadores e programadores do projeto
    static void creditos() {
        System.out.println("\n****************************CR�DITOS*****************************");
        System.out.println("\nEste RPG textual foi desenvolvido pelos alunos:"
                + "\n*Carlos Eduardo"
                + "\n*Gabriel Rodrigues"
                + "\n*Lucas Santos"
                + "\n\nMat�ria: Projeto Integrador I"
                + "\n\nCurso: Tecnologia em An�lise e Desenvolvimento de Sistemas"
                + "\n\nTurma: A | Per�odo: Noturno | Ano: 2019"
                + "\n\nInstitui��o de ensino: Centro Universit�rio Senac - Santo Amaro");
        System.out.println("*****************************************************************");
    }

    //Fun��o para apresentar uma mensagem caso o usu�rio opte por sair do jogo
    static void sair() {
        System.out.println("\n*****************");
        System.out.println("Sess�o finalizada");
        System.out.println("*****************");
    }

    //Fun��o para apresentar o desafio final
    static void desafioFinal() {
        int aleatorio;
        String opcao;

        //poss�veis quest�es para o desafio final
        String[] perguntas = {"-Porque no fim das contas, A ORDEM � a representa��o de seus macanismos de defesa e doen�as psicol�gicas.",
            "-Porque DEMA � a sua pr�pria mente.",
            "-Porque Thanatos, o l�der da ORDEM, nada mais � do que a personifica��o da Depress�o que voc� carrega."};

        //alternativas para cada quest�o
        String[] questoes = {"1-Verdadeiro \n2-Falso",
            "1-Verdadeiro \n2-Falso",
            "1-Verdadeiro \n2-Falso"};

        //respostas corretas para cada afirma��o
        String[] respostas = {"1",
            "1",
            "1"};

        //feedback positivo para cada quest�o
        String[] feedbackPositivo = {"\n-Voc� foi muito observador(a) durante toda a sua jornada nesse universo."
            + "\n-E foi sua aten��o aos detalhes te possibilitou vencer o �ltimo desafio!\n"};

        //feedback negativo para cada quest�o
        String[] feedbackNegativo = {"\n-Mesmo ap�s sua longa jornada em DEMA, ainda � necess�rio ter um pouco mais de aten��o aos detalhes..."
            + "\n-Isso pode definir suas rela��es com todos ao seu redor, e com si mesmo."
            + "\n\n-Sempre busque ser melhor!\n"};

        //aleatoriedade para mostrar 1 das 3 afirma��es
        aleatorio = (int) (Math.random() * 3);

        //impress�o da afirma��o e as alternativas        
        do {
            System.out.print("\n" + perguntas[aleatorio] + "\n" + questoes[aleatorio] + "\nDigite sua escolha: ");
            opcao = entrada.next();
            if (!opcao.equals("1") && !opcao.equals("2")) {
                System.out.println("\nOp��o inv�lida.");
            }
        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //condicional para verificar qual o feedback que ser� apresentado para o us�ario
        if (opcao.equals(respostas[aleatorio])) {
            System.out.println(feedbackPositivo[0]);
        } else {
            System.out.println(feedbackNegativo[0]);
        }
    }

    //Fun��o utilizada para a codifica��o da hist�ria principal e desafios do jogo
    static void jogar() {

        //declara��o de vari�ves locais
        String nome, opcao;
        int aleatorio, escolha;
        boolean acerto = false;

        //estrutura de repeti��o para obter nome/id do usu�rio
        do {
            System.out.print("\nDigite como voc� gostaria de ser chamado(a): ");
            nome = entrada.next();

            //estrutura de repeti��o e estrutura condicional para validar a op��o escolhida usu�rio e dar a chance de modificar o nome
            do {
                System.out.print("Voc� confirma que seu nome � " + nome + "? \n1 - Sim \n2 - N�o \nConfirme: ");
                opcao = entrada.next();

                switch (opcao) {
                    case "1":
                    case "2":
                        break;
                    default:
                        System.out.println("\nOp��o inv�lida.\n");
                        break;
                }
            } while (!opcao.equals("1") && !opcao.equals("2"));

        } while (!opcao.equals("1"));

        //IN�CIO DO PRIMEIRO ARCO DA HIST�RIA
        System.out.println("\n_____________________________________________________________________________________________________________________");
        System.out.println("\nSeja bem-vindo(a), " + nome + "!");
        System.out.println("\n-DEMA � o local onde nem mesmo o mais bravo dos homens gostaria de viver.");
        System.out.println("-Uma cidade m�rbida e fria regida por uma organiza��o suprema conhecida como A ORDEM.");
        System.out.println("-Os membros dessa organiza��o s�o grandes esqueletos trajados de capas vermelhas, bem semelhantes a vestes de padres.");
        System.out.println("-N�o se sabe desde quando DEMA existe. O que se sabe � que ning�em entra ou sai de l�.");
        System.out.println("-Bom... Isso � o que A ORDEM sempre disse...");
        System.out.println("-Os habitantes de DEMA sempre comentaram sobre um grupo de pessoas que j� escapou de l�, conhecidos como A IRMANDADE.");
        System.out.println("-Ningu�m nunca p�de provar a exist�ncia desse grupo, e A ORDEM sempre se alegrou com isso.");
        System.out.println("-Mas o fato � que A IRMANDADE � real!");
        System.out.println("-Os integrantes desse grupo conseguiram escapar de DEMA e vivem na TRINCHEIRA, seu acampamento no entorno da cidade.");
        System.out.println("-Desvende quem s�o os integrantes da IRMANDADE, os males pertencentes � ORDEM e seja capaz de enfrentar seus desafios!");

        System.out.println("\nA partir de agora voc� est� por sua conta e risco... \n\n...\n"
                + "\nDesconhecido: " + nome + "...? "
                + "\nDesconhecido: Como voc� est� se sentindo...? \n"
                + nome + ": Como eu... me sinto?"
                + "\nDesconhecido: Voc� pode ser honesto(a), sabia...?\n"
                + nome + ": Bem... � como seu n�o sentisse nada... como se eu n�o existisse..."
                + "\nDesconhecido: Continue assim... tudo ficar� bem, minha crian�a...\n"
                + nome + ": Voc� sempre me diz isso...");

        System.out.println("\n*Horas depois*\n\n"
                + nome + ": Cara... que dor de cabe�a... aquela voz mais uma vez... tenho certeza que ouvi ela antes de adormecer...\n"
                + "\n-Voc� se encontra no seu quarto."
                + "\n-Ele � vazio e bagun�ado... mas � seu."
                + "\n-H� apenas uma escrivaninha, uma cama e uma cadeira. Tudo � cinza, assim como DEMA."
                + "\n-Sobre a mesa voc� avista uma carta que n�o parecia estar l� ontem..."
                + "\n-H� tamb�m uma mochila velha e suja debaixo da cama fria.");

        //estrutura de repeti��o seguida de estrutura condicional para valida��o da op��o escolhida pelo usu�rio
        do {
            System.out.println("\nPrimeiro voc� deseja ler a carta ou pegar a mochila? \n1 - Ler a carta \n2 - Pegar a mochila");
            System.out.print("\nDigite sua escolha: ");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                case "2":
                    break;
                default:
                    System.out.println("\nOp��o inv�lida.");
            }

        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //bloco executado caso o usu�rio escolha pegar a carta primeiro
        if (opcao.equals("1")) {
            //mensagem apresentada dentro da carta
            System.out.println("\n~~~~\nNOS ENCONTRE PERTO DA EST�TUA CENTRAL, AO CAIR DA NOITE. V� PREPARADO!"
                    + "\nDICA: ELES N�O PODEM VER AMARELO!\n\n -A IRMANDADE \n~~~~\n");

            System.out.println(nome + ": Essa � minha chance! Talvez dessa vez eu consiga escapar desse lugar!\n"
                    + nome + ": Antes de sair � melhor arrumar minha mochila");

            //campo de escrita para executar a��o do usu�rio
            do {
                System.out.print("\n1 - Pegar a mochila \nDigite: ");
                opcao = entrada.next();

                if (!opcao.equals("1")) {
                    System.out.println("\nOp��o inv�lida.");
                }

            } while (!opcao.equals("1"));

            System.out.printf("\n-%s verifica que, apesar de velha, a mochila ainda parece ser funcional.", nome);

            System.out.println("\n-Ent�o coloca seu Jumpsuit e sua fita pl�stica amarela dentro de sua mochila velha e est� pronto para partir!");
        } //caminho executado caso o usu�rio escolha pegar a mochila primeiro
        else if (opcao.equals("2")) {
            System.out.println("\n-" + nome + " verifica que, apesar de velha, a mochila ainda parece ser funcional.");

            //estrutura de repeti��o para solicitar a leitura da carta ao usu�rio e continuar o c�digo
            do {
                System.out.print("\n1 - Ler carta \nDigite: ");
                opcao = entrada.next();

                if (!opcao.equals("1")) {
                    System.out.println("\nOp��o inv�lida.");
                }

            } while (!opcao.equals("1"));

            //mensagem apresentada dentro da carta
            System.out.println("\n~~~~\nNOS ENCONTRE PERTO DA EST�TUA CENTRAL, AO CAIR DA NOITE. V� PREPARADO!"
                    + "\nDICA: ELES N�O PODEM VER AMARELO!\n\n -A IRMANDADE \n~~~~\n");

            System.out.println(nome + ": Essa � minha chance! Talvez dessa vez eu consiga sair desse lugar!\n"
                    + nome + ": Mas antes de sair � melhor arrumar minha mochila!");

            System.out.println("\n-Ent�o voc� coloca seu Jumpsuit e sua fita pl�stica amarela dentro de sua mochila velha e est� pronto para partir!");
        }

        //IN�CIO DO SEGUNDO ARCO DA HIST�RIA
        System.out.println("\n-Ao sair do seu quarto, voc� encontra seu primeiro desafio."
                + "\n-H� um enorme esqueleto na sua frente, apoiado na mureta que divide a rua e a sa�da de seu pequeno quarto."
                + "\n-Este � Anubis, um dos Capas Vermelhas, ou como s�o mais conhecidos, A ORDEM. "
                + "\n-Ele est� portando sua *roleta da doutrina*."
                + "\n-Esse objeto gera uma pergunta aleat�ria relacionada a voc� mesmo,"
                + "\n-E se quer sair de seu quarto, deve responder corretamente ao que ele pede."
                + "\n-Entretanto, este objeto temb�m � usado para manter tudo em DEMA sob controle.");

        System.out.println("\nANUBIS: Ol�, " + nome + ", onde pensa que vai? Bem... n�o importa! "
                + "\nANUBIS: Precisa encarar minha roleta da doutrina se quiser deixar seu quarto."
                + "\nANUBIS: Mas j� lhe aviso, n�o � t�o simples quanto parece.");
        System.out.println("\n-Anubis roda a roleta... ela vai parando lentamente at� que... l� est� sua pergunta!");

        //PRIMEIRO DESAFIO
        System.out.println("\nANUBIS: Para se manter bem em DEMA voc� deve ter atitudes adversas ao restante das pessos ao seu redor."
                + "\nANUBIS: E deve estar distante delas, pois assim elas n�o v�o julgar voc� e tudo terminar� bem..."
                + "\nANUBIS: Em outras palavras, o que voc� deve praticar?");

        //cria��o de uma nova lista para armazenar as alternativas do desafio
        List respostas = new ArrayList();

        //cria��o das alternativas de resposta
        respostas.add("Deslocamento");
        respostas.add("Isolamento"); //resposta correta
        respostas.add("Apatia");
        respostas.add("Sublima��o");
        respostas.add("Regress�o");

        //estrutura de repeti��o para apresentar as alternativas do desafio ao usu�rio
        do {
            //classe que far� o embaralhamento das alternativas adicionadas
            Collections.shuffle(respostas);

            //apresenta��o das alternativas embaralhadas para o usu�rio
            System.out.println("1 - " + respostas.get(0));
            System.out.println("2 - " + respostas.get(1));
            System.out.println("3 - " + respostas.get(2));
            System.out.println("4 - " + respostas.get(3));
            System.out.println("5 - " + respostas.get(4));

            System.out.print("Digite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional para verificar se a op��o escolhida � a correta
            switch (opcao) {
                case "1":
                    if (respostas.get(0).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVoc� pode tentar novamente. Mas enquanto n�o acertar, n�o passar�!\n");
                    }
                    break;
                case "2":
                    if (respostas.get(1).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVoc� pode tentar novamente. Mas enquanto n�o acertar, n�o passar�!\n");
                    }
                    break;
                case "3":
                    if (respostas.get(2).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVoc� pode tentar novamente. Mas enquanto n�o acertar, n�o passar�!\n");
                    }
                    break;
                case "4":
                    if (respostas.get(3).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVoc� pode tentar novamente. Mas enquanto n�o acertar, n�o passar�!\n");
                    }
                    break;
                case "5":
                    if (respostas.get(4).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVoc� pode tentar novamente. Mas enquanto n�o acertar, n�o passar�!\n");
                    }
                    break;
                default:
                    System.out.println("\nEscolha inv�lida.\n");
            }
        } while (!acerto);

        //feedback do desafio
        System.out.println("\n-Enfim voc� foi capaz de visualizar o que � isolamento... voc� foi bem!"
                + "\n-Perceber caracter�sticas e mecanismos de defesa em outras pessoas e em voc� pode ajudar em diversos momentos...");

        System.out.println("\nANUBIS: Devo alertar ao resto da ORDEM... se voc� continuar assim e perceber tudo, ser� nosso fim!"
                + "\nANUBIS: Mas como combinado, voc� pode passar... s� n�o fique perambulando por a�. "
                + "\nANUBIS: Estamos de olho em voc� sempre, minha crian�a...\n"
                + nome + ": O que voc� quer dizer com \"ser o fim de voc�s\"?! N�o se cale!");

        System.out.println("\n-E num piscar de olhos, tudo ficou cinza e n�o dava pra enxergar nada "
                + "\n-Quando voc� conseguiu abrir os olhos e enxergar, o enorme esqueleto havia sumido!\n");
        System.out.println(nome + ": Tenho que me apressar para chegar at� a est�tua central. J� vai escurecer.");

        //IN�CIO DO TERCEIRO ARCO DA HIST�RIA
        System.out.println("\n-Alguns minutos depois de encontrar seu primeiro obst�culo,\n-"
                + nome + " visualiza a est�tua e se encaminha para o enorme galp�o em que ela fica localizada."
                + "\n-Antes que tivesse tempo para descansar, " + nome + " � cercado por um grupo de pessoas."
                + "\n-Pelas vestes militares amarelas e as tochas nas m�os, s� pode significar uma coisa..."
                + "\n-A carta era real!\n");

        System.out.println(nome + ": EU SABIA!!!\n"
                + nome + ": Voc�s existem!\n"
                + "L�der da IRMANDADE: Ent�o voc� conseguiu chegar at� aqui.\n"
                + "L�der da IRMANDADE: Isso significa que enfrentou a roleta da doutrina e venceu Anubis.\n"
                + "L�der da IRMANDADE: Muito bem!\n"
                + nome + ": Todos em DEMA comentam sobre a exist�ncia de voc�s,\n"
                + nome + ": Mas os Capas Vermelhas sempre negaram a possbilidade de haver quem deixasse DEMA.\n"
                + nome + ": Mas por alguma raz�o eu acreditava na sua exist�ncia.");

        System.out.println("\nL�der da IRMANDADE: N�o temos tempo para conversas... eles j� sabem da nossa presen�a aqui e est�o a caminho."
                + "\nL�der da IRMANDADE: Precisamos deixar DEMA agora! Pegue seu Jumpsuit!");

        //estruturas condicionais para validar a op��o escolhida pelo usu�rio
        do {
            System.out.println("\n1 - Tudo bem! \n2 - Por que?");
            System.out.print("Digite sua escolha: ");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                case "2":
                    break;
                default:
                    System.out.println("\nOp��o inv�lida.");
            }

        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //estrutura condicional para se usu�rio questionar por que pegar o jumpsuit
        if (opcao.equals("2")) {
            System.out.printf("\n%s: Por que?", nome);
            System.out.println("\nL�der da IRMANDADE: Ele � capaz de camuflar voc� e impedir que seja visualizado de maneira f�cil. Agora pegue!");
        }

        System.out.println("\n" + nome + ": Tudo bem!");
        System.out.println("\nL�der da IRMANDADE: Escute, " + nome + "... sabemos que voc� sente que suas atitudes n�o s�o importantes."
                + "\nL�der da IRMANDADE: Mas para escapar de DEMA precisamos acionar as passagens subterr�neas."
                + "\nL�der da IRMANDADE: E a �nica forma de fazer isso � derrotando esse mecanismo de defesa da apatia que voc� desenvolveu.\n"
                + nome + ": O que preciso fazer?"
                + "\nL�der da IRMANDADE: H� um n�mero chave que aciona as passagens subterr�neas aqui no galp�o."
                + "\nL�der da IRMANDADE: Como todos em DEMA s�o condicionados a permanecer ap�ticos, s� h� uma maneira de escapar pelos t�neis..."
                + "\nL�der da IRMANDADE: � preciso demonstrar interesse e motiva��o descobrindo o n�mero certo para acionar as passagens de fuga."
                + "\nL�der da IRMANDADE: Essa � a �nica maneira se quiser escapar daqui."
                + "\nL�der da IRMANDADE: Quando disser um n�mero que est� numa dist�ncia de 1 n�mero pra mais ou pra menos do n�mero certo,"
                + "\nL�der da IRMANDADE: Lhe darei dicas para ajudar."
                + "\nL�der da IRMANDADE: Contamos com voc�! Demonstre interesse em algo! Sinta que voc� � capaz!"
                + "\nL�der da IRMANDADE: Ah, o n�mero chave est� entre 0 e 50.");

        //SEGUNDO DESAFIO
        //retorno da vari�vel acerto ao seu estado falso para reutilizar a vari�vel no desafio a seguir
        acerto = false;

        //fun��o utilizada para gerar um n�mero chave aleat�rio entre 0 e 50
        aleatorio = (int) (Math.random() * 51);

        //estrutura condicional para validar a op��o escolhida pelo usu�rio
        do {
            System.out.print("\nDigite seu escolha: ");
            escolha = entrada.nextInt();

            //feedback positivo assim que o usu�rio acertar a quest�o
            if (escolha == aleatorio) {
                System.out.println("\n-Voc� mandou bem! Continue assim!"
                        + "\n-Mais do que um sentimento angustiante, a apatia pode ser um sintoma de dist�rbios mentais graves."
                        + "\n-Mas h� pessoas que podem te ajudar a procurar ajuda e te fazer sair dessa! "
                        + "\n-Confie em pessoas que se importam com voc�, sua opini�o e sua atitude fazem a diferen�a no mundo!");
                acerto = true;
                break;
            }
            //dicas para ajudar o usu�rio a acertar a senha 
            if (escolha == (aleatorio + 1) || escolha == (aleatorio - 1)) {
                System.out.println("L�der da IRMANDADE: Voc� est� muito pr�ximo!");
            } else if (aleatorio > escolha) {
                System.out.println("L�der da IRMANDADE: O n�mero chave � MAIOR do que sua escolha!");
            } else if (aleatorio < escolha) {
                System.out.println("L�der da IRMANDADE: O n�mero chave � MENOR do que sua escolha!");
            }
        } while (!acerto);

        System.out.println("\nL�der da IRMANDADE: Voc� conseguiu! Agora vamos depressa! Eles est�o chegando!");

        System.out.println("\n-" + nome + " se junta � IRMANDADE e entra nas passagens subterr�neas daquele galp�o frio e cinzento."
                + "\n-Em quest�o de segundos, dois Capas Vermelhas chegam ao local e encontram algumas crian�as."
                + "\n-Elas est�o segurando tochas apagadas e o que parece ser peda�os de uma jaqueta camuflada."
                + "\n-Os portadores daquelas capas eram Thanatos e Oizus. "
                + "\n-Eles sentiram a presen�a da IRMANDADE em DEMA e foram at� o local o mais r�pido poss�vel."
                + "\n-Eles r�pidamente perceberam a gravidade daquele ocorrido e sentiram a presen�a de " + nome + " se distanciar cada vez mais."
                + "\n-Seria necess�rio agir rapidamente, pois se eles permitissem que tudo ficasse assim, poderia ser o fim de DEMA."
                + "\n-Enquanto A IRMANDADE se encaminhava para fora de DEMA pelos t�neis subterr�neos de forma silenciosa,"
                + "\n-A ORDEM se preparava para recuperar seu habitante mais precioso, " + nome + ".");

        //IN�CIO DO QUARTO ARCO DA HIST�RIA
        System.out.println("\n-Pelo lado de fora de DEMA, o grupo da IRMANDADE se dirigia at� a TRINCHEIRA.");
        System.out.println("-O sil�ncio ainda era predominante,");
        System.out.println("-E andando pelas montanhas rochosas a �nica luz que se via era a das tochas levadas pelo grupo.");
        System.out.println("-Ent�o ap�s uma longa caminhada, o grupo finalmente chega no acampamento.");
        System.out.println("\n-Todos ficam alegres com a chegada de " + nome + ", o resgate parece ter sido um sucesso.");
        System.out.println("-A cor predominante em tudo era amarelo. Roupas camufladas, barracas, equipamentos, flores.");
        System.out.println("-O local era como se fosse um tipo de base militar e havia muitas �reas montanhosas ao redor.");
        System.out.printf("-A grande quantidade de tochas espalhadas pelo local n�o era algo comum para %s.", nome);
        System.out.println("\n-Mas o fogo cobria todas as �reas do acampamento, era uma maneira de manter as sombras longe.");
        System.out.printf("-E com a chegada de %s, o grupo decide comemorar.", nome);

        System.out.printf("\n\n%s: Quem s�o voc�s, afinal?", nome);
        System.out.println("\n\n-Neste momento o grupo inteiro desamarrou as bandanas que cobriam grande parte do seu rosto.");
        System.out.printf("-Finalmente %s conseguia se lembrar...", nome);
        System.out.println("\n-Seus pais, seus irm�os, seus melhores amigos...");
        System.out.println("-As pessoas mais importantes na vida de " + nome + " estavam ali...");
        System.out.println("-� como se aos poucos suas mem�rias retornassem. ");
        System.out.println("-Como se aquelas pessoas realmente fossem importantes...");
        System.out.println("-Mas parece que os dias solit�rios em DEMA fizeram voc� esquecer de tudo.");
        System.out.printf("-Ent�o se iniciam os preparativos para a comemora��o da sua fuga de DEMA.");
        System.out.println("\n-Enquanto isso voc� tinha algumas d�vidas para tratar com seu irm�o mais pr�ximo, Tyler.");
        System.out.println("\n...");
        System.out.printf("\n%s: Mas afinal, por que estive sozinho(a) em DEMA todo esse tempo?", nome);
        System.out.println("\nTyler: Voc� realmente n�o se lembra de nada, n�o �?");

        //estrutura de repeti��o para validar escolha do usu�rio
        do {
            System.out.print("\n1 - Como assim? \n2 - Eu me lembro! \nDigite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional usada para indicar escolhas invalidas do usuario
            switch (opcao) {
                case "1":
                case "2":
                    break;
                default:
                    System.out.println("\nOp��o inv�lida.");
            }
        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //caminho seguido caso o usu�rio escolha a primeira op��o
        if (opcao.equals("1")) {
            System.out.printf("\n%s: Como assim?", nome);
            System.out.println("\nTyler: N�s sempre estivemos te observando.");
            System.out.println("Tyler: Tentamos diversas vezes te tirar de DEMA, mas parece que essa foi a primeira vez que conseguimos.");
            System.out.println("Tyler: Infelizmente s� voc� � capaz de sair de l�, n�o podemos fazer as escolhas por voc�.");
            System.out.printf("%s: Droga! Eu nunca me lembro de nada, mas valeu, eu acho...", nome);
        } else {
            System.out.printf("\n%s: Eu me lembro sim!", nome);
        }

        System.out.printf("\n%s: Aqui � t�o diferente de DEMA. Por que tudo � amarelo?", nome);
        System.out.println("\nTyler: Essa foi a forma que encontramos de nos comunicar sem que A ORDEM nos notasse.");
        System.out.println("Tyler: Tudo sempre foi t�o cinza por aqui,");
        System.out.println("Tyler: Ent�o procuramos encontrar alguma maneira de passar despercebidos pelos Capas Vermelhas.");
        System.out.println("Tyler: Essa cor foi muito importante para que consegu�ssimos fugir de DEMA.");
        System.out.println("Tyler: De qualquer forma, voc� j� deveria saber disso...");
        System.out.println("Tyler: Da �ltima vez eu te expliquei tudo quando entreguei seu Jumpsuit.");
        System.out.println("Tyler: Mas vamos l�... parece que as comemora��es v�o come�ar!");
        System.out.printf("%s: (\"Da �ltima vez\"? Como assim?)", nome);

        System.out.println("\n\n...");

        System.out.println("\n-Todos estavam contentes e alegres comemorando com m�sicas e dan�as.");
        System.out.printf("-Em um certo momento, %s se senta ao redor de uma grande fogueira com alguns membros da IRMANDADE.", nome);
        System.out.println("\n-Entretanto, " + nome + " parecia distante, embora estivesse em boa companhia.");
        System.out.println("\n-Todos parecem euf�ricos, conversando entre si sobre como estavam felizes com a fuga de DEMA.");
        System.out.println("-Mas " + nome + " n�o se sente muito bem... m�os tr�mulas, cora��o acelerado, falta de ar, calafrios...");
        System.out.println("-� como se estivesse antecipando uma amea�a futura.");
        System.out.printf("-%s sempre sentiu essa sensa��o de que algo ia acontecer, mas nada nunca acontecia.", nome);
        System.out.println("\n-Nada que pensasse justificava seus sentimentos de enxergar perigo em tudo.");

        System.out.println("\n-Ent�o, num piscar de olhos, um par de m�os se aproxima do pesco�o de " + nome + " e o(a) puxa rapidamente da roda.");
        System.out.printf("-O vulto vermelho, que em quest�es de segundos arrastou %s da TRINCHEIRA, n�o deixava d�vidas, era A ORDEM.", nome);
        System.out.println("\n-Ao notar o acontecido, os membros da IRMANDADE pegaram suas tochas e partiram para o caminho que retornava a DEMA.");

        System.out.printf("-A raz�o pela qual %s sentia todos os sentimentos mencinados antes, era OIZUS.", nome);
        System.out.println("\n-Era ele tamb�m, o segundo integrante da ORDEM, que havia invadido a TRINCHEIRA para arruinar os planos da IRMANDADE.");
        System.out.println("-Ao chegar em um lago bem raso e cheio de pedras ao fundo, OIZUS finalmente se pronuncia.");

        System.out.println("\nOIZUS: Ent�o voc� realmente tentou se afastar de DEMA... desculpe, mas isso � imposs�vel!");
        System.out.println("OIZUS: S� por sua aud�cia, ter� de me vencer em um desafio.");
        System.out.println("OIZUS: Vamos ver o quanto voc� evoluiu.");
        System.out.println("OIZUS: Voc� enfrentou a roleta da doutrina e desmascarou Anubis.");
        System.out.println("OIZUS: Se for t�o bom(a) assim, me diga... voc� sabe o que represento?");
        System.out.println("OIZUS: Caso acerte, estar� liberto(a).");

        //TERCEIRO DESAFIO   
        //cria��o de uma nova lista para armazenar as alternativas do desafio
        List alternativas = new ArrayList();

        //retorno da vari�vel acerto ao seu estado falso para reutilizar a vari�vel no desafio a seguir
        acerto = false;

        //cria��o das alternativas de resposta
        alternativas.add("Ang�stia");
        alternativas.add("Ansiedade"); //resposta correta
        alternativas.add("Inefici�ncia");
        alternativas.add("Bulimia");
        alternativas.add("Psicopatia");

        //estrutura de repeti��o para apresentar o desafio ao usu�rio
        do {
            //classe que far� o embaralhamento das alternativas adicionadas
            Collections.shuffle(alternativas);

            System.out.println("\nOIZUS: Ent�o... O que eu, o poderoso OIZUS, represento na sua vida em DEMA?");

            //apresenta��o das alternativas embaralhadas para o usu�rio
            System.out.println("1 - " + alternativas.get(0));
            System.out.println("2 - " + alternativas.get(1));
            System.out.println("3 - " + alternativas.get(2));
            System.out.println("4 - " + alternativas.get(3));
            System.out.println("5 - " + alternativas.get(4));
            System.out.print("\nDigite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional para verificar se a op��o escolhida � a correta
            switch (opcao) {
                case "1":
                    if (alternativas.get(0).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "2":
                    if (alternativas.get(1).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "3":
                    if (alternativas.get(2).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "4":
                    if (alternativas.get(3).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "5":
                    if (alternativas.get(4).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                default:
                    System.out.println("\nOp��o inv�lida! Tente mais uma vez!");
            }

        } while (!acerto);

        //feedback do desafio
        System.out.println("\n-Voc� evoluiu bem!");
        System.out.println("-Por�m mantenha sua aten��o nos detalhes em pessoas, vai precisar em sua vida pessoal e tamb�m profissional.");

        System.out.println("\nOIZUS: Voc� acertou... mas n�o se anime tanto... ainda n�o acabou!");
        System.out.println("OIZUS: Seria muito f�cil te deixar partir agora.");
        System.out.println("OIZUS: Responda ao pr�ximo desafio, a� sim voc� poder� se livrar de mim!");

        //QUARTO DESAFIO
        //cria��o de uma nova lista para armazenar as alternativas do desafio
        alternativas = new ArrayList();

        //retorno da vari�vel acerto ao seu estado falso para reutilizar a vari�vel no desafio a seguir
        acerto = false;

        //cria��o das alternativas de resposta
        alternativas.add("\"M�os tr�mulas, cora��o acelerado, falta de ar, calafrios, enxergar perigo em tudo.\""); //resposta correta
        alternativas.add("\"Se afastar de grupos sociais para se proteger.\"");
        alternativas.add("\"Sabemos que voc� acha que a sua opini�o n�o � importante.\"");
        alternativas.add("\"Estamos de olho em voc� sempre, minha crian�a...\"");
        alternativas.add("\"Tudo � vazio... n�o h� nada que me fa�a sentir vivo.\"");

        //estrutura de repeti��o para apresentar o desafio ao usu�rio
        do {
            //classe que far� o embaralhamento das alternativas adicionadas
            Collections.shuffle(alternativas);
            System.out.println("\nOIZUS: Qual trecho prova que eu sou a personifica��o da ansiedade?");

            //apresenta��o das alternativas embaralhadas para o usu�rio
            System.out.println("1 - " + alternativas.get(0));
            System.out.println("2 - " + alternativas.get(1));
            System.out.println("3 - " + alternativas.get(2));
            System.out.println("4 - " + alternativas.get(3));
            System.out.println("5 - " + alternativas.get(4));
            System.out.print("\nDigite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional para verificar se a op��o escolhida � a correta
            switch (opcao) {
                case "1":
                    if (alternativas.get(0).equals("\"M�os tr�mulas, cora��o acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "2":
                    if (alternativas.get(1).equals("\"M�os tr�mulas, cora��o acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "3":
                    if (alternativas.get(2).equals("\"M�os tr�mulas, cora��o acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "4":
                    if (alternativas.get(3).equals("\"M�os tr�mulas, cora��o acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "5":
                    if (alternativas.get(4).equals("\"M�os tr�mulas, cora��o acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                default:
                    System.out.println("\nEscolha inv�lida! Tente mais uma vez!");
            }

        } while (!acerto);

        //feedback do desafio
        System.out.println("\n-Muito bem! Voc� j� est� sendo capaz de perceber detalhes nas pessoas.");
        System.out.println("-Voc� � capaz de ajudar muitas pessoas se sensibilizando com elas e identificando esses detalhes.");
        System.out.println("-Ansiedade n�o � saud�vel, e muitas vezes as pessoas ao seu redor tamb�m s�o acompanhadas por ela.");
        System.out.println("-N�o contribua para que isso piore. Busque ser gentil e tente ajudar!");

        System.out.println("\nOIZUS: Jamais perdoarei tamanha insol�ncia...");
        System.out.println("OIZUS: Sempre estive ao seu lado, e mesmo assim voc� insiste em se livrar de mim.");
        System.out.println("OIZUS: Bem... eu disse que lhe deixaria livre... mas s� por hora... HAHAHAHA...");
        System.out.println("OIZUS: Fique sabendo que A ORDEM n�o est� acabada...");
        System.out.println("OIZUS: Voc� n�o perde por esperar a chegada de... esque�a!");
        System.out.printf("OIZUS: Nos veremos de novo, %s...", nome);

        System.out.println("\n\n-Ap�s esse discurso, uma fuma�a vermelha e cinza se espalhou pelo ar frente a lua cheia.");
        System.out.printf("-E %s despencou imediatamente por sobre as �guas rasas do lago, "
                + "caiu desacordado enquanto OIZUS se dissipou junto com a fuma�a.", nome);
        System.out.printf("\n\n-Enquanto isso acontecia, A IRMANDADE continuava buscando por %s...", nome);

        //IN�CIO DO QUINTO ARCO DA HIST�RIA
        System.out.println("\n\n*Na manh� seguinte*");
        System.out.printf("\n-%s finalmente acorda, por�m n�o sabe bem onde est�.", nome);
        System.out.println("\n-� uma regi�o abaixo das enormes montanhas que andar� antes para chegar no acampamento.");
        System.out.printf("-%s se levanta, sacode as roupas molhadas pela �gua do rio e observa ao seu redor.", nome);
        System.out.println("\n-O rio em que havia ca�do desacordado ficava entre v�rias montanhas rochosas.");
        System.out.println("-A luz do sol, mesmo entre as nuvens, dava um pouco de vida para aquela regi�o.");
        System.out.println("-Havia um gramado bem verde e curto que se misturava com o raso rio e seus pedregulhos ao fundo.");
        System.out.println("-De fato, era uma bela vis�o para se apreciar.");

        System.out.printf("-Ap�s caminhar alguns metros, %s olha para uma das montanhas e avista algumas silhuetas.", nome);
        System.out.println("\n-A IRMANDADE finalmente chegou ap�s muita busca.");
        System.out.println("-O grupo estava em grande n�mero e para qualquer montanha que olhasse, mais deles apareciam.");
        System.out.printf("-Eles olham fixamente para %s, que parece meio desnorteado(a).", nome);
        System.out.println("\n-Pressentindo algo ruim novamente, voc� come�a a andar num passo apressado, como se quisesse fugir de algo.");

        System.out.printf("-Nesse momento todos os membros da IRMANDADE olham para o lado oposto de %s, que faz o mesmo.", nome);
        System.out.println("\n-H� um Capa Vermelha montando em um cavalo branco que segue velozmente em sua dire��o.");
        System.out.println("-Voc� pensa em se mover. Mas est� com muito medo e se sente muito mal.");
        System.out.println("-Seu corpo n�o te obedece, muito menos sua mente. Voc� est� se sentindo indefeso(a).");
        System.out.printf("\n%s: O que est� acontecendo comigo? Droga!", nome);
        System.out.println("\n\n-Sentimentos vazios dominaram seus pensamentos e sua alma.");
        System.out.println("-J� paralizado(a), voc� apenas fecha os olhos.");

        System.out.println("\n-Quem estava l� era Thanatos, o �ltimo e principal membro da ORDEM.");
        System.out.println("-A presen�a dele fez com que voc� sentisse tudo o que te impedia de se mover.");
        System.out.println("-Ele era diferente dos outros membros.");
        System.out.println("-As sensa��es ruins perto dele eram mais fortes.");
        System.out.println("-Ele usava um v�u branco assustador sobre seu rosto.");
        System.out.println("\n-Ao chegar bem perto de voc�, ele desce de seu cavalo e vai caminhando lentamente.");
        System.out.println("-J� em sua frente, Thanatos se pronuncia.");

        System.out.println("\nTHANATOS: N�o sei por que voc� est� fazendo isso comigo, minha crian�a...");
        System.out.println("THANATOS: Eu fa�o tudo pelo seu bem. Voc� pertence a DEMA! Voc� sabe disso.");
        System.out.println("THANATOS: Vamos voltar juntos, agora. N�o h� nada para nos impedir.");

        System.out.println("\n-Nesse momento Thanatos passa as m�os suavemente em seu pesco�o e deixa a marca dos seus dedos.");
        System.out.println("-� como se fosse uma marca com tinta preta.");
        System.out.println("-Voc� sequer se move, sequer consegue resistir...");
        System.out.println("-A presen�a de Thanatos faz com que voc� se torne submisso(a) a ele.");
        System.out.println("-Embora fosse uma presen�a familiar, voc� n�o se lembrava dele.");
        System.out.println("-Para voc�, � como se ele sempre estivesse ao se lado...");
        System.out.println("-Como se ele jamais tivesse te abandonado em hora alguma...");

        System.out.println("\n-Ent�o Thanatos monta em seu cavalo, que come�a a cavalgar lentamente.");
        System.out.println("-Mesmo com um andar rob�tico e cabisbaixo, voc� est� seguindo ele e nem contraria isso.");
        System.out.println("-Ap�s alguns passo, voc� avista um girassol em meio �queles pedregulhos cobertos pela �gua,");
        System.out.println("-Voc� levanta a sua cabe�a para o topo das montanhas e para de caminhar.");
        System.out.println("-Percebendo que voc� parou de se mover, Thanatos tamb�m levanta a cabe�a.");
        System.out.println("-Nesse momento, todos os membros da IRMANDADE que estavam sobre as montanhas,");
        System.out.println("-Come�am a jogar p�talas de girassol em sua dire��o. Eram centenas delas.");
        System.out.println("-E a medida em que as p�talas se aproximavam, o cavalo ficava mais agitado.");

        System.out.println("-Thanatos n�o entendia bem o que estava acontecendo naquele momento.");
        System.out.println("-Ele apenas podia visualizar as silhuetas dos membros da IRMANDADE,");
        System.out.println("-Mas n�o conseguia ver as p�talas amarelas sendo atiradas em sua dire��o.");

        System.out.println("\n-Tyler j� havia deixado claro que s� voc� pode fugir de DEMA.");
        System.out.println("-E que eles n�o podem fazer as escolhas por voc�.");
        System.out.println("-Aquelas p�talas eram o m�ximo que podiam fazer naquele momento.");
        System.out.println("-Eram como uma tentativa de te despertar daquele estado.");
        System.out.println("-De mostrar que A IRMANDADE estava ali por voc�. Pra te ajudar sempre.");
        System.out.println("\n-Ent�o seu semblante come�a a mudar... voc� est� em conflito com si mesmo.");
        System.out.println("-Thanatos, temendo seu comportamento, resolve tentar control�-lo(a) a for�a.");

        System.out.println("\nTHANATOS: Pare agora! Voc� deve permanecer comigo! N�o tente nada!");
        System.out.printf("%s: Eu sei bem quem voc� �!", nome);
        System.out.printf("\n%s: Tudo o que acontece comigo... Voc� nunca me protegeu! Voc� s� quer o meu fim!", nome);
        System.out.printf("\n%s: Eu n�o ficarei sob seu comando novamente!", nome);

        System.out.println("\n\n-Nesse momento voc� d� dois passos para tr�s, se vira e sai correndo velozmente.");
        System.out.println("-Thanatos, por�m, n�o perde tempo e parte atr�s de voc� montado em seu cavalo.");

        //estrutura de repeti��o para intera��o do usu�rio ao executar a��o
        for (int i = 0; i < 4; i++) {
            System.out.println("\n1 - Correr mais r�pido");
            System.out.print("Digite: ");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                    switch (i) {
                        case 0:
                            System.out.printf("\n%s: Preciso ser mais veloz!", nome);
                            System.out.println("\n-Thanatos est� chegando mais perto...");
                            break;
                        case 1:
                            System.out.printf("\n%s: Droga... mais r�pido!!!", nome);
                            System.out.println("\n-Thanatos est� muito pr�ximo!");
                            break;
                        case 2:
                            System.out.printf("\n%s: Acho que n�o vou conseguir...", nome);
                            System.out.println("\n-Thanatos ir� te alcan�ar!");
                            break;
                        case 3:
                            System.out.printf("\n%s: Por favor... Me deixe em paz...", nome);
                            System.out.println("\n-Thanatos finalmente lhe alcan�ou.");
                            break;
                    }
                    break;
                default:
                    System.out.println("\nOp��o inv�lida.");
            }
        }

        System.out.println("\n-Voc� correu o quanto p�de...");
        System.out.println("-Mas n�o foi o suficiente dessa vez...");
        System.out.println("-O seu cansa�o e seu esfor�o o fizeram trope�ar nas rochas...");
        System.out.println("...");
        System.out.println("-Voc� caiu, e bateu a cabe�a...");
        System.out.println("...");
        System.out.println("-O impacto fez com que voc� ficasse desacordado(a).");
        System.out.println("...");
        System.out.println("\n-Depois de toda sua jornada, por que Thanatos e A ORDEM permaneceriam te aprisionando em DEMA?!");
        System.out.println("-Por que voc� n�o conseguiu se manter fora de DEMA?\n");

        //O DESAFIO FINAL 
        System.out.print("~~~Classifique a afirma��o a seguir: ");

        //fun��o utilizada para acionar o conte�do do �ltimo desafio do jogo
        desafioFinal();

        System.out.println("-No fim das contas, tudo sempre esteve na sua frente...");
        System.out.println("\n-DEMA n�o � s� uma cidade!");
        System.out.println("-DEMA � uma analogia para todos os conflitos que ocorrem na mente humana.");
        System.out.println("-Os mecanismos de defesa, as doen�as e dist�rbios psicol�gicos... DEMA � onde tudo isso vive.");
        System.out.println("-� a sua pr�pria mente.");
        System.out.println("\n-A ORDEM � uma representa��o de todas essas doen�as e dist�rbios mentais.");
        System.out.println("-Anubis representa os mecanismos de defesa prejudiciais � sa�de mental.");
        System.out.println("-Oizus � a personifica��o da ansiedade.");
        System.out.println("-E Thanatos, o l�der da ORDEM, representa a depress�o,");
        System.out.println("-Que � uma doen�a que j� atinge 300 milh�es de pessoas em todo o mundo.");
        System.out.println("\n-Os membros da IRMANDADE s�o as pessoas pr�ximas de voc� que vivem fora de sua mente,");
        System.out.println("-Enxergam seus problemas pelo lado de fora, e sempre estar�o dispostas a lhe ajudar a superar seus desafios.");
        System.out.println("\n-Dia ap�s dia, milhares de pessoas ao seu redor necessitam de ajuda para enfrentar problemas como estes.");
        System.out.println("-E por mais que elas lutem para vencer seus desafios e se sintam seguras, elas nunca est�o livres de suas amarras.");
        System.out.println("-Assim como voc� lutou bravamente para fugir de DEMA, se manter fora de l� n�o � t�o simples quanto parece.");
        System.out.println("-As pessoas sempre est�o pass�veis de uma reca�da a qualquer instante. Ent�o preste aten��o nos detalhes.");
        System.out.println("-Voc� nunca sabe quais batalhas as pessoas ao seu redor est�o enfrentando. Ent�o seja gentil e tente ajudar.\n");
        System.out.println("...\n");
        
        //ENCERRAMENTO
        System.out.println("Desconhecido: " + nome + "...? "
                + "\nDesconhecido: Como voc� est� se sentindo...? \n"
                + nome + ": Como eu... me sinto?"
                + "\nDesconhecido: Voc� pode ser honesto(a), sabia...?\n"
                + nome + ": Bem... � como seu n�o sentisse nada... como se eu n�o existisse..."
                + "\nDesconhecido: Continue assim... tudo ficar� bem, minha crian�a...\n"
                + nome + ": Voc� sempre me diz isso...");
        System.out.println("\n  ...");
        System.out.println("\n      ...");
        System.out.println("\n          ...");
        System.out.println("\n***Voc� completou o jogo***");
        System.out.println("\n***Retornando ao meu principal***");
    }

    public static void main(String[] args) {

        int opcaoEscolhida;

        System.out.println("Seja bem-vindo(a) ao M!NDSCAPE!");

        //estrutura de repeti��o utilizada para apresentar o menu novamente ao usu�rio caso acione as fun��es do tipo void no menu
        do {
            //atribui��o do retorno da fun��o "menu" � vari�vel que indica a op��o escolhida pelo usu�rio
            opcaoEscolhida = menu();

            //controlador recebe op��o escolhida do menu como par�metro
            controlador(opcaoEscolhida);
        } while (opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3 || opcaoEscolhida == 4);
    }
}