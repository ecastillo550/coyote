/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coyotefeliz;

/**
 *
 * @author Doraly
 */
public class renta extends javax.swing.JFrame {

    /**
     * Creates new form renta
     */
    public renta() {
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
        jLabel5 = new javax.swing.JLabel();
        placas_renta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        color_renta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Realizar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        f_inicio_renta = new com.toedter.calendar.JDateChooser();
        f_fin_renta = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        cant_v_renta = new com.toedter.components.JSpinField();
        tipo_v_renta = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        marca_renta = new javax.swing.JComboBox();
        modelo_renta = new com.toedter.calendar.JYearChooser();
        jLabel13 = new javax.swing.JLabel();
        mun_renta = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cyn_en_renta = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        col_en_renta = new javax.swing.JTextField();
        JLABEL = new javax.swing.JLabel();
        CP_renta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        numero_renta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mun_re_renta = new javax.swing.JComboBox();
        CP_re_renta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cyn_re_renta = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        col_re_renta = new javax.swing.JTextField();
        JLABEL1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ag_en = new java.awt.Checkbox();
        ag_re_renta = new java.awt.Checkbox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395396671_stock_id.png"))); // NOI18N
        jLabel1.setText("No:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 97, 43, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395482821_event.png"))); // NOI18N
        jLabel2.setText("Fecha de Inicio:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 123, 131, 23);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Cantidad de vehiculos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 152, 161, 24);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Tipo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 253, 34, 20);

        placas_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        placas_renta.setBorder(null);
        getContentPane().add(placas_renta);
        placas_renta.setBounds(73, 312, 140, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Modelo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 281, 57, 24);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Placas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 311, 49, 20);

        jlabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlabel.setText("Marca:");
        getContentPane().add(jlabel);
        jlabel.setBounds(179, 253, 47, 20);

        color_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        color_renta.setBorder(null);
        color_renta.setPreferredSize(new java.awt.Dimension(10, 21));
        color_renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_rentaActionPerformed(evt);
            }
        });
        getContentPane().add(color_renta);
        color_renta.setBounds(195, 282, 228, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Color:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(149, 281, 42, 20);

        Cancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395395569_button_cancel.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        getContentPane().add(Cancelar);
        Cancelar.setBounds(370, 630, 103, 30);

        Realizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Realizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395395449_Check.png"))); // NOI18N
        Realizar.setText("Realizar");
        getContentPane().add(Realizar);
        Realizar.setBounds(260, 630, 99, 30);

        Atras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395397828_back.png"))); // NOI18N
        Atras.setText("Atrás");
        getContentPane().add(Atras);
        Atras.setBounds(170, 630, 83, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Doraly\\Documents\\NetBeansProjects\\coyotefeliz\\src\\coyotefeliz\\imagenes\\1395402144_document-new.png")); // NOI18N
        jLabel10.setText("NUEVA RENTA");
        jLabel10.setFocusable(false);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 11, 450, 64);

        f_inicio_renta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(f_inicio_renta);
        f_inicio_renta.setBounds(155, 123, 97, 23);

        f_fin_renta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(f_fin_renta);
        f_fin_renta.setBounds(371, 123, 114, 23);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395482821_event.png"))); // NOI18N
        jLabel12.setText("Fecha de fin:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(256, 123, 111, 23);
        getContentPane().add(cant_v_renta);
        cant_v_renta.setBounds(185, 152, 38, 24);

        tipo_v_renta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tipo_v_renta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carga", "Transporte", "De Alquiler", "Automóvil", "Camioneta" }));
        getContentPane().add(tipo_v_renta);
        tipo_v_renta.setBounds(58, 252, 117, 23);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395397572_Address_Book_Alt_blue.png"))); // NOI18N
        jLabel11.setText("Datos de la Entrega");
        jLabel11.setFocusable(false);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 338, 403, 32);

        marca_renta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        marca_renta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FORD", "BMW", "AUDI", "CHEVROLET", "GMC", "LINCOLN", "NISSAN", "TOYOTA", "SEAT", "VOLKSWAGEN", "RENAULT", "MAZDA CADILLAC", "VOLVO", "MERCEDES BENZ", "FIAT", "DODGE", "SUSUKI", "CHRYSLER", "PONTIAC", "HUMMER", "MITSUBISHI", "CORVETTE" }));
        getContentPane().add(marca_renta);
        marca_renta.setBounds(230, 252, 193, 23);
        getContentPane().add(modelo_renta);
        modelo_renta.setBounds(81, 281, 64, 24);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Doraly\\Documents\\NetBeansProjects\\coyotefeliz\\src\\coyotefeliz\\imagenes\\1395403840_camaro_64.png")); // NOI18N
        jLabel13.setText("Datos del Vehículo");
        jLabel13.setFocusable(false);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 182, 450, 64);

        mun_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mun_renta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monterrey", "Guadalupe", "San Nicolás", "Escobedo", "Apodaca", "Juárez", "Cadereyta", "Santiago", "San Pedro", "Santa Catarina" }));
        mun_renta.setBorder(null);
        getContentPane().add(mun_renta);
        mun_renta.setBounds(97, 429, 115, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Calle y Número:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 376, 109, 20);

        cyn_en_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cyn_en_renta.setBorder(null);
        cyn_en_renta.setPreferredSize(new java.awt.Dimension(10, 21));
        getContentPane().add(cyn_en_renta);
        cyn_en_renta.setBounds(133, 376, 289, 20);

        jlabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlabel1.setText("Colonia:");
        getContentPane().add(jlabel1);
        jlabel1.setBounds(20, 406, 57, 20);

        col_en_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        col_en_renta.setBorder(null);
        col_en_renta.setPreferredSize(new java.awt.Dimension(10, 21));
        getContentPane().add(col_en_renta);
        col_en_renta.setBounds(81, 403, 191, 20);

        JLABEL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLABEL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        JLABEL.setText("CP:");
        getContentPane().add(JLABEL);
        JLABEL.setBounds(282, 402, 23, 20);

        CP_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CP_renta.setBorder(null);
        CP_renta.setPreferredSize(new java.awt.Dimension(10, 21));
        getContentPane().add(CP_renta);
        CP_renta.setBounds(309, 403, 114, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Municipio:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 429, 73, 20);

        numero_renta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numero_renta.setBorder(null);
        getContentPane().add(numero_renta);
        numero_renta.setBounds(67, 99, 104, 17);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coyotefeliz/imagenes/1395397572_Address_Book_Alt_blue.png"))); // NOI18N
        jLabel16.setText("Datos de Recibir");
        jLabel16.setFocusable(false);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 490, 400, 32);

        mun_re_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mun_re_renta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monterrey", "Guadalupe", "San Nicolás", "Escobedo", "Apodaca", "Juárez", "Cadereyta", "Santiago", "San Pedro", "Santa Catarina" }));
        mun_re_renta.setBorder(null);
        getContentPane().add(mun_re_renta);
        mun_re_renta.setBounds(100, 590, 115, 20);

        CP_re_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CP_re_renta.setBorder(null);
        CP_re_renta.setPreferredSize(new java.awt.Dimension(10, 21));
        getContentPane().add(CP_re_renta);
        CP_re_renta.setBounds(310, 560, 114, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Municipio:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 590, 73, 20);

        cyn_re_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cyn_re_renta.setBorder(null);
        cyn_re_renta.setPreferredSize(new java.awt.Dimension(10, 21));
        cyn_re_renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyn_re_rentaActionPerformed(evt);
            }
        });
        getContentPane().add(cyn_re_renta);
        cyn_re_renta.setBounds(130, 530, 289, 20);

        jlabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlabel2.setText("Colonia:");
        getContentPane().add(jlabel2);
        jlabel2.setBounds(20, 560, 57, 20);

        col_re_renta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        col_re_renta.setBorder(null);
        col_re_renta.setPreferredSize(new java.awt.Dimension(10, 21));
        getContentPane().add(col_re_renta);
        col_re_renta.setBounds(80, 560, 191, 20);

        JLABEL1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLABEL1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        JLABEL1.setText("CP:");
        getContentPane().add(JLABEL1);
        JLABEL1.setBounds(280, 560, 23, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Calle y Número:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 530, 109, 20);

        ag_en.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ag_en.setLabel("Agencia");
        getContentPane().add(ag_en);
        ag_en.setBounds(20, 461, 82, 21);

        ag_re_renta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ag_re_renta.setLabel("Agencia");
        getContentPane().add(ag_re_renta);
        ag_re_renta.setBounds(20, 610, 82, 21);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void color_rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_rentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_color_rentaActionPerformed

    private void cyn_re_rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyn_re_rentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cyn_re_rentaActionPerformed

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
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new renta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JTextField CP_re_renta;
    private javax.swing.JTextField CP_renta;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel JLABEL;
    private javax.swing.JLabel JLABEL1;
    private javax.swing.JButton Realizar;
    private java.awt.Checkbox ag_en;
    private java.awt.Checkbox ag_re_renta;
    private com.toedter.components.JSpinField cant_v_renta;
    private javax.swing.JTextField col_en_renta;
    private javax.swing.JTextField col_re_renta;
    private javax.swing.JTextField color_renta;
    private javax.swing.JTextField cyn_en_renta;
    private javax.swing.JTextField cyn_re_renta;
    private com.toedter.calendar.JDateChooser f_fin_renta;
    private com.toedter.calendar.JDateChooser f_inicio_renta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JComboBox marca_renta;
    private com.toedter.calendar.JYearChooser modelo_renta;
    private javax.swing.JComboBox mun_re_renta;
    private javax.swing.JComboBox mun_renta;
    private javax.swing.JTextField numero_renta;
    private javax.swing.JTextField placas_renta;
    private javax.swing.JComboBox tipo_v_renta;
    // End of variables declaration//GEN-END:variables
}
