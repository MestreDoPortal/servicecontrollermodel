package com.example.projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto.Model.Recurso;

@Repository
public interface RecursoRepository extends JpaRepository<Recurso,Long>{

}
