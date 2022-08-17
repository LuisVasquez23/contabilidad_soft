package Conexion;

import Clases.Empleado;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conex;
    
    public void Conexion(){
        String url = "jdbc:sqlite:C:\\Users\\Alejandro\\Desktop\\3 año\\6 ciclo\\MAte\\contabilidad_soft\\Empleados.db";
        
        try {
            conex = DriverManager.getConnection(url);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }
    }
    public ResultSet consultar(String consulta) throws SQLException{
       Statement datos = this.conex.createStatement();
       return datos.executeQuery(consulta);
   }
   
   
    public void agregar(String script, Empleado empleado)
    {
        try {
            PreparedStatement pst = conex.prepareStatement(script);
        
            pst.setString(1,empleado.getNit());
            pst.setString(2, empleado.getNombre());
            pst.setString(3, empleado.getCargo());
            pst.setString(4, empleado.getPeriodo_Pago());
            pst.setDouble(5, empleado.getSueldo());
            pst.setString(6, empleado.getAnio_contrato());
            pst.setString(7, empleado.getMes_vac());
            //ejecutar el el comando de ingreso de datos
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }
}
