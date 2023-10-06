package com.gustavo.aquino.CRUD.entities.Aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroAluno(
        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "\\d{5}-\\d{3}")
        String cep,
        @NotNull
        Integer numero,
        @NotBlank
        String complemento,
        @NotNull
        float notaAdo1,
        @NotNull
        float notaPi
) {
}







