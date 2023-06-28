package model;

public class Questao {
    private String texto;
    private int pontuacao;
    private String resposta;

    //adicionar mais atributos

    public Questao(String texto, int pontuacao) {
        this.texto = texto;
        this.pontuacao = pontuacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean foiRespondido(){
        return resposta !=null;
    }

    public String getResposta(){
        return resposta;
    }

    public void setResposta(String resposta){
        this.resposta = resposta;
    }

    //colocar metodos
}
