package com.example.projeto.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date ultimaManutencao;
    private Date proximaRevisao;
    private String estado;
    private String registroUso;
    private String registroManutencao;
    
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
        Recurso other = (Recurso) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    public Recurso() {
    }
    public Recurso(Long id, String nome, Date ultimaManutencao, Date proximaRevisao, String estado, String registroUso,
    String registroManutencao) {
        this.id = id;
        this.nome = nome;
        this.ultimaManutencao = ultimaManutencao;
        this.proximaRevisao = proximaRevisao;
        this.estado = estado;
        this.registroUso = registroUso;
        this.registroManutencao = registroManutencao;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getUltimaManutencao() {
        return ultimaManutencao;
    }
    public void setUltimaManutencao(Date ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }
    public Date getProximaRevisao() {
        return proximaRevisao;
    }
    public void setProximaRevisao(Date proximaRevisao) {
        this.proximaRevisao = proximaRevisao;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getRegistroUso() {
        return registroUso;
    }
    public void setRegistroUso(String registroUso) {
        this.registroUso = registroUso;
    }
    public String getRegistroManutencao() {
        return registroManutencao;
    }
    public void setRegistroManutencao(String registroManutencao) {
        this.registroManutencao = registroManutencao;
    }


    
}
