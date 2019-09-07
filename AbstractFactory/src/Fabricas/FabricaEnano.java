/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Arma.Arma;
import Arma.ArmaEnano;
import Cuerpo.Cuerpo;
import Cuerpo.CuerpoEnano;
import Escudo.Escudo;
import Escudo.EscudoEnano;

/**
 *
 * @author USUARIO
 */
public class FabricaEnano implements FabricaPersonajes{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoEnano();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoEnano();
    }

    @Override
    public Arma crearArma() {
        return new ArmaEnano();
    }
    
    
}
