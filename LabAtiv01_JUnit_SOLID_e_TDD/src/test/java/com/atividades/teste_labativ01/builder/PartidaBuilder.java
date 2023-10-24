package com.atividades.teste_labativ01.builder;
/*
 * @author Cadilhe
 */
import com.atividades.labativ01_junit_solid_e_tdd.Partida;
        
public class PartidaBuilder {
    private Partida partida;
    private PartidaBuilder () { };
    
    public static PartidaBuilder umaPartida(){
        PartidaBuilder builder = new PartidaBuilder();
        
        builder.partida.setId(1);
        builder.partida.setData("11/5/2001");
        
        return builder;
    }
}
