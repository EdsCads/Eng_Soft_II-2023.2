package com.atividades.teste_labativ01.builder;
/*
 * @author Cadilhe
 */

import com.atividades.labativ01_junit_solid_e_tdd.Estadio;
import com.atividades.labativ01_junit_solid_e_tdd.Times;

public class EstadioBuilder {
    
    private Estadio estadio;
    private EstadioBuilder() { }
    
    public static EstadioBuilder umEstadio(){
        EstadioBuilder builder = new EstadioBuilder();
        
        builder.estadio.setId(1);
        builder.estadio.setNome("Morumbi");
        builder.estadio.setEndereco("Rua das Flores,42,RJ");
        
        return builder;
    }
    
    public boolean temMesmoIdOutroNome(Estadio estadioDestino,Estadio estadioComp){
        if(estadioDestino.getId()==estadioComp.getId()){
            return estadioDestino.getNome().equals(estadioComp.getNome());
        }
        return false;
    }
    
}
