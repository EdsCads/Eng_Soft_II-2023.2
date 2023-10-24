package com.atividades.teste_labativ01.builder;
/*
 * @author Cadilhe
 */

import com.atividades.labativ01_junit_solid_e_tdd.Times;
import com.atividades.labativ01_junit_solid_e_tdd.Campeonato;

public class TimeBuilder {
    
    private Times time;
    private TimeBuilder() {}
    
    public static TimeBuilder umTime(){
        TimeBuilder builder = new TimeBuilder();
        Campeonato camp=CampeonatoBuilder.umCampeonato().constroi();
            builder.time = new Times();
            builder.time.setId(1);
            builder.time.setNome("Corithians");
            builder.time.add(camp);
        
        return builder;
    }
    
    Times temEstadio(){
       return this.time;
    }
}
