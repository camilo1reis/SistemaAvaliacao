package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questao")
public class Questao {

    @Id
    private int id;
    private String texto;
    private int pontuacao;
    private String resposta;

    //adicionar mais atr


    public Questao() {
    }

    public Questao(int id, String texto, int pontuacao) {
        this.id = id;
        this.texto = texto;
        this.pontuacao = pontuacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
