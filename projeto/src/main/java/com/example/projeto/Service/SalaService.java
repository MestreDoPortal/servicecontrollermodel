package com.example.projeto.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.Model.Sala;
import com.example.projeto.Repository.SalaRepository;


@Service
public class SalaService {

        @Autowired
    private SalaRepository salaRepository;

    public List<Sala> getAllSalas(){
        return salaRepository.findAll();
    }

    public Sala getSalaById(Long id){
        return salaRepository.findById(id).orElse(null);
    }

    public Sala createSala(Sala sala){
        return salaRepository.save(sala);
    }

    public Sala updateSala (Long id,Sala sala){
        if(salaRepository.existsById(id)){
            sala.setId(id);
            return salaRepository.save(sala);
        }
        return null;
    }

    public void deleteSala (Long id){
        salaRepository.deleteById(id);
    }
}


