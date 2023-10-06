package com.gustavo.aquino.CRUD.entities.Aluno;

public record DadosDetalhamentoAluno(Integer ra, String nome, String cep, Integer numero, String complemento, float notaAdo1, float notaPi) {

    public DadosDetalhamentoAluno(Aluno aluno){
        this(aluno.getRa(), aluno.getNome(), aluno.getCep(), aluno.getNumero(), aluno.getComplemento(), aluno.getNotaAdo1(), aluno.getNotaPi());
    }

}
