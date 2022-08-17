package Clases;


public class scripts {
    //query para el ingreso de datos
    public String ingresar_empleado(){
        String query = "insert into empleado(NIT, nombre, cargo, periodo_pago, sueldo, fecha_contrato, mes_vac) " +
                        "VALUES(?, ?, ?, ?, ?, ?, ?);";
        return query;
    }
    
    public String mostrar_datos_empleado(){
        String query = "select * from empleado;";
        return query;
    }
    public String consulta_id(){
        String id = "select count(*) as id from empleado;";
        return id;
    }
    
}
