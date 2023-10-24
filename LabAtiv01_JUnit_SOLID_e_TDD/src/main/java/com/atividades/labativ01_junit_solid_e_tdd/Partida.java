package com.atividades.labativ01_junit_solid_e_tdd;
/*
 * @author Cadilhe
 */

public class Partida {
    private Times timeMandante;
    private Times timeVisitante;
    private Estadio estadio;
    
    private int id;
    private String data;

    public Partida(Times timeMandante, Times timeVisitante, Estadio estadio) {
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.estadio = estadio;
    }

    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Times getTimeMandante() {
        return timeMandante;
    }

    public Times getTimeVisitante() {
        return timeVisitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }
  
    
}
