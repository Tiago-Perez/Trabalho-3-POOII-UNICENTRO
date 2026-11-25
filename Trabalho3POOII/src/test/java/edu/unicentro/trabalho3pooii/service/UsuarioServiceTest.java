package edu.unicentro.trabalho3pooii.service;

import edu.unicentro.trabalho3pooii.model.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UsuarioServiceTest {
    private UsuarioService service;

    @BeforeEach
    void preparar() {
        service = new UsuarioService();
    }

    @Test
    void naoDeveCadastrarComSenhasDiferentes() {
        Usuario usuario = new Usuario("Tiago", "123");
        assertThrows(IllegalArgumentException.class,
                () -> service.cadastrar(usuario, "456"), "Não deveria cadastrar com senhas diferentes");
    }
}