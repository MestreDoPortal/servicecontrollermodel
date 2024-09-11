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

import com.example.projeto.Model.Reserva;
import com.example.projeto.Service.ReservaService;


@RestController
@RequestMapping("/reservas")
public class ReservaController {

        @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<Reserva> getAllReservas(){
        return reservaService.getAllReserva();
    }

    @GetMapping("/{id}")
    public Reserva getReservaById(@PathVariable Long id) {
        return reservaService.getReservaById(id);
    }
    
    @PostMapping
    public Reserva createReserva (Reserva reserva){
        return reservaService.createReserva(reserva);
    }

    @PutMapping("/{id}")
    public Reserva updatReserva (@PathVariable Long id, @RequestBody Reserva reserva){
        return reservaService.updateReserva(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void deleteReserva(@PathVariable Long id){
        reservaService.deleteReserva(id);
    }



}
