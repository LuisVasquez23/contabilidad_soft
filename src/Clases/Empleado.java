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
    protected String nombre;
    protected String cargo;
    protected String periodo_Pago;
    protected double sueldo;
    protected Date anio_contrato;
    protected String pago_Extra;

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

    public Date getAnio_contrato() {
        return anio_contrato;
    }

    public void setAnio_contrato(Date anio_contrato) {
        this.anio_contrato = anio_contrato;
    }
    
    public String getPago_Extra() {
        return pago_Extra;
    }

    public void setPago_Extra(String pago_Extra) {
        this.pago_Extra = pago_Extra;
    }
}
