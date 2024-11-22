package com.github.willyancaetano.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.Mockito;

import java.util.List;

@ExtendWith(MockitoExtension.class) //Incluir a extensão para iniciar o Mockito
public class ListaTeste {

    @Mock //O que será "mockado"/escondido
    private List<String> letras;

    @Test //Teste
    void adicionarItemNaLista() {

        Mockito.when(letras.get(0)).thenReturn("B");

        Assertions.assertEquals("B", letras.get(0));
    }
}