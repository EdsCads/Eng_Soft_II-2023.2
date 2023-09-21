package com.atividades.teste_labativ01;
/*
 * @author Cadilhe
 */

import com.atividades.labativ01_junit_solid_e_tdd.Campeonato;
import com.atividades.teste_labativ01.builder.CampeonatoBuilder;
import java.util.Calendar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampeonatoTeste {
    @Test
    void anoDeveSerDepoisOuIgualAoAnoAtual(){
        Campeonato campeonato=CampeonatoBuilder
                    .umCampeonato()
                    .criadoNoAno(2006)
                    .constroi();
        assertEquals(campeonato.getAno()>Calendar.getInstance().get(Calendar.YEAR),
                true);
    }
    
    
}
