package edu.unicentro.trabalho3pooii.dao;

import edu.unicentro.trabalho3pooii.model.Usuario;
import java.sql.SQLException;

public interface IUsuario {

    void inserir(Usuario usuario) throws SQLException;

    // Devolve o usuário com esse nome, ou null se não existir.
    Usuario buscarPorNome(String nome) throws SQLException;
}
