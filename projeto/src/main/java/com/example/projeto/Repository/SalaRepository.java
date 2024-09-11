package com.example.projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto.Model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala,Long>{

}
