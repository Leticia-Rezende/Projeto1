import Classes.Cabecalho;
import Classes.Questao;

import java.util.Scanner;

    public class Projeto1 {

        public static void main(String args[]) {
            System.out.println("Hello word");

            Cabecalho head = new Cabecalho();
            head.faculdade = "Centro Universitário Alfredo Nasser";
            head.aluno = "Acadêmica: Leticia Rezende";
            head.professor = "Professorº: Brenno Pimenta";
            head.disciplina = "Disciplina: Algoritmo e Programação II";


            head.escrevaCabecalho();
            System.out.println("");
            System.out.println("Seja bem vindo as questões de Conhecimentos Gerais: ");
            System.out.println("");
            System.out.println("REGRAS DO QUIZ");
            System.out.println("");
            System.out.println(" 1 - Cada questão tem um valor de 10 pontos, acertando todas, você terá um valor de 150 pontos.");
            System.out.println(" 2 - Leia todas com bastante atenção.");
            System.out.println("");
            System.out.println("Preparado(a)? LETS GO!!");
            System.out.println("");

            Questao q1 = new Questao();
            q1.pergunta = "1 - Onde se localiza Machu Picchu?";
            q1.opcaoA = "A - Colômbia";
            q1.opcaoB = "B - Peru";
            q1.opcaoC = "C - China";
            q1.opcaoD = "D - Bolívia";
            q1.opcaoE = "E - Indía";
            q1.correta = "B";

            Questao q2 = new Questao();
            q2.pergunta = "2 - Qual a montanha mais alta do mundo?";
            q2.opcaoA = "A - Mauna Kea";
            q2.opcaoB = "B - Dhaulagiri";
            q2.opcaoC = "C - Monte Chimborazo";
            q2.opcaoD = "D - Monte Everest";
            q2.opcaoE = "E - Pico da Neblina";
            q2.correta = "D";

            Questao q3 = new Questao();
            q3.pergunta = "3 - Quais são as fases da Lua?";
            q3.opcaoA = "A - Nova, cheia e superlua";
            q3.opcaoB = "B - Penumbral, lunar parcial, lunar total e cheia";
            q3.opcaoC = "C - Nova, cheia, minguante e lua de sangue";
            q3.opcaoD = "D - Nova, crescente, cheia e minguante";
            q3.opcaoE = "E - Nova, crescente, cheia, minguante e lua de sangue";
            q3.correta = "D";

            Questao q4 = new Questao();
            q4.pergunta = "4 - Quantos ossos temos no nosso corpo?";
            q4.opcaoA = "A - 126";
            q4.opcaoB = "B - 206";
            q4.opcaoC = "C - 18";
            q4.opcaoD = "D - 300";
            q4.opcaoE = "E - 200";
            q4.correta = "B";

            Questao q5 = new Questao();
            q5.pergunta = "5 - Qual o maior planeta do sistema solar ?";
            q5.opcaoA = "A - Marte";
            q5.opcaoB = "B - Lua";
            q5.opcaoC = "C - Saturno";
            q5.opcaoD = "D - Terra";
            q5.opcaoE = "E - Júpiter";
            q5.correta = "E";

            Questao q6 = new Questao();
            q6.pergunta = "6 - Um anel tem 3 pedras preciosas. Quantas pedras preciosas tem 11 anéis?";
            q6.opcaoA = "A - 33";
            q6.opcaoB = "B - 110";
            q6.opcaoC = "C - 333";
            q6.opcaoD = "D - 30";
            q6.opcaoE = "E - 14";
            q6.correta = "A";

            Questao q7 = new Questao();
            q7.pergunta = "7 - Quantos continentes existem?";
            q7.opcaoA = "A - 2";
            q7.opcaoB = "B - 8";
            q7.opcaoC = "C - 4";
            q7.opcaoD = "D - 6";
            q7.opcaoE = "E - 3";
            q7.correta = "D";

            Questao q8 = new Questao();
            q8.pergunta = "8 - Qual a maior floresta tropical do mundo?";
            q8.opcaoA = "A - Mata Atlântica";
            q8.opcaoB = "B - Pampas";
            q8.opcaoC = "C - Pantanal";
            q8.opcaoD = "D - Floresta Amazônica";
            q8.opcaoE = "E - Caatinga";
            q8.correta = "D";

            Questao q9 = new Questao();
            q9.pergunta = "9 - Qual o momumento famoso pela sua inclinação?";
            q9.opcaoA = "A - Torre Eiffel";
            q9.opcaoB = "B - Esfinge";
            q9.opcaoC = "C - Estátua da Liberdade";
            q9.opcaoD = "D - Cristo Redentor";
            q9.opcaoE = "E - Torre de Pisa";
            q9.correta = "E";

            Questao q10 = new Questao();
            q10.pergunta = "10 - Quem pintou a Mona Lisa?";
            q10.opcaoA = "A - Leornado da Vinci";
            q10.opcaoB = "B - Salvador Dalí";
            q10.opcaoC = "C - Van Gogh";
            q10.opcaoD = "D - Tarsila do Amaral";
            q10.opcaoE = "E - Pablo Picasso";
            q10.correta = "A";

            Questao q11 = new Questao();
            q11.pergunta = "11 - Qual a personagem mais famosa de Maurício de Sousa?";
            q11.opcaoA = "A - Mafalda";
            q11.opcaoB = "B - Mônica";
            q11.opcaoC = "C - Smurfette";
            q11.opcaoD = "D - Cinderela";
            q11.opcaoE = "E - Menino Maluquinho";
            q11.correta = "B";

            Questao q12 = new Questao();
            q12.pergunta = "12 - Qual animal põe o maior ovo?";
            q12.opcaoA = "A - Beija-Flor";
            q12.opcaoB = "B - Avestruz";
            q12.opcaoC = "C - Tartaruga-gigante";
            q12.opcaoD = "D - Galinha";
            q12.opcaoE = "E - Pavão";
            q12.correta = "B";

            Questao q13 = new Questao();
            q13.pergunta = "13 - Em que país foi construído o Muro de Berlim?";
            q13.opcaoA = "A - Estados Unidos";
            q13.opcaoB = "B - China";
            q13.opcaoC = "C - Coreia do Sul";
            q13.opcaoD = "D - Alemenha";
            q13.opcaoE = "E - Brasil";
            q13.correta = "D";

            Questao q14 = new Questao();
            q14.pergunta = "14 - Depois do futebol, qual esporte mais popular no Brasil?";
            q14.opcaoA = "A - Esqui";
            q14.opcaoB = "B - Vôlei";
            q14.opcaoC = "C - Hóquei no gelo";
            q14.opcaoD = "D - Golfe";
            q14.opcaoE = "E - Esgrima";
            q14.correta = "B";

            Questao q15 = new Questao();
            q15.pergunta = "15 - O que comemora no feriado do dia 21 de abril no Brasil?";
            q15.opcaoA = "A - Natal";
            q15.opcaoB = "B - Tiradentes";
            q15.opcaoC = "C - Independência do Brasil";
            q15.opcaoD = "D - Finados";
            q15.opcaoE = "E - Nossa Senhora Aparecida";
            q15.correta = "B";


            //========================================================================

            int pontos = 0;

            System.out.println("--------------------------------------------------");
            q1.escrevaQuestao();
            String reposta = leiaResposta();

            if (respostaValida(reposta)) {
                if (q1.isCorreta(reposta)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("--------------------------------------------------");
            q2.escrevaQuestao();
            String repostaq2 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q2.isCorreta(repostaq2)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("-------------------------------------------------");
            q3.escrevaQuestao();
            String repostaq3 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q3.isCorreta(repostaq3)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("------------------------------------------------");
            q4.escrevaQuestao();
            String repostaq4 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q4.isCorreta(repostaq4)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("------------------------------------------------");
            q5.escrevaQuestao();
            String repostaq5 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q5.isCorreta(repostaq5)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("-------------------------------------------------");
            q6.escrevaQuestao();
            String repostaq6 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q6.isCorreta(repostaq6)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("-----------------------------------------------");
            q7.escrevaQuestao();
            String repostaq7 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q7.isCorreta(repostaq7)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("----------------------------------------------");
            q8.escrevaQuestao();
            String repostaq8 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q8.isCorreta(repostaq8)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("---------------------------------------------------");
            q9.escrevaQuestao();
            String repostaq9 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q9.isCorreta(repostaq9)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("------------------------------------------------------");
            q10.escrevaQuestao();
            String repostaq10 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q10.isCorreta(repostaq10)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("---------------------------------------------------");
            q11.escrevaQuestao();
            String repostaq11 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q11.isCorreta(repostaq11)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("-----------------------------------------------------");
            q12.escrevaQuestao();
            String repostaq12 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q12.isCorreta(repostaq12)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("----------------------------------------------------");
            q13.escrevaQuestao();
            String repostaq13 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q13.isCorreta(repostaq13)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("----------------------------------------------------");
            q14.escrevaQuestao();
            String repostaq14 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q14.isCorreta(repostaq14)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("-------------------------------------------------------");
            q15.escrevaQuestao();
            String repostaq15 = leiaResposta();

            if (respostaValida(reposta)) {
                if (q2.isCorreta(repostaq2)){
                    pontos = pontos + 10;
                }
            }

            System.out.println("Você fez um total de: "+ pontos +" / 150 Pontos");
        }


        public static String leiaResposta () {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.println("Digite a resposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;

        }

        public static boolean respostaValida (String resp){
            if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
                return true;
            }
            System.out.println("Resposta inválida ... ");
            return false;

        }

    }

