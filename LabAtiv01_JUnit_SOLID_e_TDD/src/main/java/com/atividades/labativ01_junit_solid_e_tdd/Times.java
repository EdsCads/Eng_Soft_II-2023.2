package com.atividades.labativ01_junit_solid_e_tdd;
/*
 * @author Cadilhe
 */

import java.util.Arrays;
import java.util.ArrayList;

public class Times {
    private int Id;
    private String nome;
    private ArrayList <Integer> campeonato = new  ArrayList <Integer>();

    public Times() {    }

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

    public ArrayList<Integer> getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(int componente) {
        this.campeonato.add(componente);
    }
    
}
