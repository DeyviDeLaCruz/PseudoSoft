/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import anocongruenciales.Cuadradosmedios;

public class ANCcm extends javax.swing.JFrame {


    public ANCcm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        lbl_semilla = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        txt_semilla = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        btn_generar = new javax.swing.JButton();
        lst_semilla2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        lst_resultado = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("ALGORITMO DE ");
        jPanel1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 60));

        titulo2.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(226, 103, 13));
        titulo2.setText("CUADRADOS MEDIOS");
        jPanel1.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 25, -1, 70));

        lbl_semilla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_semilla.setForeground(new java.awt.Color(255, 255, 255));
        lbl_semilla.setText("SEMILLA:");
        jPanel1.add(lbl_semilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lbl_cantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cantidad.setText("CANTIDAD A GENERAR");
        jPanel1.add(lbl_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        txt_semilla.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 18)); // NOI18N
        jPanel1.add(txt_semilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 50));

        txt_cantidad.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 18)); // NOI18N
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, 50));

        btn_generar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_generar.setForeground(new java.awt.Color(226, 103, 13));
        btn_generar.setText("GENERAR");
        btn_generar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 120, 50));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lst_semilla2.setViewportView(jList1);

        jPanel1.add(lst_semilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 220));

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lst_resultado.setViewportView(jList2);

        jPanel1.add(lst_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 170, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ANCcm_fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 833, 509));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed

        Cuadradosmedios cm=new Cuadradosmedios();
        
        int vsemilla=Integer.parseInt(txt_semilla.getText());
        
        int vcantidad=Integer.parseInt(txt_cantidad.getText());
        
        
        cm.setSemilla(vsemilla);
        cm.setCantidad(vcantidad);
        
        cm.Generarcm();
        
        
    }//GEN-LAST:event_btn_generarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ANCcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ANCcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ANCcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ANCcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ANCcm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_semilla;
    private javax.swing.JScrollPane lst_resultado;
    private javax.swing.JScrollPane lst_semilla2;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_semilla;
    // End of variables declaration//GEN-END:variables
}
