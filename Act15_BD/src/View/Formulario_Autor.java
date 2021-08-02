/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Bussines_Object.AutorBO;
import Entity.Autor;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class Formulario_Autor extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_Autor
     */
    private AutorBO auBO = new AutorBO();
    public Formulario_Autor() {
        initComponents();
        listarAutores();
        idAutor();
    }
    
    public void idAutor (){
        id_autor.setText(auBO.getAutorId()+"");
    }
    
    public void listarAutores(){
        auBO.listarAutores(tabla_autores);
    }
    
    public void limpiar(){
       id_autor.setText("");
        apellidoP_autor.setText("");
        nombre_autor.setText(""); 
        idAutor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        apellidoP_autor = new javax.swing.JTextField();
        textoApellido = new javax.swing.JLabel();
        textoId = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        id_autor = new javax.swing.JTextField();
        nombre_autor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_autores = new javax.swing.JTable();
        b_salir = new javax.swing.JButton();
        b_agregar = new javax.swing.JButton();
        b_modificar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        b_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        Titulo.setText("Autores ");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        Subtitulo.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        Subtitulo.setText("Ingrese los datos de los autores.");
        jPanel1.add(Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel1.add(apellidoP_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 210, 30));

        textoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoApellido.setText("Apellido paterno: ");
        jPanel1.add(textoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));

        textoId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoId.setText("Id del autor: ");
        jPanel1.add(textoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 30));

        textoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoNombre.setText("Nombre del autor: ");
        jPanel1.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));
        jPanel1.add(id_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, 30));

        nombre_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_autorActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, 30));

        tabla_autores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_autores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_autoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_autores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 340, 250));

        b_salir.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b_salir.setText("Salir");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        jPanel1.add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 100, 30));

        b_agregar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b_agregar.setText("Agregar");
        b_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(b_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 100, 30));

        b_modificar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b_modificar.setText("Modificar");
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(b_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 100, 30));

        bt_eliminar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 100, 30));

        b_limpiar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b_limpiar.setText("Limpiar");
        b_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(b_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
        if (id_autor.getText().isEmpty() || apellidoP_autor.getText().isEmpty() 
                || nombre_autor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos.");
        }else{
            Autor aut = new Autor();
            aut.setAutor_id(Integer.parseInt(id_autor.getText()));
            aut.setAutor_nombre(id_autor.getText());
            aut.setAutor_apellidoP(apellidoP_autor.getText());
            String mensaje = auBO.modificarAutor(aut);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarAutores();
        }
    }//GEN-LAST:event_b_modificarActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        if (id_autor.getText().isEmpty() || apellidoP_autor.getText().isEmpty() 
                || nombre_autor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos.");
        }else{
            String mensaje = auBO.eliminarAutor(Integer.parseInt(id_autor.getText()));
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarAutores();
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void b_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarActionPerformed
        if (id_autor.getText().isEmpty() || apellidoP_autor.getText().isEmpty() 
                || nombre_autor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos.");
        }else{
            Autor aut = new Autor();
            aut.setAutor_id(Integer.parseInt(id_autor.getText()));
            aut.setAutor_nombre(id_autor.getText());
            aut.setAutor_apellidoP(apellidoP_autor.getText());
            String mensaje = auBO.agregarAutor(aut);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarAutores();
        }
    }//GEN-LAST:event_b_agregarActionPerformed

    private void tabla_autoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_autoresMouseClicked
        int seleccion = tabla_autores.rowAtPoint(evt.getPoint());
        id_autor.setText(tabla_autores.getValueAt(seleccion, 0)+"");
        apellidoP_autor.setText(tabla_autores.getValueAt(seleccion, 1)+"");
        nombre_autor.setText(tabla_autores.getValueAt(seleccion, 2)+"");
    }//GEN-LAST:event_tabla_autoresMouseClicked

    private void nombre_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_autorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Autor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField apellidoP_autor;
    private javax.swing.JButton b_agregar;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JTextField id_autor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_autor;
    private javax.swing.JTable tabla_autores;
    private javax.swing.JLabel textoApellido;
    private javax.swing.JLabel textoId;
    private javax.swing.JLabel textoNombre;
    // End of variables declaration//GEN-END:variables
}