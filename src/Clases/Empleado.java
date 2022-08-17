/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Date;
/**
 *
 * @author mario
 */
public class Empleado {
    private String nit;
    private String nombre;
    private String cargo;
    private String periodo_Pago;
    private double sueldo;
    private String fecha_contrato;
    private String pago_Extra; 

    public String getMes_vac() {
        return mes_vac;
    }

    public void setMes_vac(String mes_vac) {
        this.mes_vac = mes_vac;
    }
    private String mes_vac;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPeriodo_Pago() {
        return periodo_Pago;
    }

    public void setPeriodo_Pago(String periodo_Pago) {
        this.periodo_Pago = periodo_Pago;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getfecha_contrato() {
        return fecha_contrato;
    }

    public void setfecha_contrato(String anio_contrato) {
        this.fecha_contrato = anio_contrato;
    }
    
    public String getPago_Extra() {
        return pago_Extra;
    }

    public void setPago_Extra(String pago_Extra) {
        this.pago_Extra = pago_Extra;
    }
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
