/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mario
 */
public class Impuesto extends Empleado{
    //variables y constantes de los impuesto
    private String Nit;
    private double afp;
    private double isss;
    private double afp_techo;
    private double isss_techo;
    private double resul_afp;
    private double resul_isss;
    private double sueldo;
    
    private double sueldo_con_descuentos;
    
    private double resu_vacacion;
    private double resu_aguinaldo;
    
    private double resul_genrl;
    private double bono;
    private double horas_extra;
    private String mes;
    
    private double sueldo_grava;
    
    
    
    //NOTA PARA LAS FUNCIONES: calcular cada vez que se ingrese una persona
    
    //inicializacion de constantes de iva e impuesto en formato de decimales
    public Impuesto(double psueldo) {
        this.afp = 0.0725;
        this.isss = .03;
        this.afp_techo = 510.76685;
        this.isss_techo = 30;
        this.sueldo = psueldo;
    }
    public Impuesto() {
        
    }
    
    //calculo del afp con su respectivo techo
    public void calculo_afp(){
       double total = 0;
       if (sueldo <= 7045.06) {
           total = sueldo * afp;
        }
        else{
            total = afp_techo;
        }
       resul_afp = total;
    }
    
    //calculo del isss con su respectivo techo
    public void calculo_isss(){
       double total = 0;
        if (sueldo <= 1000) {
           total = sueldo * isss;
        }
        else{
            total = isss_techo;
        }
        resul_isss = total;
    }
    
    //calculo del sueldo gravado (solo con los decuentos de afp e ISSS aplicados)
    public void sueldo_sin_renta(){
        double suma_impu, total;
        
        suma_impu = resul_afp + resul_isss;
        total = sueldo - suma_impu;
        sueldo_con_descuentos = total;
        resul_genrl = 0;
    }
    
    //evaluacion del tramo 2
    public void sueldo_2tramo(){
        //constantes
        double cons_cuoFija = 17.67, cons_porcen = .1, cons_sobre_exc = 472;
        //variables 
        double resta_sobreex, multi_porcentaje,total;
        
        resta_sobreex = sueldo_con_descuentos - cons_sobre_exc;
        multi_porcentaje = resta_sobreex * cons_porcen;
        total = multi_porcentaje + cons_cuoFija;
        resul_genrl = total;
    }
    
    //evaluacion del tramo 3
    public void sueldo_3tramo(){
        //constantes
        double cons_cuoFija = 60, cons_porcen = .2, cons_sobre_exc = 895.24;
        //variables 
        double resta_sobreex, multi_porcentaje,total;
        
        resta_sobreex = sueldo_con_descuentos - cons_sobre_exc;
        multi_porcentaje = resta_sobreex * cons_porcen;
        total = multi_porcentaje + cons_cuoFija;
        resul_genrl = total;
    }
    
    //evaluacion del tramo 4
    public void sueldo_4tramo(){
        //constantes
        double cons_cuoFija = 288.57, cons_porcen = .3, cons_sobre_exc = 2034.10;
        //variables 
        double resta_sobreex, multi_porcentaje,total;
        
        resta_sobreex = sueldo_con_descuentos - cons_sobre_exc;
        multi_porcentaje = resta_sobreex * cons_porcen;
        total = multi_porcentaje + cons_cuoFija;
        resul_genrl = total;
    }
    
    
    public void calculo_aguinaldo(int pdias){
        //declaracion de constante
        //constantes
        double mes = 12, dias = 30;
        //variables
        double producto, residuo;
        
        residuo = sueldo / dias;
        producto = residuo * pdias;
        resu_aguinaldo = producto;
        
    }
    
    public void calculo_vacacion(){
       double salario_quicenal,producto_porcen;
       salario_quicenal = sueldo / 2;
       producto_porcen = salario_quicenal * .3;
       resu_vacacion = producto_porcen;
   }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }
    
    public String get_Nit() {
        return Nit;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    
        
    public double getSueldo_con_descuentos() {
        return sueldo_con_descuentos;
    }

    public double getResu_vacacion() {
        return resu_vacacion;
    }

    public double getResu_aguinaldo() {
        return resu_aguinaldo;
    }

    public double getResul_afp() {
        return resul_afp;
    }

    public double getResul_isss() {
        return resul_isss;
    }

    public double getResul_genrl() {
        return resul_genrl;
    }

    public void setResul_genrl(double resul_genrl) {
        this.resul_genrl = resul_genrl;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(double horas_extra) {
        this.horas_extra = horas_extra;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setResu_vacacion(double resu_vacacion) {
        this.resu_vacacion = resu_vacacion;
    }

    public void setResu_aguinaldo(double resu_aguinaldo) {
        this.resu_aguinaldo = resu_aguinaldo;
    }
     public double getSueldo_grava() {
        return sueldo_grava;
    }

    public void setSueldo_grava(double sueldo_grava) {
        this.sueldo_grava = sueldo_grava;
    }
    
       public void setResul_afp(double resul_afp) {
        this.resul_afp = resul_afp;
    }

    public void setResul_isss(double resul_isss) {
        this.resul_isss = resul_isss;
    }
}
