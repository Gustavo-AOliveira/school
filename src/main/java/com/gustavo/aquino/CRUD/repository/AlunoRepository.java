package com.gustavo.aquino.CRUD.repository;

import com.gustavo.aquino.CRUD.entities.Aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
