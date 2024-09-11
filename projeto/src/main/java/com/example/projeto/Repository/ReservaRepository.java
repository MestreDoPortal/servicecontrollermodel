package com.example.projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto.Model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva,Long>{

}
