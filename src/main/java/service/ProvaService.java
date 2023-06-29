package service;

import dao.ProvaDAO;
import model.Prova;
import model.Questao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvaService {
    private ProvaDAO provaDAO;

    public ProvaService() {
        provaDAO = new ProvaDAO();
    }
    public Prova criarProva(String nome, List<Questao> questoes) {
        Prova prova = new Prova(nome, questoes);
        provaDAO.criar(prova);
        return prova;
    }

    public Prova buscarProvaPorId(Long id) {
        return provaDAO.buscarPorId(id);
    }

    public void atualizarProva(Prova prova) {
        // Lógica de validação ou regras de negócio antes de atualizar a prova

        provaDAO.atualizar(prova);
    }

    public void excluirProva(Prova prova) {
        // Lógica de validação ou regras de negócio antes de excluir a prova

        provaDAO.excluir(prova);
    }

    public List<Prova> listarTodasProvas() {
        return provaDAO.listarTodos();
    }

    // Outros métodos conforme necessário

    public void fecharConexao() {
        provaDAO.fecharConexao();
    }
}

