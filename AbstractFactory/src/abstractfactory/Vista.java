/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import Fabricas.FabricaElfo;
import Fabricas.FabricaEnano;
import Fabricas.FabricaHumano;
import Fabricas.FabricaPersonajes;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Vista extends javax.swing.JFrame {

    private Cliente cliente;
    private Icon imagen1;
    private Icon imagen2;
    private Icon imagen3;

    public static void main(String[] args) {
        Vista vista = new Vista();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    public Vista() {
        initComponents();
    }

   /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEscoger = new javax.swing.JLabel();
        cboPersonajes = new javax.swing.JComboBox<>();
        lblCuerpo = new javax.swing.JLabel();
        lblArma = new javax.swing.JLabel();
        lblEscudo = new javax.swing.JLabel();
        lblCDes = new javax.swing.JLabel();
        lblADes = new javax.swing.JLabel();
        lblEDes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personajes");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEscoger.setText("Escoja el personaje");
        jPanel1.add(lblEscoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cboPersonajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enano", "Humano", "Elfo" }));
        cboPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPersonajesActionPerformed(evt);
            }
        });
        jPanel1.add(cboPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        lblCuerpo.setBackground(new java.awt.Color(51, 51, 51));
        lblCuerpo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 190));
        jPanel1.add(lblArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 140, 190));
        jPanel1.add(lblEscudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 190));
        jPanel1.add(lblCDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 40));
        jPanel1.add(lblADes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, 40));
        jPanel1.add(lblEDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
*/
    
    
    
    private void initComponents(){
        jPanel1 = new JPanelFondo();
        lblEscoger = new javax.swing.JLabel();
        cboPersonajes = new javax.swing.JComboBox<>();
        lblCuerpo = new javax.swing.JLabel();
        lblArma = new javax.swing.JLabel();
        lblEscudo = new javax.swing.JLabel();
        lblCDes = new javax.swing.JLabel();
        lblADes = new javax.swing.JLabel();
        lblEDes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personajes");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEscoger.setText("Escoja el personaje");
        jPanel1.add(lblEscoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cboPersonajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enano", "Humano", "Elfo" }));
        cboPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPersonajesActionPerformed(evt);
            }
        });
        jPanel1.add(cboPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        lblCuerpo.setBackground(new java.awt.Color(51, 51, 51));
        lblCuerpo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 190));
        jPanel1.add(lblArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 140, 190));
        jPanel1.add(lblEscudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 190));
        jPanel1.add(lblCDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 40));
        jPanel1.add(lblADes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, 40));
        jPanel1.add(lblEDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    private void cboPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPersonajesActionPerformed
        if (cboPersonajes.getSelectedItem().toString() == "Enano") {
            cliente = new Cliente(new FabricaEnano());
            imagen1 = new ImageIcon(cliente.getCuerpoI().getImage().getScaledInstance(lblCuerpo.getWidth(), lblCuerpo.getHeight(), Image.SCALE_DEFAULT));
            imagen2 = new ImageIcon(cliente.getArmaI().getImage().getScaledInstance(lblArma.getWidth(), lblArma.getHeight(), Image.SCALE_DEFAULT));
            imagen3 = new ImageIcon(cliente.getEscudoI().getImage().getScaledInstance(lblEscudo.getWidth(), lblEscudo.getHeight(), Image.SCALE_DEFAULT));
            lblCuerpo.setIcon(imagen1);
            lblArma.setIcon(imagen2);
            lblEscudo.setIcon(imagen3);
            lblCDes.setText(cliente.getCuerpoD());
            lblADes.setText(cliente.getArmaD());
            lblEDes.setText(cliente.getEscudoD());
            this.repaint();
        }

        if (cboPersonajes.getSelectedItem().equals("Humano")) {
            cliente = new Cliente(new FabricaHumano());
            imagen1 = new ImageIcon(cliente.getCuerpoI().getImage().getScaledInstance(lblCuerpo.getWidth(), lblCuerpo.getHeight(), Image.SCALE_DEFAULT));
            imagen2 = new ImageIcon(cliente.getArmaI().getImage().getScaledInstance(lblArma.getWidth(), lblArma.getHeight(), Image.SCALE_DEFAULT));
            imagen3 = new ImageIcon(cliente.getEscudoI().getImage().getScaledInstance(lblEscudo.getWidth(), lblEscudo.getHeight(), Image.SCALE_DEFAULT));
            lblCuerpo.setIcon(imagen1);
            lblArma.setIcon(imagen2);
            lblEscudo.setIcon(imagen3);
            lblCDes.setText(cliente.getCuerpoD());
            lblADes.setText(cliente.getArmaD());
            lblEDes.setText(cliente.getEscudoD());
            this.repaint();
        }

        if (cboPersonajes.getSelectedItem().equals("Elfo")) {
            cliente = new Cliente(new FabricaElfo());
            imagen1 = new ImageIcon(cliente.getCuerpoI().getImage().getScaledInstance(lblCuerpo.getWidth(), lblCuerpo.getHeight(), Image.SCALE_DEFAULT));
            imagen2 = new ImageIcon(cliente.getArmaI().getImage().getScaledInstance(lblArma.getWidth(), lblArma.getHeight(), Image.SCALE_DEFAULT));
            imagen3 = new ImageIcon(cliente.getEscudoI().getImage().getScaledInstance(lblEscudo.getWidth(), lblEscudo.getHeight(), Image.SCALE_DEFAULT));
            lblCuerpo.setIcon(imagen1);
            lblArma.setIcon(imagen2);
            lblEscudo.setIcon(imagen3);
            lblCDes.setText(cliente.getCuerpoD());
            lblADes.setText(cliente.getArmaD());
            lblEDes.setText(cliente.getEscudoD());
            this.repaint();
        }
    }//GEN-LAST:event_cboPersonajesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboPersonajes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblADes;
    private javax.swing.JLabel lblArma;
    private javax.swing.JLabel lblCDes;
    private javax.swing.JLabel lblCuerpo;
    private javax.swing.JLabel lblEDes;
    private javax.swing.JLabel lblEscoger;
    private javax.swing.JLabel lblEscudo;
    // End of variables declaration//GEN-END:variables

}
