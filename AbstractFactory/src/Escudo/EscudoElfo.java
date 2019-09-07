/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escudo;

import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class EscudoElfo extends Escudo {

    private ImageIcon imagen;
    private String descripcion;

    public EscudoElfo() {
        imagen = new ImageIcon(getClass().getResource("/img/EscudoElfo.png"));
        descripcion = "Este es un escudo elfo XD";
    }

    @Override
    public String getEscudo() {
        return descripcion;
    }

    @Override
    public ImageIcon getEscudoI() {
        return imagen;
    }

}
