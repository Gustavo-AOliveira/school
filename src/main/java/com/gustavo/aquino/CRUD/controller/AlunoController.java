package com.gustavo.aquino.CRUD.controller;

import com.gustavo.aquino.CRUD.entities.Aluno.Aluno;
import com.gustavo.aquino.CRUD.entities.Aluno.DadosCadastroAluno;
import com.gustavo.aquino.CRUD.entities.Aluno.DadosDetalhamentoAluno;
import com.gustavo.aquino.CRUD.repository.AlunoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("alunos")
public class AlunoController {
    private AlunoRepository repository;
    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    @Transactional
    public ResponseEntity cadastraAluno(@RequestBody @Valid DadosCadastroAluno dados, UriComponentsBuilder uriComponentsBuilder){
        var aluno = new Aluno(dados);
            repository.save(aluno);
        var uri = UriComponentsBuilder.fromPath("/alunos/{id}").buildAndExpand(aluno.getRa()).toUri();
            return ResponseEntity.created(uri).body(new DadosDetalhamentoAluno((aluno)));
    }
}
















