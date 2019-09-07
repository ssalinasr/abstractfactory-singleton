/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuerpo;

import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class CuerpoHumano extends Cuerpo {

    private ImageIcon imagen;
    private String descripcion;

    public CuerpoHumano() {
        imagen = new ImageIcon(getClass().getResource("/img/CuerpoHumano.png"));
        descripcion = "Este es un cuerpo humano XD";
    }

    @Override
    public String getCuerpo() {
        return descripcion;
    }

    @Override
    public ImageIcon getCuerpoI() {
        return imagen;
    }

}
