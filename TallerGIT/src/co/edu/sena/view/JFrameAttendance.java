/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.view;
import co.edu.sena.controller.EntradaController;
import co.edu.sena.controller.InformacionAprendizController;
import co.edu.sena.model.Entrada;
import co.edu.sena.model.Informacionaprendiz;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
/**
 *
 * @author Usuario
 */
public class JFrameAttendance extends javax.swing.JFrame {
    private EntradaController entradacontroller;
    private InformacionAprendizController informacionaprendizcontroller;
    private SimpleDateFormat simpleDateformat;
            
    /**
     * Creates new form JFrameAttendance
     */
   public JFrameAttendance() {
        initComponents();
        entradacontroller= new EntradaController();
        informacionaprendizcontroller = new InformacionAprendizController();
        filltable();
        
    }
public void filltable(){
     try {
        DefaultTableModel tablellegada = new DefaultTableModel();
              
        tablellegada.addColumn("cedulaaprendiz");
        tablellegada.addColumn("nombreaprendiz");
        tablellegada.addColumn("fichadeaprendiz");
        tablellegada.addColumn("nombredeficha");

        List<Informacionaprendiz> columna = informacionaprendizcontroller.findAll();
        String[] row = new String[5];
        for (Informacionaprendiz aprendiz : columna) {

            row[0]=String.valueOf(aprendiz.getCedulaaprendiz());
            row[1]=aprendiz.getNombreaprendiz();
            row[2]=String.valueOf(aprendiz.getFichaaprendiz());
            row[3]=aprendiz.getNombreficha();

            tablellegada.addRow(row);
            jTable2.setModel(tablellegada);   
        }
            
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
    public void clear()
    {
        
        jTextFieldcedula.setText("");
        jTextArea1.setText("");
        jTextFieldNameAprentiencer.setText("");
        jTextFieldDate1.setText("");
        jTextFieldNumberFile.setText("");
        jTextFieldNameFile.setText("");
       
    }
    public static Date parseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("AAAA-MM-DD");
        Date fechaDate= null;
        try {
            fechaDate=formato.parse(fecha);
        } catch (Exception e) {
            System.out.println(e);
        }
        return fechaDate;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonSearch = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelAttendence = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldcedula = new javax.swing.JTextField();
        jLabelObservation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelNameApretiencer = new javax.swing.JLabel();
        jLabelNameFile = new javax.swing.JLabel();
        jLabelNumberFile = new javax.swing.JLabel();
        jTextFieldNameAprentiencer = new javax.swing.JTextField();
        jTextFieldNameFile = new javax.swing.JTextField();
        jTextFieldNumberFile = new javax.swing.JTextField();
        jTextFieldDate1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButtonSearch.setText("Buscar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setForeground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabelAttendence.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelAttendence.setText("Registro de asistencia");

        jLabelID.setText("cedula");

        jLabelDate.setText("Fecha");

        jLabelObservation.setText("Observaciones");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabelNameApretiencer.setText("Nombre aprendiz");

        jLabelNameFile.setText("Nombre Ficha");

        jLabelNumberFile.setText("Numero Ficha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelObservation)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(100, 100, 100)
                        .addComponent(jLabelAttendence)
                        .addContainerGap(251, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelDate)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldcedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jTextFieldNameAprentiencer)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabelNameApretiencer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNameFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelNameFile, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNumberFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelNumberFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonSearch)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButtonSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelAttendence)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumberFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNameFile)
                    .addComponent(jLabelNameApretiencer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNameAprentiencer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNameFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumberFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDate)
                        .addComponent(jTextFieldDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObservation)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonExit))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 630, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int rowSelected= jTable2.getSelectedRow();
      //  jComboBox1.setSelectedIndex(String.valueOf(jTable2.getValueAt(rowSelected, 0)));
        jTextFieldNameAprentiencer.setText(String.valueOf(jTable2.getValueAt(rowSelected, 1)));
        jTextFieldNumberFile.setText(String.valueOf(jTable2.getValueAt(rowSelected, 2)));
        jTextFieldNameFile.setText(String.valueOf(jTable2.getValueAt(rowSelected, 3)));
        
        
        
        try {
            Entrada entrada = entradacontroller.find(rowSelected);
          //  jComboBox1.setSelectedItem(informacionaprendizcontroller.getCedulaaprendiz());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        try {

            Entrada entrada= new Entrada();
            
            //entrada.setNombreaprendiz();
            int cedula = Integer.parseInt(jTextFieldcedula.getText());
            Informacionaprendiz info = informacionaprendizcontroller.find(cedula);
            entrada.setCedulaaprendiz(info);
            entrada.setNombreaprendiz(jTextFieldNameAprentiencer.getText());
            entrada.setNombredeficha(jTextFieldNameFile.getText());
            entrada.setFichadeaprendiz(Integer.parseInt(jTextFieldNumberFile.getText()));
            entrada.setFecha(new Date());
            entrada.setObservacion(jTextArea1.getText());
            entradacontroller.insert(entrada);
            JOptionPane.showMessageDialog(rootPane, "ESTUDIANTE GUARDADO CORRECTAMENTE");
            clear();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed


        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        int cedula = Integer.parseInt(jTextFieldcedula.getText());
        Informacionaprendiz aprendiz;
        try {
            aprendiz = informacionaprendizcontroller.find(cedula);
            jTextFieldDate1.setText(String.valueOf(LocalDate.now()));
            jTextFieldNameAprentiencer.setText(aprendiz.getNombreaprendiz());
            jTextFieldNameFile.setText(aprendiz.getNombreficha());
            jTextFieldNumberFile.setText(String.valueOf(aprendiz.getFichaaprendiz()));
        } catch (Exception e) {
            
        }
       
    }//GEN-LAST:event_jButtonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabelAttendence;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNameApretiencer;
    private javax.swing.JLabel jLabelNameFile;
    private javax.swing.JLabel jLabelNumberFile;
    private javax.swing.JLabel jLabelObservation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldDate1;
    private javax.swing.JTextField jTextFieldNameAprentiencer;
    private javax.swing.JTextField jTextFieldNameFile;
    private javax.swing.JTextField jTextFieldNumberFile;
    private javax.swing.JTextField jTextFieldcedula;
    // End of variables declaration//GEN-END:variables
}
