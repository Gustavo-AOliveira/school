package com.gustavo.aquino.CRUD.entities.Aluno;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "Alunos")
@Entity(name = "Aluno")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "ra")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ra;

    private String nome;
    private String cep;

    private Integer numero;

    private String complemento;

    private float notaAdo1;

    private float notaPi;

    private boolean ativo;

    public Aluno(DadosCadastroAluno dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.notaAdo1 = dados.notaAdo1();
        this.notaPi = dados.notaPi();
    }

    public void delete(Integer ra){
        this.ativo = false;
    }
}





















