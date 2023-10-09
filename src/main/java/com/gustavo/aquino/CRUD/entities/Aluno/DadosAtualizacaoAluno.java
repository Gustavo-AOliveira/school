package com.gustavo.aquino.CRUD.entities.Aluno;

import jakarta.validation.constraints.*;

public record DadosAtualizacaoAluno(
        @NotNull(message = "O RA não pode ser nulo")
        Integer ra,
        String nome,
        @Pattern(regexp = "\\d{5}-\\d{3}", message = "O formato do CEP deve ser #####-###")
        String cep,
        @Positive(message = "O número deve ser positivo")
        Integer numero,
        String complemento,
        @DecimalMin(value = "0.0", inclusive = true, message = "O valor de notaAdo1 deve ser maior ou igual a 0")
        @DecimalMax(value = "10.0", inclusive = true, message = "O valor de notaAdo1 deve ser menor ou igual a 10")
        float notaAdo1,
        @DecimalMin(value = "0.0", inclusive = true, message = "O valor de notaPi deve ser maior ou igual a 0")
        @DecimalMax(value = "10.0", inclusive = true, message = "O valor de notaPi deve ser menor ou igual a 10")
        float notaPi
) {

}










