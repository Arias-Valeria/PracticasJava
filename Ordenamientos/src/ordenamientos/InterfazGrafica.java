/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

import java.awt.LayoutManager;
import javax.swing.JPanel;

/**
 *
 * @author Roberto
 */
public class InterfazGrafica extends javax.swing.JFrame{

  public InterfazGrafica(){
    initComponents();
  }
  
  private void initComponents(){
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle ("Ordenamientos");
    setMinimumSize(new java.awt.Dimension(200, 200));
    encabezado = new javax.swing.JLabel();
    encabezado.setText("Metodos de ordenamiento");
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(encabezado)
        .addContainerGap(262, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addComponent(encabezado)
        .addContainerGap(257, Short.MAX_VALUE))
    );
    pack();
  }
  
  private javax.swing.JLabel encabezado;
}