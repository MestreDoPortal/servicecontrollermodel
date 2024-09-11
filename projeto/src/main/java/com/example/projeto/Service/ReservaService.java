package com.example.projeto.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.Model.Reserva;
import com.example.projeto.Repository.ReservaRepository;


@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getAllReserva(){
        return reservaRepository.findAll();
    }

    public Reserva getReservaById(Long id){
        return reservaRepository.findById(id).orElse(null);
    }

    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

        public Reserva updateReserva (Long id,Reserva reserva){
        if(reservaRepository.existsById(id)){
            reserva.setId(id);
            return reservaRepository.save(reserva);
        }
        return null;
    }

    public void deleteReserva (Long id){
        reservaRepository.deleteById(id);
    }
}