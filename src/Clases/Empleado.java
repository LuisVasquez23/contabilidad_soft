/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author mario
 */
public class Empleado {
    private String Nit;
    private String nombre;
    private String cargo;
    private String periodo_Pago;
    private double Sueldo;
    private String fecha_contrato; 
    private ArrayList<Impuesto> limpuesto;
    
    

    public String getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(String fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public ArrayList<Impuesto> getLimpuesto() {
        return limpuesto;
    }

    public void setLimpuesto(ArrayList<Impuesto> limpuesto) {
        this.limpuesto = limpuesto;
    }

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
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }
}
