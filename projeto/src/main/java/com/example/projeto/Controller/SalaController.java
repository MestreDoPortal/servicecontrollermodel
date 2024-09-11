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

import com.example.projeto.Service.SalaService;
import com.example.projeto.Model.*;

@RestController
@RequestMapping("/salas")
public class SalaController {


    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAllSalas(){
        return salaService.getAllSalas();
    }

    @GetMapping("/{id}")
    public Sala getSalaById(@PathVariable Long id) {
        return salaService.getSalaById(id);
    }
    
    @PostMapping
    public Sala createSala (Sala sala){
        return salaService.createSala(sala);
    }



    @PutMapping("/{id}")
    public Sala updateSala (@PathVariable Long id, @RequestBody Sala sala){
        return salaService.updateSala(id, sala);
    }

    @DeleteMapping("/{id}")
    public void deleteSala(@PathVariable Long id){
        salaService.deleteSala(id);
    }





}
