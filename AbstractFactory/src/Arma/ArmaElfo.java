/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arma;

import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class ArmaElfo extends Arma {

    private ImageIcon imagen;
    private String descripcion;

    public ArmaElfo() {
        imagen = new ImageIcon(getClass().getResource("/img/ArmaElfo.png"));
        descripcion = "Este es un arma elfa XD";
    }

    @Override
    public String getArma() {
        return descripcion;
    }

    @Override
    public ImageIcon getArmaI() {
        return imagen;
    }

}
