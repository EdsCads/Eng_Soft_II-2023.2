package com.atividades.teste_labativ01.builder;
/*
 * @author Cadilhe
 */

import com.atividades.labativ01_junit_solid_e_tdd.Times;

public class TimeBuilder {
    
    private Times time;
    private TimeBuilder() {}
    
    public static TimeBuilder umTime(){
        TimeBuilder builder = new TimeBuilder();
            
            builder.time = new Times();
            builder.time.setId(1);
            builder.time.setNome("Corithians");
            builder.time.setCampeonato(1);
        
        return builder;
    }
    
    TimeBuilder temEstadio(){
       return this;
    }
}
