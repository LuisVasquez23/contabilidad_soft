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
    
    public String consult_constan_renta(){
        String query = "select em.nombre, sum(em.sueldo)as sueldo, sum(im.bono)as comision, (sum(em.sueldo) + sum(im.bono)) as ingreso, " +
                        "sum(im.sueldo_gravado)as gravado, sum(im.afp)as afp, sum(im.isss)as isss, sum(im.renta) as isr, " +
                        "(sum(im.afp) + sum(im.isss) + sum(im.renta)) as descuento, ((sum(em.sueldo) + sum(im.bono)) - (sum(im.afp) + sum(im.isss) + sum(im.renta))) as pagado " +
                        "from empleado em " +
                        "join impuesto im on em.NIT = em.NIT " +
                        "where em.NIT = ?;";
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
    //funciones de mario
}
