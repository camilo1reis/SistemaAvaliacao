package service;

import dao.ResultadoDAO;
import model.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadoService {
    private ResultadoDAO resultadoDAO;

    @Autowired
    public ResultadoService(ResultadoDAO resultadoDAO) {
        this.resultadoDAO = resultadoDAO;
    }

    public Resultado obterResultadoPorId(long id) {
        return resultadoDAO.obterPorId(id);
    }

    public List<Resultado> obterTodosResultados() {
        return resultadoDAO.obterTodos();
    }

    public void salvarResultado(Resultado resultado) {
        resultadoDAO.salvar(resultado);
    }

    public void atualizarResultado(Resultado resultado) {
        resultadoDAO.atualizar(resultado);
    }

    public void excluirResultado(Resultado resultado) {
        resultadoDAO.excluir(resultado);
    }

    // Outros métodos relevantes para o serviço...

}

