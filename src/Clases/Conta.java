package Clases;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;
import Conexion.Conexion;

public class Conta {

    public static void main(String[] args) throws SQLException {
//        Impuesto empleado;
//        ArrayList<Impuesto> lempl = new ArrayList<>();
//        Date fecha = new Date();
//        
//        empleado = new Impuesto();
//        empleado.setNombre("Alejandro");
//        empleado.setCargo("Empleado");
//        empleado.setAnio_contrato(new Date(fecha.getDate()));
//        empleado.setSueldo(4000);
//        empleado.calculo_afp();
//        empleado.calculo_isss();
//        empleado.sueldo_sin_renta();
//        empleado.calculo_vacacion(15);
//        empleado.calculo_aguinaldo(19);
//        
//        lempl.add(empleado); 
//        
//        empleado = new Impuesto();
//        empleado.setNombre("mario");
//        empleado.setCargo("jefe");
//        empleado.setAnio_contrato(new Date(fecha.getTime()));
//        empleado.setSueldo(8000);
//        empleado.calculo_afp();
//        empleado.calculo_isss();
//        empleado.sueldo_sin_renta();
//        
//        lempl.add(empleado);
//       
//        System.out.println("nombre: "+lempl.get(0).getNombre());
//        System.out.println("cargo: "+lempl.get(0).getCargo());
//        System.out.println("Anio de contratacion: "+empleado.getAnio_contrato());
//        System.out.println("sueldo: "+lempl.get(0).getSueldo());
//        
//        //afp de las 2 posiciones
//        System.out.println("afp 1: "+ +lempl.get(0).getResul_afp());
//        System.out.println("afp 2: "+ +lempl.get(1).getResul_afp());
//        
//        //isss de las dos posiciones
//        System.out.println("isss 1: "+ +lempl.get(0).getResul_isss());
//        System.out.println("isss 2: "+lempl.get(1).getResul_isss());
//    
//        //sueldo gravado
//        System.out.println("calculo de sueldo gravado: "+lempl.get(0).getSueldo_noImpuesto());
//        System.out.println("calculo de sueldo gravado: "+lempl.get(1).getSueldo_noImpuesto());
//        System.out.println("calculo de vacacion "+lempl.get(0).getResu_vacacion());
//        System.out.println("calculo de la vacacion 2: "+lempl.get(1).getResu_vacacion());
//        System.out.println("calculo de aguinaldo: "+lempl.get(0).getResu_aguinaldo());
//        
//        
        Conexion conn = new Conexion();
        scripts scrip = new scripts();
        ResultSet rs = null;
        
        int id = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String cargo = JOptionPane.showInputDialog("Ingrese el cargo");
        String peri = JOptionPane.showInputDialog("Ingrese el periodo");
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo"));
        String fecha = JOptionPane.showInputDialog("Ingrese el fecha");
        
        try {
            rs = conn.consultar(scrip.mostrar_datos_empleado());
            while (rs.next()) {
                id = rs.getInt(1);
                nombre = rs.getString(2);
                cargo = rs.getString(3);
                peri = rs.getString(4);
                sueldo = rs.getDouble(5);
                fecha = rs.getString(6);
            }
            JOptionPane.showMessageDialog(null, id+" "+nombre+" "+cargo+" "+peri+" "+sueldo+" "+fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
//        
    }
}
