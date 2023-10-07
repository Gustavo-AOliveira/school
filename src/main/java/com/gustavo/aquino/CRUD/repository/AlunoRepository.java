package com.gustavo.aquino.CRUD.repository;

import com.gustavo.aquino.CRUD.entities.Aluno.Aluno;
import com.gustavo.aquino.CRUD.entities.Aluno.DadosListagemAluno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    Page<Aluno> findAllByAtivoTrue(Pageable pageable);

    List<Aluno> findAllByOrderByNomeAsc();
}
