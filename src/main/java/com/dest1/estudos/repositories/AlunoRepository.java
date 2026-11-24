package com.dest1.estudos.repositories;

import com.dest1.estudos.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
