package com.tp.vista;

import static com.tp.Main.registrarValoresIniciales;
import com.tp.controlador.ControllerArticulo;
import com.tp.controlador.ControllerCiudad;
import com.tp.controlador.ControllerMarca;
import com.tp.controlador.ControllerPersona;
import com.tp.modelo.Articulo;
import com.tp.modelo.Ciudad;
import com.tp.modelo.Marca;
import com.tp.modelo.Persona;
import com.tp.modelo.Vendedor;
import com.tp.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Integrantes:
 * 
 * @author Baudino Gerardo
 * @author Poleri Franco
 * @author Pozzutto Romina
 */
public class Menu extends javax.swing.JFrame {
    
    
    ControllerPersona controllerPersona = new ControllerPersona();

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setText("Administración de vendedores");

        jButton1.setText("1. Listar todos los artículos");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("3. Editar un artículo");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("4. Listar todos los vendedores");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("5. Agregar un nuevo vendedor");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("6. Editar un vendedor");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6. Asociar artículos a un vendedor");
        jButton6.setActionCommand("7. Asociar artículos a un vendedor");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item1", "Item2", "Item3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton7.setText("2. Agregar un artículo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 160, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(4, 4, 4)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1, "card2");

        jMenu1.setText("File");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // LISTAR TODOS LOS ARTICULOS
        System.out.println("\n######-BOTÓN LISTA DE ARTÍCULOS-######");
        SessionFactory sf = HibernateUtil.getSessionFactory();
        DefaultListModel listModel = new DefaultListModel();
        try {
            Session session = sf.openSession();
            System.out.println("\n######-ARTICULO-######");
            List<Articulo> articulo = session.createQuery(
                    "From Articulo")
                    .list();
            for (Articulo art : articulo) {
                System.out.println(art.toString());
                listModel.addElement(art.toString());
            }
            jList1.setModel(listModel);
            jList1.updateUI();

        } catch (RuntimeException e) {
            System.err.println("Error al traer la lista de artículos: " + e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // EDITAR UN ARTICULO
        //ESTE BOTÓN CREO QUE LO PODRÍAMOS PONER EN LA VISTA DE LA LISTA DE ARTICULOS, CON UN BOTÓN AL COSTADO QUE SEA EDITAR
       System.out.println("\n######-BOTÓN EDITAR UN ARTÍCULO-######");

        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            System.out.println("\n######-ARTÍCULOS-######");
            Transaction tx = null;
            //ARMAR EL FORMULARIO PARA COMPLETAR LOS DATOS Y ACTUALIZARLO
            tx = session.beginTransaction();
            ControllerArticulo controllerArticulo = new ControllerArticulo();
            Articulo articuloDB = controllerArticulo.verArticuloPorId(session, 1);
            articuloDB.setCodigo(1);
            articuloDB.setNombre("Auto");
            articuloDB.setDescripcion("Honda CRV");
            controllerArticulo.actualizar(session, articuloDB);
            tx.commit();
            session.close();
        } catch (RuntimeException e) {
            System.err.println("Error al editar un artículo: " + e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // LISTAR TODOS LOS VENDEDORES
        System.out.println("\n######-BOTÓN LISTA DE VENDEDORES-######");
                SessionFactory sf = HibernateUtil.getSessionFactory();
                DefaultListModel listModel = new DefaultListModel();

        try {
            Session session = sf.openSession();
            System.out.println("\n######-VENDEDORES-######");
            List<Vendedor> vendedores = session.createQuery(
                    "From Vendedor")
                    .list();
            for (Vendedor vend : vendedores) {
                System.out.println(vend.toString());
                listModel.addElement(vend.toString());
            }  
            jList1.setModel(listModel);
            jList1.updateUI();
        } catch (RuntimeException e) {
            System.err.println("Error al traer la lista de vendedores: " + e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // AGREGAR UN NUEVO VENDEDOR
        System.out.println("\n######-BOTÓN AGREGAR UN NUEVO VENDEDOR-######");
        try {
        ControllerCiudad controllerCiudad = new ControllerCiudad();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List<Articulo> articulos = new ArrayList<>();
        Transaction tx = null;

        tx = session.beginTransaction();
        List<Ciudad> ciudades = controllerCiudad.getCiudades();
        ciudades.forEach(ciudad -> {
            controllerCiudad.registrar(session, ciudad);
        });
        //ESTO DESPUÉS LO TOMAMOS DE UN FRAME
        Vendedor nuevoVendedor = new Vendedor(4, 20, articulos, ciudades.get(0), "Nahuel", "Contreras", "Calle Falsa 123");
        controllerPersona.registrar(session, nuevoVendedor);
        tx.commit();
        session.close();
        } catch (RuntimeException e) {
            System.err.println("Error al traer la lista de vendedores: " + e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // EDITAR UN VENDEDOR
        System.out.println("\n######-BOTÓN EDITAR UN VENDEDOR-######");
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            System.out.println("\n######-VENDEDORES-######");
            Transaction tx = null;
            //ARMAR EL FORMULARIO PARA COMPLETAR LOS DATOS Y ACTUALIZARLO
            tx = session.beginTransaction();
            ControllerPersona controllerPersona = new ControllerPersona();
            Vendedor vendedorDB = controllerPersona.verPersonaPorId(session, 4);
            vendedorDB.setNombre("Camila");
            vendedorDB.setApellido("López");
            vendedorDB.setPorcentajeDeComision(40);
            vendedorDB.setCuit(123);
            controllerPersona.actualizar(session, vendedorDB);
            tx.commit();
            session.close();
        } catch (RuntimeException e) {
            System.err.println("Error al editar un vendedor: " + e);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // ASOCIAR ARTICULOS A UN VENDEDOR
        System.out.println("\n######-BOTÓN ASOCIAR ARTICULOS UN VENDEDOR-######");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.out.println("\n######-BOTÓN AGREGAR UN NUEVO ARTÍCULO-######");
        try {
        ControllerArticulo controllerArticulo = new ControllerArticulo();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;

        tx = session.beginTransaction();
        //ESTO DESPUÉS LO TOMAMOS DE UN FRAME
        Marca marca = new Marca(15, "Apple");
        Articulo nuevoArticulo = new Articulo(1, "iPhone",
                "iPhone 11", 18000, 148000, marca);
        controllerArticulo.registrar(session, nuevoArticulo);
        tx.commit();
        session.close();
            
        } catch (RuntimeException e) {
            System.err.println("Error al traer la lista de vendedores: " + e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
