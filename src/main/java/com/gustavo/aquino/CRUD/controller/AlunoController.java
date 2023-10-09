package com.gustavo.aquino.CRUD.controller;

import com.gustavo.aquino.CRUD.entities.Aluno.Aluno;
import com.gustavo.aquino.CRUD.entities.Aluno.DadosCadastroAluno;
import com.gustavo.aquino.CRUD.entities.Aluno.DadosDetalhamentoAluno;
import com.gustavo.aquino.CRUD.entities.Aluno.DadosListagemAluno;
import com.gustavo.aquino.CRUD.repository.AlunoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity cadastraAluno(@RequestBody @Valid DadosCadastroAluno dados, UriComponentsBuilder uriComponentsBuilder) {
        var aluno = new Aluno(dados);
            repository.save(aluno);
        var uri = UriComponentsBuilder.fromPath("/alunos/{id}").buildAndExpand(aluno.getRa()).toUri();
            return ResponseEntity.created(uri).body(new DadosDetalhamentoAluno((aluno)));
    }
    @GetMapping
    public ResponseEntity<Page<DadosListagemAluno>> listAtivos(@PageableDefault(sort = {"nome"}, direction = Sort.Direction.ASC) Pageable pageable) {
        var page = repository.findAllByAtivoTrue(pageable).map(DadosListagemAluno::new);
            return ResponseEntity.ok(page);
    }

    @DeleteMapping("/delete/{ra}")
    @Transactional
    public ResponseEntity<Void> deletarAluno(@PathVariable Integer ra){
        var aluno = repository.getReferenceById(ra);
            aluno.delete(ra);
                return ResponseEntity.noContent().build();
    }
}
















