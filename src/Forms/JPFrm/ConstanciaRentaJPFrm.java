/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.JPFrm;

import Clases.*;
import java.sql.ResultSet;
import Conexion.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class ConstanciaRentaJPFrm extends javax.swing.JPanel {
   
    
    DefaultTableModel model;
    Conexion conn;
    ResultSet rs;
    scripts sc;
    public ConstanciaRentaJPFrm() {
        initComponents();
        model = new DefaultTableModel();
        conn = new Conexion();
        rs = null;
        sc = new scripts();
        this.btn_generarPDF.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nit_input = new Helpers.TextField();
        btn_buscarEmpleado = new javax.swing.JButton();
        label_title = new javax.swing.JLabel();
        btn_generarPDF = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Informacion del empleado");

        nit_input.setForeground(new java.awt.Color(102, 102, 102));
        nit_input.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nit_input.setLabelText("NIT");

        btn_buscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/btn_buscarEmpleado.png"))); // NOI18N
        btn_buscarEmpleado.setBorderPainted(false);
        btn_buscarEmpleado.setContentAreaFilled(false);
        btn_buscarEmpleado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/btn_buscarEmpleadohover.png"))); // NOI18N
        btn_buscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarEmpleadoActionPerformed(evt);
            }
        });

        label_title.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        label_title.setText("Constancia de la renta");

        btn_generarPDF.setBackground(new java.awt.Color(153, 153, 255));
        btn_generarPDF.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_generarPDF.setForeground(new java.awt.Color(255, 255, 255));
        btn_generarPDF.setText("Generar PDF");
        btn_generarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarPDFActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar datos");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Mes", "Remuneraciones gravadas", "Retencion mensual", "AFP", "ISS", "Ingresos devengados"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_generarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(233, 233, 233)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_title)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nit_input, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btn_buscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nit_input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarEmpleadoActionPerformed
        String nit = this.nit_input.getText();
        if (nit.length() == 17) {
            this.btn_buscarEmpleado.setEnabled(false);
            this.cargar_tabla(nit);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error en el nit");
        }
        
    }//GEN-LAST:event_btn_buscarEmpleadoActionPerformed

    private void btn_generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarPDFActionPerformed
        this.genenrar_pdf(this.nit_input.getText());
    }//GEN-LAST:event_btn_generarPDFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.btn_buscarEmpleado.setEnabled(true);
        this.btn_generarPDF.setEnabled(false);
        this.limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cargar_tabla(String pnit){
        conn.Conexion();
       
        try {
            //declaracion de los campos de la tabla
            String[] nombreColum = {"#", "Empleado", "Sueldo", "Comision", "Ingresos", "Sueldo gravado", "AFP", 
                                    "ISSS", "ISR", "total descuento", "Neto pagado"};
            model.setColumnIdentifiers(nombreColum);
            
            //Consulta y obtencion de datos 
            rs = conn.consulta_impuesto(sc.consult_constan_renta(), pnit);
            String nombre;
            double isr, afp, isss, sueldo, gravado, comision, total_Des, neto_pag, ingreso;
            int id = 0;
            
            //Cargar la tabla y lista de la clase impuesto
            while (rs.next()) {
                id++;
                nombre = rs.getString(1);
                sueldo = rs.getDouble(3);
                comision = rs.getDouble(4);
                ingreso = rs.getDouble(5);
                gravado = rs.getDouble(6);
                afp = rs.getDouble(7);
                isss = rs.getDouble(8);
                isr = rs.getDouble(9);
                total_Des = rs.getDouble(10);
                neto_pag = rs.getDouble(11);
                
                model.addRow(new Object[]{id, nombre, sueldo, comision, ingreso, gravado, afp, isss, isr, total_Des, neto_pag});
            }
            
            //carga de los label que tendran los totales
            if (id == 0) {
                JOptionPane.showMessageDialog(null, "Error! empleado no existe");
            }
            else{
                this.btn_generarPDF.setEnabled(true);
            }
            
            
            this.jTable1.setModel(model);
            this.jTable1.setAutoResizeMode(this.jTable1.AUTO_RESIZE_ALL_COLUMNS);
            this.jTable1.setFillsViewportHeight(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }          
    }
    
     public void genenrar_pdf(String pnit){
        conn.Conexion();        
        JasperReport reporte;
        String path = "src\\Reportes\\reportCons_Renta.jasper";
        
        try {
            Map parametro = new HashMap();
            parametro.put("pnit", pnit);
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint printreport = JasperFillManager.fillReport(reporte, parametro, conn.conex);
            JasperViewer view = new JasperViewer(printreport, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }
    public void limpiar(){
        this.model.setRowCount(0);
        this.nit_input.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarEmpleado;
    private javax.swing.JButton btn_generarPDF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_title;
    private Helpers.TextField nit_input;
    // End of variables declaration//GEN-END:variables
}
