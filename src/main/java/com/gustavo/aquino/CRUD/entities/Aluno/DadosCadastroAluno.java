package com.gustavo.aquino.CRUD.entities.Aluno;

import jakarta.validation.constraints.*;

public record DadosCadastroAluno(
        @NotBlank(message = "O Nome não pode estar em branco")
        String nome,
        @NotBlank(message = "O CEP não pode estar em branco")
        @Pattern(regexp = "\\d{5}-\\d{3}")
        String cep,
        @NotNull(message = "O Número não pode ser nulo")
        @Positive(message = "O número deve ser positivo")
        Integer numero,
        @NotBlank(message = "O Complemento não pode estar em branco")
        String complemento,
        @NotNull(message = "A NotaAdo1 não pode ser nula")
        @DecimalMin(value = "0.0", inclusive = true, message = "O valor de notaAdo1 deve ser maior ou igual a 0")
        @DecimalMax(value = "10.0", inclusive = true, message = "O valor de notaAdo1 deve ser menor ou igual a 10")
        float notaAdo1,
        @NotNull(message = "A NotaPi não pode ser nula")
        @DecimalMin(value = "0.0", inclusive = true, message = "O valor de notaPi deve ser maior ou igual a 0")
        @DecimalMax(value = "10.0", inclusive = true, message = "O valor de notaPi deve ser menor ou igual a 10")
        float notaPi
) {
}







