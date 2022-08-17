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
    private double afp;
    private double isss;
    private double afp_techo;
    private double isss_techo;
    private double resul_afp;
    private double resul_isss;
    private double sueldo;
    
    private double sueldo_noImpuesto;
    
    private double resu_2tramo;
    private double resu_3tramo;
    private double resu_4tramo;
    
    private double resu_vacacion;
    private double resu_aguinaldo;
    
    //NOTA PARA LAS FUNCIONES: calcular cada vez que se ingrese una persona
    
    //inicializacion de constantes de iva e impuesto en formato de decimales
    public Impuesto(double psueldo) {
        this.afp = 0.0725;
        this.isss = .03;
        this.afp_techo = 510.76685;
        this.isss_techo = 30;
        this.sueldo = psueldo;
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
        sueldo_noImpuesto = total;
    }
    
    
    
    //evaluacion del tramo 2
    public void sueldo_2tramo(){
        //constantes
        double cons_cuoFija = 17.67, cons_porcen = .1, cons_sobre_exc = 472;
        //variables 
        double resta_sobreex, multi_porcentaje,total;
        
        resta_sobreex = sueldo - cons_sobre_exc;
        multi_porcentaje = resta_sobreex * cons_porcen;
        total = multi_porcentaje + cons_cuoFija;
        resu_2tramo = total;
    }
    
    //evaluacion del tramo 3
    public void sueldo_3tramo(){
        //constantes
        double cons_cuoFija = 60, cons_porcen = .2, cons_sobre_exc = 895.24;
        //variables 
        double resta_sobreex, multi_porcentaje,total;
        
        resta_sobreex = sueldo - cons_sobre_exc;
        multi_porcentaje = resta_sobreex * cons_porcen;
        total = multi_porcentaje + cons_cuoFija;
        resu_3tramo = total;
    }
    
    //evaluacion del tramo 4
    public void sueldo_4tramo(){
        //constantes
        double cons_cuoFija = 288.57, cons_porcen = .3, cons_sobre_exc = 2034.10;
        //variables 
        double resta_sobreex, multi_porcentaje,total;
        
        resta_sobreex = sueldo - cons_sobre_exc;
        multi_porcentaje = resta_sobreex * cons_porcen;
        total = multi_porcentaje + cons_cuoFija;
        resu_4tramo = total;
    }
    
    
    public void calculo_aguinaldo(int pdias){
        //declaracion de constante
        double mes = 12, dias = 30;
        double producto, residuo, total;
        
        producto = sueldo * mes;
        residuo = producto / dias;
        total = residuo * pdias;
        resu_aguinaldo = total;
        
    }
    
    public void calculo_vacacion(int pDias){
       double total, salario_mensual, suma_sueldo;
       salario_mensual = sueldo / 30;
       total = salario_mensual * pDias;
       suma_sueldo = sueldo + total;
       resu_vacacion = suma_sueldo;
   }
    
    
    public double getSueldo_noImpuesto() {
        return sueldo_noImpuesto;
    }

    public double getResu_2tramo() {
        return resu_2tramo;
    }

    public double getResu_3tramo() {
        return resu_3tramo;
    }

    public double getResu_4tramo() {
        return resu_4tramo;
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
    
    
}
