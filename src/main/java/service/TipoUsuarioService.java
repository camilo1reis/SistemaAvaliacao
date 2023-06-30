package service;

import dao.UsuarioDao;
import model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioService {

    private UsuarioDao usuarioDAO;

//    public UsuarioService() {
//        this.usuarioDAO = new UsuarioDao();
//    }

//    public List<Usuario> listarUsuarios() {
//        return usuarioDAO.listarUsuarios();
//    }
//
//    public Usuario buscarUsuarioPorId(int idUsuario) {
//        return usuarioDAO.buscarUsuarioPorId(idUsuario);
//    }
//
//    public void salvarUsuario(Usuario usuario) {
//        usuarioDAO.salvarUsuario(usuario);
//    }
//
//    public void atualizarUsuario(Usuario usuario) {
//        usuarioDAO.atualizarUsuario(usuario);
//    }
//
//    public void excluirUsuario(int idUsuario) {
//        usuarioDAO.excluirUsuario(idUsuario);
//    }
}
