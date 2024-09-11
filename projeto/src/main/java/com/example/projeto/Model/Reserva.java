package com.example.projeto.Model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date inicioReserva;
    private Date fimReserva;
    private Time iniTime;
    private Time fimTime;

    @ManyToOne
    Sala sala;




    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }





    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reserva other = (Reserva) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }





    public Reserva() {
    }





    public Reserva(Long id, Date inicioReserva, Date fimReserva, Time iniTime, Time fimTime) {
        this.id = id;
        this.inicioReserva = inicioReserva;
        this.fimReserva = fimReserva;
        this.iniTime = iniTime;
        this.fimTime = fimTime;
    }





    public Long getId() {
        return id;
    }





    public void setId(Long id) {
        this.id = id;
    }





    public Date getInicioReserva() {
        return inicioReserva;
    }





    public void setInicioReserva(Date inicioReserva) {
        this.inicioReserva = inicioReserva;
    }





    public Date getFimReserva() {
        return fimReserva;
    }





    public void setFimReserva(Date fimReserva) {
        this.fimReserva = fimReserva;
    }





    public Time getIniTime() {
        return iniTime;
    }





    public void setIniTime(Time iniTime) {
        this.iniTime = iniTime;
    }





    public Time getFimTime() {
        return fimTime;
    }





    public void setFimTime(Time fimTime) {
        this.fimTime = fimTime;
    }


    
}
