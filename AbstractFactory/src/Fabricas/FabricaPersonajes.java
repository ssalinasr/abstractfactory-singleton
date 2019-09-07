/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Arma.Arma;
import Cuerpo.Cuerpo;
import Escudo.Escudo;

/**
 *
 * @author USUARIO
 */
public interface FabricaPersonajes {
    
    public abstract Cuerpo crearCuerpo();
    public abstract Escudo crearEscudo();
    public abstract Arma crearArma();

}
