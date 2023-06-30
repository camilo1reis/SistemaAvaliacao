package model;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "prova")
@Table(name = "prova")
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProva")
    private int idProva;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "prova", cascade = CascadeType.ALL)
    private List<Questao> questoes;

    public Prova() {
    }


    public Prova(int idProva, String nome, List<Questao> questoes) {
        this.idProva = idProva;
        this.nome = nome;
        this.questoes = questoes;
    }

    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }



    public int calcularPontuacaoTotal(){
        int pontuacaoTotal = 0;
        for (Questao questao:questoes) {
            pontuacaoTotal += questao.getPontuacao();
        }
        return pontuacaoTotal;
    }

    public int getNumeroQuestao(){
        return questoes.size();
    }

}
