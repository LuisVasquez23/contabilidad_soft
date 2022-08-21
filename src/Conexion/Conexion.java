package Conexion;

import Clases.Empleado;
import Clases.Impuesto;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection conex= null;
    
    public void Conexion(){

        String pathDB = getClass().getResource("/DB/Empleados.db").toString().replace("build", "src").replace("/classes/", "/");
        
        String url = "jdbc:sqlite:" + pathDB;    
        
//        String ruta = "jdbc:sqlite:C:\\Users\\Alejandro\\Desktop\\3 año\\6 ciclo\\MAte\\contabilidad_soft\\src\\DB\\Empleados.db";

        try {
            conex = DriverManager.getConnection(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }
    }
    
    
    //fuciones de werner
    public ResultSet consultar(String consulta) throws SQLException{
       Statement datos = this.conex.createStatement();
       return datos.executeQuery(consulta);
    }
   
    //funcion para agg empleado
    public void agregar(String script, Empleado empleado) throws SQLException
    {
            PreparedStatement pst = conex.prepareStatement(script);
        
            pst.setString(1,empleado.getNit());
            pst.setString(2, empleado.getNombre());
            pst.setString(3, empleado.getCargo());
            pst.setString(4, empleado.getPeriodo_Pago());
            pst.setDouble(5, empleado.getSueldo());
            pst.setString(6, empleado.getFecha_contrato());
            pst.setString(7, empleado.getMes_vac());
            //ejecutar el el comando de ingreso de datos
            pst.execute();        
    }
    
    public ResultSet consulta_impuesto(String query, String pnit) throws SQLException{
        PreparedStatement pst = conex.prepareStatement(query);
        pst.setString(1, pnit);
        return pst.executeQuery();
    }
    
//    public ResultSet consulta_cons_Renta(String query, String pnit) throws SQLException{
//        PreparedStatement pst = conex.prepareStatement(query);
//        pst.setString(1, pnit);
//        return pst.executeQuery();
//    }
    
    //funciones de werner
    
    //funciones de mario
    public void agregar_impuesto(String script, Impuesto impuesto) throws SQLException
    {
            PreparedStatement pst = conex.prepareStatement(script);
        
            pst.setString(1,impuesto.get_Nit());
            pst.setString(2, impuesto.getMes());
            pst.setDouble(3, impuesto.getSueldo_con_descuentos());
            pst.setDouble(4, impuesto.getBono());
            pst.setDouble(5, impuesto.getHoras_extra());
            pst.setDouble(6, impuesto.getResul_isss());
            pst.setDouble(7, impuesto.getResul_afp());
            pst.setDouble(8, impuesto.getResul_genrl());
            pst.setDouble(9, impuesto.getResu_aguinaldo());
            //ejecutar el el comando de ingreso de datos
            pst.execute();             
    }
    
    public ResultSet consulta_select(String query) throws SQLException{
        PreparedStatement pst = conex.prepareStatement(query);
        return pst.executeQuery();
    }
    
    public ResultSet consulta_mes_vac(String query) throws SQLException{
        PreparedStatement pst = conex.prepareStatement(query);
        return pst.executeQuery();
    }
    
    public ResultSet consulta_fecha_cont(String query) throws SQLException{
        PreparedStatement pst = conex.prepareStatement(query);
        return pst.executeQuery();
    }
    //funciones de mario
}
