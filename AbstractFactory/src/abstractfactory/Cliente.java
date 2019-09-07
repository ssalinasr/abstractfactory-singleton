/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Arma.Arma;
import Cuerpo.Cuerpo;
import Escudo.Escudo;
import Fabricas.FabricaPersonajes;
import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class Cliente {

    private String cuerpoD;
    private String escudoD;
    private String armaD;
    private ImageIcon cuerpoI;
    private ImageIcon escudoI;
    private ImageIcon armaI;

    public Cliente(FabricaPersonajes personaje) {
        Cuerpo cuerpo = personaje.crearCuerpo();
        cuerpoI=cuerpo.getCuerpoI();
        cuerpoD=cuerpo.getCuerpo();
        Arma arma = personaje.crearArma();
        armaI=arma.getArmaI();
        armaD=arma.getArma();
        Escudo escudo = personaje.crearEscudo();
        escudoI=escudo.getEscudoI();
        escudoD=escudo.getEscudo();
    }

    public String getCuerpoD() {
        return cuerpoD;
    }

    public String getEscudoD() {
        return escudoD;
    }

    public String getArmaD() {
        return armaD;
    }

    public ImageIcon getCuerpoI() {
        return cuerpoI;
    }

    public ImageIcon getEscudoI() {
        return escudoI;
    }

    public ImageIcon getArmaI() {
        return armaI;
    }

}
