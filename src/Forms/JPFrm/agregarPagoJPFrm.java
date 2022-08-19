/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.JPFrm;

import Clases.Impuesto;
import Clases.scripts;
import Conexion.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class agregarPagoJPFrm extends javax.swing.JPanel {

    /**
     * Creates new form agregarPagoJPFrm
     */
    Conexion conn;
    scripts sc;
    Impuesto imp;
    ResultSet rs;
    SimpleDateFormat formato;
    Date fecha_actual;
    public agregarPagoJPFrm() {
        initComponents();
        conn = new Conexion();
        sc = new scripts();
        fecha_actual = new Date();
    }
    public void limpiar(){
        this.bono_input.setText("");
        this.carnet_input.setText("");
        this.salario_input.setText("");
        this.horasExtras_input.setText("");
        this.fecha_showInput.setText("");
        this.ISS_showInput.setText("");
        this.AFP_showInput.setText("");
        this.renta_showInput.setText("");
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
        carnet_input = new Helpers.TextField();
        salario_input = new Helpers.TextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fecha_showInput = new Helpers.TextField();
        ISS_showInput = new Helpers.TextField();
        AFP_showInput = new Helpers.TextField();
        renta_showInput = new Helpers.TextField();
        btn_limpiarDatos = new javax.swing.JButton();
        bono_input = new Helpers.TextField();
        horasExtras_input = new Helpers.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Realizar pago");

        carnet_input.setForeground(new java.awt.Color(102, 102, 102));
        carnet_input.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        carnet_input.setLabelText("Carnet");
        carnet_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                carnet_inputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carnet_inputKeyReleased(evt);
            }
        });

        salario_input.setEditable(false);
        salario_input.setForeground(new java.awt.Color(102, 102, 102));
        salario_input.setText("$ ");
        salario_input.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        salario_input.setLabelText("Salario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/btn_realizarPago.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/btn_realizarPagohover.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Informacion de pago");

        fecha_showInput.setForeground(new java.awt.Color(102, 102, 102));
        fecha_showInput.setEnabled(false);
        fecha_showInput.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        fecha_showInput.setLabelText("Fecha de pago");

        ISS_showInput.setForeground(new java.awt.Color(102, 102, 102));
        ISS_showInput.setEnabled(false);
        ISS_showInput.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ISS_showInput.setLabelText("ISS");

        AFP_showInput.setForeground(new java.awt.Color(102, 102, 102));
        AFP_showInput.setEnabled(false);
        AFP_showInput.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        AFP_showInput.setLabelText("AFP");

        renta_showInput.setForeground(new java.awt.Color(102, 102, 102));
        renta_showInput.setEnabled(false);
        renta_showInput.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        renta_showInput.setLabelText("Renta");

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

        bono_input.setForeground(new java.awt.Color(102, 102, 102));
        bono_input.setText("$ ");
        bono_input.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        bono_input.setLabelText("Bono");

        horasExtras_input.setForeground(new java.awt.Color(102, 102, 102));
        horasExtras_input.setText("$ ");
        horasExtras_input.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        horasExtras_input.setLabelText("Horas extras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carnet_input, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(fecha_showInput, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AFP_showInput, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bono_input, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ISS_showInput, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                    .addComponent(renta_showInput, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                    .addComponent(btn_limpiarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(horasExtras_input, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salario_input, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carnet_input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salario_input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasExtras_input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bono_input, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ISS_showInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_showInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renta_showInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AFP_showInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btn_limpiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            conn.Conexion();
            double salario_final = Double.parseDouble(this.salario_input.getText())+Double.parseDouble(this.bono_input.getText())+Double.parseDouble(this.horasExtras_input.getText());
            this.imp = new Impuesto(salario_final);
            this.imp.setNit(this.carnet_input.getText());
            this.imp.calculo_afp();
            this.imp.calculo_isss();
            this.imp.calculo_vacacion();
            this.imp.sueldo_sin_renta();

            if(this.imp.getSueldo_con_descuentos() >= 0.01 && this.imp.getSueldo_con_descuentos() <= 472){
                this.renta_showInput.setText(""+0);
            }
            else if(this.imp.getSueldo_con_descuentos() >= 472.01 && this.imp.getSueldo_con_descuentos() <= 895.24){
                this.imp.sueldo_2tramo();
                this.renta_showInput.setText(Double.toString(this.imp.getResul_genrl()));
            }
            else if(this.imp.getSueldo_con_descuentos() >= 895.25 && this.imp.getSueldo_con_descuentos() <= 2038.10){
                this.imp.sueldo_3tramo();
                this.renta_showInput.setText(Double.toString(this.imp.getResul_genrl()));
            }
            else if(this.imp.getSueldo_con_descuentos() >= 2038.11){
                this.imp.sueldo_4tramo();
                this.renta_showInput.setText(Double.toString(this.imp.getResul_genrl()));
            }

            int fecha = this.fecha_actual.getMonth()+1;
            JOptionPane.showMessageDialog(null, fecha);
            this.imp.setMes(this.string_meses(fecha));
            this.fecha_showInput.setText(this.imp.getMes());
            this.ISS_showInput.setText(""+this.imp.getResul_isss());
            this.AFP_showInput.setText(""+this.imp.getResul_afp());
            
            for (int i = 1; i < 13; i++) {
                this.imp.setMes(this.string_meses(i));
                this.conn.agregar_impuesto(this.sc.ingresar_impuesto(), imp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_limpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarDatosActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btn_limpiarDatosActionPerformed

    private void carnet_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carnet_inputKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                conn.Conexion();
                ResultSet rs = null;

                rs = conn.consulta_select(sc.extraer_sueldo(this.carnet_input.getText()));
                double sueldo = 0;

            while(rs.next()){
                sueldo = rs.getDouble(1);
            }
            if (sueldo > 0) {
                this.salario_input.setText(Double.toString(sueldo));
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe el empleado");
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(agregarPagoJPFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_carnet_inputKeyPressed

    private void carnet_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carnet_inputKeyReleased
        
    }//GEN-LAST:event_carnet_inputKeyReleased

    public String string_meses(int index){
        String mes = "";
        switch(index){
            
            case 1: mes = "Enero";
                break;
            case 2: mes = "Febrero";
                break;
            case 3: mes = "Marzo";
                break;
            case 4: mes = "Abril";
                break;
            case 5: mes = "Mayo";
                break;
            case 6: mes = "Junio";
                break;
            case 7: mes = "Julio";
                break;
            case 8: mes = "Agosto";
                break;
            case 9: mes = "Septiembre";
                break;
            case 10: mes = "Octubre";
                break;
            case 11: mes = "Noviembre";
                break;
            case 12: mes = "Diciembre";
                break;
        }
        return mes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Helpers.TextField AFP_showInput;
    private Helpers.TextField ISS_showInput;
    private Helpers.TextField bono_input;
    private javax.swing.JButton btn_limpiarDatos;
    private Helpers.TextField carnet_input;
    private Helpers.TextField fecha_showInput;
    private Helpers.TextField horasExtras_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Helpers.TextField renta_showInput;
    private Helpers.TextField salario_input;
    // End of variables declaration//GEN-END:variables
}
