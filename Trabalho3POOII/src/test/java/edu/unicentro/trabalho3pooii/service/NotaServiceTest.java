package edu.unicentro.trabalho3pooii.service;

import edu.unicentro.trabalho3pooii.model.Nota;
import edu.unicentro.trabalho3pooii.model.NotaBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaServiceTest {
    private NotaService service;

    @BeforeEach
    void preparar() {
        service = new NotaService();
    }

    @Test
    void naoDeveCriarNotaSemNome() {
        Nota nota = new NotaBuilder().userID(1).nome("").build();
        assertThrows(IllegalArgumentException.class,
                () -> service.cadastrar(nota), "Não deveria criar uma nota sem nome");
    }
}