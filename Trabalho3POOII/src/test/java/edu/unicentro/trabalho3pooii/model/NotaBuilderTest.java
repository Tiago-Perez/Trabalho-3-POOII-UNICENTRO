package edu.unicentro.trabalho3pooii.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaBuilderTest {
    @Test
    void deveCriarNotaSemEstarFixada() {
        Nota nota = new NotaBuilder().nome("Compras").build();
        assertFalse(nota.isFixado(), "Uma nota nova não deveria estar fixada");
    }
}