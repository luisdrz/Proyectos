
package Registro;

import LogicaNegocio.Password;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class RUsuarios extends javax.swing.JFrame {

    
    public RUsuarios() {
        initComponents();
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/Imagenes/Crear.png"));
        Icon fondo1=new ImageIcon(imagen1.getImage().getScaledInstance(jLabelCrear.getWidth(), jLabelCrear.getWidth(), Image.SCALE_DEFAULT));
        jLabelCrear.setIcon(fondo1);
        this.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        TextCorreo = new javax.swing.JTextField();
        LabelRepetir = new javax.swing.JLabel();
        LabelGenerar = new javax.swing.JLabel();
        TextContrasena = new javax.swing.JTextField();
        TextRepetir = new javax.swing.JTextField();
        ButtonCrear = new javax.swing.JButton();
        jLabelCrear = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Usuario");

        jPanel1.setBackground(new java.awt.Color(198, 240, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelTitulo.setText("REGISTRO DE USUARIOS");
        jPanel1.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 251, -1));

        LabelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNombre.setText("Nombre:");
        jPanel1.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 100, -1));

        LabelCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCorreo.setText("Correo electronico:");
        jPanel1.add(LabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 151, -1));

        LabelContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelContraseña.setText("Contraseña:");
        jPanel1.add(LabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, -1));

        TextNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 251, 33));
        TextNombre.getAccessibleContext().setAccessibleName("");

        TextCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(TextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 251, 33));

        LabelRepetir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelRepetir.setText("Repetir contraseña:");
        jPanel1.add(LabelRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 154, -1));

        LabelGenerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelGenerar.setForeground(new java.awt.Color(0, 51, 255));
        LabelGenerar.setText("Generar Contraseña");
        LabelGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelGenerarMouseClicked(evt);
            }
        });
        jPanel1.add(LabelGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 121, -1));

        TextContrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(TextContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 251, 35));

        TextRepetir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextRepetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRepetirActionPerformed(evt);
            }
        });
        jPanel1.add(TextRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 251, 34));

        ButtonCrear.setBackground(new java.awt.Color(0, 0, 153));
        ButtonCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCrear.setText("Crear");
        ButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1509, 1024, 104, 38));

        jLabelCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MuestraReferencia.jpg"))); // NOI18N
        jLabelCrear.setText("jLabel2");
        jPanel1.add(jLabelCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 170, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextRepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRepetirActionPerformed
       
    }//GEN-LAST:event_TextRepetirActionPerformed

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
       
    }//GEN-LAST:event_TextCorreoActionPerformed

    private void LabelGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelGenerarMouseClicked
      Password obj=new Password();
      TextContrasena.setText(obj.generarContrasena());
      
    }//GEN-LAST:event_LabelGenerarMouseClicked

    private void ButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearActionPerformed
        
    }//GEN-LAST:event_ButtonCrearActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCrear;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelGenerar;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelRepetir;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField TextContrasena;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextRepetir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCrear;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
