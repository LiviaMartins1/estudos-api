package com.dest1.estudos.controllers;


import com.dest1.estudos.entity.Aluno;
import com.dest1.estudos.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/estudos")
@RestController
public class AlunoController {
    @Autowired

    AlunoRepository repository;

    @GetMapping
    public List<Aluno> mostrar(){
        return repository.findAll();
    }

    @PostMapping
    public void criar(@RequestBody Aluno a){
        repository.save(a);
    }










}
