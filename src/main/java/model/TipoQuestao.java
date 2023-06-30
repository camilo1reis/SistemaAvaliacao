package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tipoQuestao")
public class TipoQuestao {

    @Id
    private int id;
    private String descricao;

    @OneToMany(mappedBy = "tipoQuestao")
    private List<Questao> questoes;

    public TipoQuestao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.questoes = new ArrayList<>();
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

    public int obterQuantidadeQuestoes() {
        return questoes.size();
    }
    // Outros métodos conforme necessário
}

