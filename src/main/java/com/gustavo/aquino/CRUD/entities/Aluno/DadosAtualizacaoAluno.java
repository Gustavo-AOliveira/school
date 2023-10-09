package com.gustavo.aquino.CRUD.entities.Aluno;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoAluno(
        @NotNull
        Integer ra,
        String nome,
        @Pattern(regexp = "\\d{5}-\\d{3}")
        String cep,
        Integer numero,
        String complemento,
        float notaAdo1,
        float notaPi
) {

}










