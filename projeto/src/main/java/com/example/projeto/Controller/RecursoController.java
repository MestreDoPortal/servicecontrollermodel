package com.example.projeto.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.Service.RecursoService;
import com.example.projeto.Model.*;


@RestController
@RequestMapping("/recursos")
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping
    public List<Recurso> getAllRecursos(){
        return recursoService.getAllRecursos();
    }

    @GetMapping("/{id}")
    public Recurso getRecursoById(@PathVariable Long id) {
        return recursoService.getRecursoById(id);
    }
    
    @PostMapping
    public Recurso createRecurso (Recurso recurso){
        return recursoService.createRecurso(recurso);
    }

    @PutMapping("/{id}")
    public Recurso updatRecurso (@PathVariable Long id, @RequestBody Recurso recurso){
        return recursoService.updateRecurso(id, recurso);
    }

    @DeleteMapping("/{id}")
    public void deleteRecurso(@PathVariable Long id){
        recursoService.deleteRecurso(id);
    }




}
