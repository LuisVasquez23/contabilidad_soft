package Clases;

import java.util.*;

public class Conta {

    public static void main(String[] args) {
        Impuesto empleado;
        ArrayList<Impuesto> lempl = new ArrayList<>();
        Date fecha = new Date();
        
        empleado = new Impuesto();
        empleado.setNombre("Alejandro");
        empleado.setCargo("Empleado");
        empleado.setAnio_contrato(new Date(fecha.getDate()));
        empleado.setSueldo(4000);
        empleado.calculo_afp();
        empleado.calculo_isss();
        empleado.sueldo_sin_renta();
        empleado.calculo_vacacion(15);
        empleado.calculo_aguinaldo(19);
        
        lempl.add(empleado); 
        
        empleado = new Impuesto();
        empleado.setNombre("mario");
        empleado.setCargo("jefe");
        empleado.setAnio_contrato(new Date(fecha.getTime()));
        empleado.setSueldo(8000);
        empleado.calculo_afp();
        empleado.calculo_isss();
        empleado.sueldo_sin_renta();
        
        lempl.add(empleado);
       
        System.out.println("nombre: "+lempl.get(0).getNombre());
        System.out.println("cargo: "+lempl.get(0).getCargo());
        System.out.println("Anio de contratacion: "+empleado.getAnio_contrato());
        System.out.println("sueldo: "+lempl.get(0).getSueldo());
        
        //afp de las 2 posiciones
        System.out.println("afp 1: "+ +lempl.get(0).getResul_afp());
        System.out.println("afp 2: "+ +lempl.get(1).getResul_afp());
        
        //isss de las dos posiciones
        System.out.println("isss 1: "+ +lempl.get(0).getResul_isss());
        System.out.println("isss 2: "+lempl.get(1).getResul_isss());
    
        //sueldo gravado
        System.out.println("calculo de sueldo gravado: "+lempl.get(0).getSueldo_noImpuesto());
        System.out.println("calculo de sueldo gravado: "+lempl.get(1).getSueldo_noImpuesto());
        System.out.println("calculo de vacacion "+lempl.get(0).getResu_vacacion());
        System.out.println("calculo de la vacacion 2: "+lempl.get(1).getResu_vacacion());
        System.out.println("calculo de aguinaldo: "+lempl.get(0).getResu_aguinaldo());
        
    }
}
