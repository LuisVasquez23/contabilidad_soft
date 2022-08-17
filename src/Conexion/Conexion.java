package Conexion;

import Clases.Empleado;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conex;
    
    public void Conexion(){

       String pathDB = getClass().getResource("/DB/Empleados.db").toString().replace("build", "src").replace("/classes/", "/");
        
        String url = "jdbc:sqlite:" + pathDB;        
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
   
   
    public void agregar(String script, Empleado empleado) throws SQLException
    {
            PreparedStatement pst = conex.prepareStatement(script);
        
            pst.setString(1,empleado.getNit());
            pst.setString(2, empleado.getNombre());
            pst.setString(3, empleado.getCargo());
            pst.setString(4, empleado.getPeriodo_Pago());
            pst.setDouble(5, empleado.getSueldo());
            pst.setString(6, empleado.getfecha_contrato());
            pst.setString(7, empleado.getMes_vac());
            //ejecutar el el comando de ingreso de datos
            pst.execute();        
    }
}
