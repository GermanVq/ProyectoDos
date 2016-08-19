/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 *
 * @author gvega2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnumerouno = new javax.swing.JTextField();
        txtnumerodos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtresultado = new javax.swing.JTextField();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("SUMA DE NUMEROS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 190, 20));

        jLabel2.setText("Numero Uno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Numero Dos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 64, -1, 20));

        txtnumerouno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerounoActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumerouno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 40, -1));

        txtnumerodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerodosActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumerodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 40, -1));

        jLabel4.setText("Resultado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 20));

        txtresultado.setEditable(false);
        getContentPane().add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 40, -1));

        cmdcalcular.setText("Calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        cmdborrar.setText("Borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumerounoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerounoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerounoActionPerformed

    private void txtnumerodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerodosActionPerformed

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
     String num1, num2, res; 
     int n1,n2,suma;
      
     num1 = txtnumerouno.getText();
     num2 = txtnumerodos.getText();
     
     n1 = Integer.parseInt(num1);
     n2 = Integer.parseInt(num2);
     
     suma = n1 + n2;
     res = String.valueOf(suma);
     
     txtresultado.setText(res);
      // TODO add your handling code here:
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
     txtnumerouno.setText("");
     txtnumerodos.setText("");
     txtresultado.setText("");
     
     txtnumerouno.requestFocusInWindow();
    }//GEN-LAST:event_cmdborrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtnumerodos;
    private javax.swing.JTextField txtnumerouno;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
