package model;

import java.util.ArrayList;
import java.util.List;

public class TipoQuestao {
    private int id;
    private String descricao;
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

    // Métodos adicionais

//    public void adicionarQuestao(Questao questao) {
//        if (questao != null && !questoes.contains(questao)) {
//            questoes.add(questao);
//            questao.setTipoQuestao(this);
//        }
//    }
//
//    public void removerQuestao(Questao questao) {
//        if (questao != null && questoes.contains(questao)) {
//            questoes.remove(questao);
//            questao.setTipoQuestao(null);
//        }
//    }

    public int obterQuantidadeQuestoes() {
        return questoes.size();
    }

    // Outros métodos conforme necessário
}

