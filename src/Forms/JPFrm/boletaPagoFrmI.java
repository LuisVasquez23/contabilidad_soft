/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.JPFrm;

import Clases.*;
import Clases.scripts;
import Conexion.Conexion;
import java.sql.*;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author luis
 */
public class boletaPagoFrmI extends javax.swing.JPanel {

    Empleado empleado;
    ResultSet rs;
    Conexion conn;
    DefaultTableModel model;
    scripts sc;
    ArrayList<Impuesto> lim;
    Impuesto im;
    
    public boletaPagoFrmI() {
        initComponents();
        rs = null;
        conn = new Conexion();
        sc = new scripts();
        im = new Impuesto();
        lim = new ArrayList<>();
        model = new DefaultTableModel();
        this.btn_generarPDF.setEnabled(false);
    }
    
    public void limpiar(){
        this.model.setRowCount(0);
        this.nit_input.setText("");
        this.sueldo_Gravado_show.setText("");
        this.retencion_show.setText("");
        this.afp_show.setText("");
        this.isss_show.setText("");
        this.Sueldo_show.setText("");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nit_input = new Helpers.TextField();
        btn_buscarEmpleado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_limpiarDatos = new javax.swing.JButton();
        btn_generarPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        afp_show = new javax.swing.JLabel();
        sueldo_Gravado_show = new javax.swing.JLabel();
        isss_show = new javax.swing.JLabel();
        retencion_show = new javax.swing.JLabel();
        Sueldo_show = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setMaximumSize(new java.awt.Dimension(891, 604));
        setPreferredSize(new java.awt.Dimension(891, 604));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setText("Boleta de pago");

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

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Informacion del empleado");

        btn_limpiarDatos.setBackground(new java.awt.Color(255, 102, 102));
        btn_limpiarDatos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_limpiarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiarDatos.setText("Limpiar datos");
        btn_limpiarDatos.setBorder(null);
        btn_limpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarDatosActionPerformed(evt);
            }
        });

        btn_generarPDF.setBackground(new java.awt.Color(153, 153, 255));
        btn_generarPDF.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_generarPDF.setForeground(new java.awt.Color(255, 255, 255));
        btn_generarPDF.setText("Generar PDF");
        btn_generarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarPDFActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "mes", "gravado", "retencion", "afp", "isss", "sueldo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        afp_show.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        sueldo_Gravado_show.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        isss_show.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        isss_show.setToolTipText("");

        retencion_show.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Sueldo_show.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        total.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        total.setText("Total: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nit_input, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(btn_generarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(160, 160, 160)
                                .addComponent(btn_buscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_limpiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(627, 627, 627))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(sueldo_Gravado_show, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(retencion_show, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(afp_show, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isss_show, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sueldo_show, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nit_input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retencion_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afp_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isss_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sueldo_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldo_Gravado_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_generarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarEmpleadoActionPerformed
        if (this.nit_input.getText().length() == 17) {
            this.cargar_tabla(this.nit_input.getText());
        }
        else{
            JOptionPane.showMessageDialog(null, "Formato NIT incorrecto");
        }
    }//GEN-LAST:event_btn_buscarEmpleadoActionPerformed

    private void btn_limpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarDatosActionPerformed
        this.limpiar();
        this.btn_buscarEmpleado.setEnabled(true);
        this.btn_generarPDF.setEnabled(false);
    }//GEN-LAST:event_btn_limpiarDatosActionPerformed

    private void btn_generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarPDFActionPerformed
        int index = this.jTable1.getSelectedRow();
        String mes, nit;
        nit = this.nit_input.getText();
        if (index > -1) {
            if (nit.length() ==17) {
                mes = ((((DefaultTableModel)this.jTable1.getModel()).getValueAt(index, 1).toString()));
                this.genenrar_pdf(nit, mes);
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe ese empleado");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione un valor de la tabla");
        }
    }//GEN-LAST:event_btn_generarPDFActionPerformed

  
    //funcion para recibir los datos y cargar la bd
    
    public void cargar_tabla(String pnit){
        conn.Conexion();
       
        try {
            //declaracion de los campos de la tabla
            String[] nombreColum = {"#", "Mes", "Gravado", "Retencion mensual", "AFP", "ISSS", "Ingresos devengados"};
            model.setColumnIdentifiers(nombreColum);
            
            //Consulta y obtencion de datos 
            rs = conn.consulta_impuesto(sc.cosulta_impuesto(), pnit);
            double sum_renta = 0, sum_afp = 0, sum_isss = 0, sum_sueldo = 0, sum_gravado = 0;
            int id = 0;
            
            //Cargar la tabla y lista de la clase impuesto
            while (rs.next()) {
                id++;
                im.setMes(rs.getString(1));
                im.setSueldo_grava(rs.getDouble(2));
                im.setResul_genrl(rs.getDouble(3));
                im.setResul_afp(rs.getDouble(4));
                im.setResul_isss(rs.getDouble(5));
                im.setSueldo(rs.getDouble(6));
                
                sum_gravado = sum_gravado + im.getSueldo_grava();
                sum_renta = sum_renta + im.getResul_genrl();
                sum_afp = sum_afp + im.getResul_afp();
                sum_isss = sum_isss + im.getResul_isss();
                sum_sueldo = sum_sueldo + im.getSueldo();
                
                lim.add(im);
                model.addRow(new Object[]{id, im.getMes(), im.getSueldo_grava(), im.getResul_genrl(), im.getResul_afp(), im.getResul_isss(), im.getSueldo()});
            }
            
            //carga de los label que tendran los totales
            if (id == 0) {
                JOptionPane.showMessageDialog(null, "Error! empleado no existe");
            }
            else{
                this.sueldo_Gravado_show.setText(""+sum_gravado);
                this.retencion_show.setText(""+sum_renta);
                this.afp_show.setText(""+sum_afp);
                this.isss_show.setText(""+sum_isss);
                this.Sueldo_show.setText(""+sum_sueldo);
                this.btn_generarPDF.setEnabled(true);
            }
            
            
            this.jTable1.setModel(model);
            this.jTable1.setAutoResizeMode(this.jTable1.AUTO_RESIZE_ALL_COLUMNS);
            this.jTable1.setFillsViewportHeight(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }          
    }
    
    
    public void genenrar_pdf(String pnit, String pmes){
        conn.Conexion();        
        JasperReport reporte;
        
        try {
            Map parametro = new HashMap();
            parametro.put("pnit", pnit);
            parametro.put("pmes", pmes);
            
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reportBoletaPago.jasper"));
            
            JasperPrint printreport = JasperFillManager.fillReport(reporte, parametro, conn.conex);
            JasperViewer view = new JasperViewer(printreport, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sueldo_show;
    private javax.swing.JLabel afp_show;
    private javax.swing.JButton btn_buscarEmpleado;
    private javax.swing.JButton btn_generarPDF;
    private javax.swing.JButton btn_limpiarDatos;
    private javax.swing.JLabel isss_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private Helpers.TextField nit_input;
    private javax.swing.JLabel retencion_show;
    private javax.swing.JLabel sueldo_Gravado_show;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
