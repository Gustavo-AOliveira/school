package com.gustavo.aquino.CRUD.entities.Aluno;

public record DadosListagemAluno(Integer ra, String nome, String cep, Integer numero, String complemento, float notaAdo1, float NotaPi, boolean ativo) {

    public DadosListagemAluno(Aluno aluno) {
        this(aluno.getRa(), aluno.getNome(), aluno.getCep(), aluno.getNumero(), aluno.getComplemento(), aluno.getNotaAdo1(), aluno.getNotaPi(), aluno.isAtivo());
    }
}
