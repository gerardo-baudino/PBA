/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pav.tp1;

/**
 *
 * @author Gerardo
 */
public class GeneradorDeNumeros extends javax.swing.JFrame {

    /**
     * Creates new form GeneradorDeNumeros
     */
    public GeneradorDeNumeros() {
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

        panelNumero2 = new javax.swing.JPanel();
        numero2Label = new javax.swing.JLabel();
        numero2ComboBox = new javax.swing.JSpinner();
        panelNumero1 = new javax.swing.JPanel();
        numero1Label = new javax.swing.JLabel();
        numero1ComboBox = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        numero3Label = new javax.swing.JLabel();
        textFieldNumeroMayor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        botonGenerador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelNumero2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 90, 20));

        numero2Label.setText("Número 2");
        panelNumero2.add(numero2Label);

        numero2ComboBox.setPreferredSize(new java.awt.Dimension(80, 25));
        panelNumero2.add(numero2ComboBox);

        panelNumero1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelNumero1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 90, 20));

        numero1Label.setText("Número 1");
        panelNumero1.add(numero1Label);

        numero1ComboBox.setMinimumSize(new java.awt.Dimension(80, 25));
        numero1ComboBox.setPreferredSize(new java.awt.Dimension(80, 25));
        panelNumero1.add(numero1ComboBox);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 45, 20));

        numero3Label.setText("Número generado");
        jPanel1.add(numero3Label);

        textFieldNumeroMayor.setEditable(false);
        textFieldNumeroMayor.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(textFieldNumeroMayor);

        jPanel2.setLayout(new java.awt.CardLayout());

        botonGenerador.setText("Generar");
        botonGenerador.setPreferredSize(new java.awt.Dimension(80, 30));
        botonGenerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGeneradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(panelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGeneradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGeneradorActionPerformed
        Integer numero1 = (Integer) numero1ComboBox.getValue();
        Integer numero2 = (Integer)numero2ComboBox.getValue();
        String numero1Text = String.valueOf(numero1);
        String numero2Text = String.valueOf(numero2);

        if (numero1 > numero2){
            textFieldNumeroMayor.setText(numero1Text);
        } else {
            textFieldNumeroMayor.setText(numero2Text);
        }

        
    }//GEN-LAST:event_botonGeneradorActionPerformed

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
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneradorDeNumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGenerador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner numero1ComboBox;
    private javax.swing.JLabel numero1Label;
    private javax.swing.JSpinner numero2ComboBox;
    private javax.swing.JLabel numero2Label;
    private javax.swing.JLabel numero3Label;
    private javax.swing.JPanel panelNumero1;
    private javax.swing.JPanel panelNumero2;
    private javax.swing.JTextField textFieldNumeroMayor;
    // End of variables declaration//GEN-END:variables
}