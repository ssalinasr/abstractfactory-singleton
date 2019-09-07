/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Arma.Arma;
import Arma.ArmaHumano;
import Cuerpo.Cuerpo;
import Cuerpo.CuerpoHumano;
import Escudo.Escudo;
import Escudo.EscudoHumano;

/**
 *
 * @author USUARIO
 */
public class FabricaHumano implements FabricaPersonajes{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoHumano();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoHumano();
    }

    @Override
    public Arma crearArma() {
        return new ArmaHumano();
    }
    
}
