package Clases;


public class scripts {
    //query para el ingreso de datos 
    //funciones de werner
    public String ingresar_empleado(){
        String query = "insert into empleado(NIT, nombre, cargo, periodo_pago, sueldo, fecha_contrato, mes_vac) " +
                        "VALUES(?, ?, ?, ?, ?, ?, ?);";
        return query;
    }
    
    public String mostrar_datos_empleado(){
        String query = "select * from empleado;";
        return query;
    }
    
    public String cosulta_impuesto(){
        String query = "SELECT im.mes, ((em.sueldo+im.bono+im.horas_extras)-(im.isss + im.afp+im.renta)) as gravado, im.renta, im.afp, im.isss, em.sueldo from empleado em "+
                        "join impuesto im on em.NIT = im.NIT "+
                        "where em.NIT = ?";
        return query;
    }
    //funciones de werner
    
    //funciones de mario
    public String ingresar_impuesto(){
        String query = "insert into Impuesto(NIT, mes, sueldo_gravado, bono, horas_extras, isss, afp, renta)" +
                        "VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        return query;
    }
    //funciones de mario
}
