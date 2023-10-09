package com.gustavo.aquino.CRUD.Exception;

import com.gustavo.aquino.CRUD.entities.Aluno.DadosAtualizacaoAluno;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity error404(){
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity error400(MethodArgumentNotValidException exception){
        var errors = exception.getFieldErrors();
            return ResponseEntity.badRequest().body(errors.stream().map(DadosErroValidacao::new).toList());
    }


}














