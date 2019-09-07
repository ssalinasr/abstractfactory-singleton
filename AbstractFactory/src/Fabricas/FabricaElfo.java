/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Arma.Arma;
import Arma.ArmaElfo;
import Cuerpo.Cuerpo;
import Cuerpo.CuerpoElfo;
import Escudo.Escudo;
import Escudo.EscudoElfo;

/**
 *
 * @author USUARIO
 */
public class FabricaElfo implements FabricaPersonajes{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoElfo();
    }

    @Override
    public Arma crearArma() {
        return new ArmaElfo();
    }
    
    
}
