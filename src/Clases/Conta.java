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
        Empleado emple = new Empleado();
        ResultSet rs = null;
        
//        emple.setNit(JOptionPane.showInputDialog("Nit"));
//        emple.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
//        emple.setCargo(JOptionPane.showInputDialog("Ingrese el cargo"));
//        emple.setPeriodo_Pago(JOptionPane.showInputDialog("Ingrese el periodo"));
//        emple.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo")));
//        emple.setFecha_contrato(JOptionPane.showInputDialog("Ingrese el fecha"));
//        
//        conn.Conexion();
//        conn.agregar(scrip.mostrar_datos_empleado(), emple);
        
        String nit, nombre, cargo, peri, fecha;
        double sueldo;
        conn.Conexion();
        
        try {
            rs = conn.consultar(scrip.mostrar_datos_empleado());
            
            while (rs.next()) {
                nit = rs.getString(1);
                nombre = rs.getString(2);
                cargo = rs.getString(3);
                peri = rs.getString(4);
                sueldo = rs.getDouble(5);
                fecha = rs.getString(6);
                JOptionPane.showMessageDialog(null, nit+" "+nombre+" "+cargo+" "+peri+" "+sueldo+" "+fecha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
//        
    }
}
