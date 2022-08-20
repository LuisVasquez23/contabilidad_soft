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
        String query = "select im.mes, im.sueldo_gravado, im.renta, im.afp, im.isss, (im.sueldo_gravado+im.afp+im.isss) as sueldo from empleado em " +
                        "join impuesto im on em.NIT = im.NIT " +
                        "where em.NIT = ?;";
        return query;
    }
    
////    public String cosulta_impuesto(){
////        String query = "select im.mes, im.sueldo_gravado, im.renta, im.afp, im.isss, (im.sueldo_gravado+im.afp+im.isss) as sueldo from empleado em" +
////                       "join impuesto im on em.NIT = im.NIT" +
////                       "where em.NIT = ?;";
////        return query;
////    }
    
    public String consult_constan_renta(){
        String query = "select em.nombre, em.NIT,  sum(em.sueldo)as sueldo, sum(im.bono)as comision, (sum(em.sueldo) + sum(im.bono)) as ingreso, " +
                        "round(sum(im.sueldo_gravado), 3)as gravado, sum(im.afp)as afp, sum(im.isss)as isss, sum(im.renta) as isr, " +
                        "round((sum(im.afp) + sum(im.isss) + sum(im.renta)),3) as descuento, round(((sum(em.sueldo) + sum(im.bono)) - (sum(im.afp) + sum(im.isss) + sum(im.renta))), 3) as pagado " +
                        "from empleado em " +
                        "join impuesto im on em.NIT = im.NIT " +
                        "where im.NIT = ?;";
        return query;
    }
    
    public String buscar_empleado(){
        String query = "select * from empleado where NIT = ?;";
        return query;
    }
    //funciones de werner
    
    //funciones de mario
    public String ingresar_impuesto(){
        String query = "insert into Impuesto(NIT, mes, sueldo_gravado, bono, horas_extras, isss, afp, renta)" +
                        "VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        return query;
    }
    
    public String extraer_sueldo(String pnit){
        String query = "select sueldo from empleado\n" +
                        "where NIT = '"+pnit+"';";
        return query;
    }
    
    public String mostrar_mes_vac(String pnit){
        String query = "Select Upper(mes_vac) from empleado\n" +
                        "where NIT = '"+pnit+"';";
        return query;
    } 
    
    public String mostrar_fecha_contrato(String pnit){
        String query = "select fecha_contrato from empleado\n" +
                       "Where NIT = '"+pnit+"';";
        return query;
    }
    //funciones de mario
}
