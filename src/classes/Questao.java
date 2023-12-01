package classes;

public class Questao {
    public String pergunta = "";
    public String opcaoA = "";
    public String opcaoB = "";
    public String opcaoC = "";
    public String opcaoD = "";
    public String opcaoE = "";
    public String correta = "";

    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            return true;
        } else {
            System.out.println("Resposta Errada! Que pena!");
            System.out.println("A opção correta é a letra: " + this.correta);

            return false;
        }

    }

    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
}
