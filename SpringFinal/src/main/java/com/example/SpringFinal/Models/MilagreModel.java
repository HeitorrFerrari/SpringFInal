package com.example.SpringFinal.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_ESTUDANTE")

public class MilagreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public MilagreModel() {

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
}
