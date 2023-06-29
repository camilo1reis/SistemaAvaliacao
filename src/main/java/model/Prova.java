package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prova")
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "prova", cascade = CascadeType.ALL)
    private List<Questao> questoes;

    public Prova() {
    }

    public Prova(String nome, List<Questao> questoes) {
        this.nome = nome;
        this.questoes = questoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
