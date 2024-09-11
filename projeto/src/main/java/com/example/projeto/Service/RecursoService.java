package com.example.projeto.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto.Repository.RecursoRepository;
import com.example.projeto.Model.Recurso;


@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> getAllRecursos(){
        return recursoRepository.findAll();
    }

    public Recurso getRecursoById(Long id){
        return recursoRepository.findById(id).orElse(null);
    }

    public Recurso createRecurso(Recurso recurso){
        return recursoRepository.save(recurso);
    }

    public Recurso updateRecurso (Long id,Recurso recurso){
        if(recursoRepository.existsById(id)){
            recurso.setId(id);
            return recursoRepository.save(recurso);
        }
        return null;
    }

    public void deleteRecurso (Long id){
        recursoRepository.deleteById(id);
    }
}
