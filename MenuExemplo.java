import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuExemplo {

    static Scanner read = new Scanner(System.in);

    public static int menu() {
        int opcao;

        do {
            System.out.println();
            System.out.println("---------------- MENU ------------------");
            System.out.println("----------------------------------------");
            System.out.println("|                                      |");
            System.out.println("|           1- INSTRUÇÕES              |");
            System.out.println("|           2-INTRODUÇÃO               |");
            System.out.println("|           3- JOGAR                   |");
            System.out.println("|           4- CRÉDITOS                |");
            System.out.println("|           5- SAIR                    |");
            System.out.println("|                                      |");
            System.out.println("----------------------------------------");

            System.out.println();
            System.out.print("Digite a opção desejada:");
            opcao = read.nextInt();

            // System.out.print("\033[H\033[2J");// LIMPA O CONSOLE APÓS ESCOLHA

            if (opcao < 1 || opcao > 5) {
                System.out.print("Opção Inválida");
            }
        } while (opcao < 1 || opcao > 5);

        return opcao;
    }

    static void selecionador(int opcao) {
        switch (opcao) {
            case 1:
                instrucoes();
                break;

            case 2:
                introducao();
                break;

            case 3:
                jogar();
                break;

            case 4:
                creditos();
                break;

            case 5:
                System.out.print("SAIR");
                System.exit(0);
                break;
        }
    }

    public static void instrucoes() {
        System.out.println();
        System.out.println("O Jogo é composoto de 10 perguntas de multiplas. Leia a Introdução para começar a jogar");
        System.out.println();
    }

    public static void introducao() {
        System.out.println();
        System.out.println(
                "Thor estava prestes a receber o comando de Asgard das mãos de seu pai Odin quando forças inimigas quebraram um acordo de paz. Disposto a se vingar do ocorrido, o jovem guerreiro desobedece as ordens do rei e quase dá início a uma nova guerra entre os reinos. Enfurecido com a atitude do filho e herdeiro, Odin retira seus poderes e o expulsa para a Terra. Lá, Thor acaba conhecendo a cientista Jane Foster e precisa recuperar seu martelo, enquanto seu irmão Loki elabora um plano para assumir o poder. Mas os guerreiros do Deus do Trovão fazem a mesma viagem para buscar o amigo e impedir que isso aconteça. Só que eles não vieram sozinhos e o inimigo está presente para uma batalha que está apenas começando.");
        System.out.println();
    }

    public static void jogar() {
        pergunta1();
        pergunta2();
        pergunta3();
    }

    public static String getPergunta(int indice) {
        String pergunta[] = new String[3];

        pergunta[0] = "1 - Qual o nome do Rei de Asgard?";
        pergunta[1] = "2 - Qual o nome da Rainha de Asgard?";
        pergunta[2] = "3 - Qual o nome do martelo de Thor?";

        String retorno = pergunta[indice];
        return retorno;
    }

    public static void pergunta1() {
        String resposta;

        List<String> questoes = new ArrayList<String>();

        questoes.add("Sif");
        questoes.add("Thor");
        questoes.add("Odin");
        questoes.add("Loki");

        System.out.println();
        System.out.println(getPergunta(0));
        System.out.println();

        System.out.println("a) " + questoes.get(0));
        System.out.println("b) " + questoes.get(1));
        System.out.println("c) " + questoes.get(2));
        System.out.println("d) " + questoes.get(3));
        System.out.println();

        resposta = read.next();

        switch (resposta) {
            case "a":
            case "A":

                System.out.println("Resposta Incorreta");
                break;

            case "b":
            case "B":

                System.out.println("Resposta Incorreta");
                break;

            case "c":
            case "C":

                System.out.println("Resposta Correta");
                break;

            case "d":
            case "D":

                System.out.println("Resposta Incorreta");
                break;
        }
    }

    public static void pergunta2(){
        String resposta;

        List<String> questoes = new ArrayList<String>();

        questoes.add("Frigga");
        questoes.add("Sif");
        questoes.add("Natasha");
        questoes.add("Hela");

        System.out.println();
        System.out.println(getPergunta(0));
        System.out.println();

        System.out.println("a) " + questoes.get(0));
        System.out.println("b) " + questoes.get(1));
        System.out.println("c) " + questoes.get(2));
        System.out.println("d) " + questoes.get(3));
        System.out.println();

        resposta = read.next();

        switch (resposta) {
            case "a":
            case "A":

                System.out.println("Resposta Correta");
                break;

            case "b":
            case "B":

                System.out.println("Resposta Incorreta");
                break;

            case "c":
            case "C":

                System.out.println("Resposta Incorreta");
                break;

            case "d":
            case "D":

                System.out.println("Resposta Incorreta");
                break;
        }
    }

    public static void pergunta3(){
        String resposta;

        List<String> questoes = new ArrayList<String>();

        questoes.add("Mioni");
        questoes.add("Miumkiu");
        questoes.add("Miunir");
        questoes.add("Mjolnir");

        System.out.println();
        System.out.println(getPergunta(0));
        System.out.println();

        System.out.println("a) " + questoes.get(0));
        System.out.println("b) " + questoes.get(1));
        System.out.println("c) " + questoes.get(2));
        System.out.println("d) " + questoes.get(3));
        System.out.println();

        resposta = read.next();

        switch (resposta) {
            case "a":
            case "A":

                System.out.println("Resposta Incorreta");
                break;

            case "b":
            case "B":

                System.out.println("Resposta Incorreta");
                break;

            case "c":
            case "C":

                System.out.println("Resposta Incorreta");
                break;

            case "d":
            case "D":

                System.out.println("Resposta Correta");
                break;
        }
    }

    public static void creditos(){
        System.out.println("\n****************************CRÉDITOS*****************************");
        System.out.println("\nEste Quiz foi desenvolvido pelo aluno: Gabriel Horisawa");
        System.out.println("\n*****************************************************************");
    }
    

    public static void sair() {
        System.out.println("\n*****************");
        System.out.println("SESSÃO FINALIZADA");
        System.out.println("*****************");
        System.exit(0);
    }

    public static void main(String[] args) {
        int select;

        do {
            select = menu();
            selecionador(select);
        } while (select == 1 || select == 2 || select == 3 || select == 4 || select == 5);

    }
}



 