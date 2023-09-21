package com.atividades.labativ01_junit_solid_e_tdd;
/*
 * @author Cadilhe
 */

import java.util.Arrays;
import java.util.ArrayList;

public class Times {
    private int Id;
    private String nome;
    private ArrayList <Campeonato> campeonato = new  ArrayList <Campeonato>();

    public Times(int Id, String nome) {
        this.Id = Id;
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Campeonato> getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(ArrayList<Campeonato> campeonato) {
        this.campeonato = campeonato;
    }    
    
}
