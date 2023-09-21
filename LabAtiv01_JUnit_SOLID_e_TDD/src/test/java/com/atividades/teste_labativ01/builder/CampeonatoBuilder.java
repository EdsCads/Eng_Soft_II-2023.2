package com.atividades.teste_labativ01.builder;
/*
 * @author Cadilhe
 */

import com.atividades.labativ01_junit_solid_e_tdd.Campeonato;

public class CampeonatoBuilder {
    
    private Campeonato campeonato;
    private CampeonatoBuilder(){};
    
    public static CampeonatoBuilder umCampeonato(){
        CampeonatoBuilder builder = new CampeonatoBuilder();
		
		builder.campeonato = new Campeonato();
		builder.campeonato.setAno(2023);
		builder.campeonato.setNome("Campeonato Serie A");
		
		return builder;
    }
    public CampeonatoBuilder criadoNoAno(int anoCriado){
        this.campeonato.setAno(anoCriado);
        return this;
    }
    
    public Campeonato constroi(){
        return this.campeonato;
    }
}
