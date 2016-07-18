/**
 * Tercer paso.
 * @author Luis Encarnación, Carlos Vargas.
 */
package dao;
import cnMySQL.MySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import to.EstacionamientoTO;
public class EstacionamientoDAO {
    public ResultSet cargaRegistros() throws Exception{           
    Connection cn= MySQL.getInstance().getConnection();
    String sql="select*from usuario";
    PreparedStatement ps= cn.prepareCall(sql);
    ResultSet rs = ps.executeQuery();
    return rs;
    }
    /*Con esta clase podremos crear nuevos estacionamientos.
    public void insert(EstacionamientoTO objEstacionamientoTO) throws Exception{
    Connection cn= MySQL.getInstance().getConnection();
    String sql="call sp_insert_estacionamiento(?,?)";
    CallableStatement cs;
    cs = cn.prepareCall(sql);
    cs.setString(1, objEstacionamientoTO.getNombusu());
    cs.setString(2, objEstacionamientoTO.getplacasusu());
    cs.execute();
        
    }
*/
public void ocupar(EstacionamientoTO ObjEstacionamientoTO) throws Exception{
Connection cn = MySQL.getInstance().getConnection();
String sql="call sp_ocupar_estacionamiento(?,?,?)";
    CallableStatement cs;
    cs = cn.prepareCall(sql);
    cs.setString(1, ObjEstacionamientoTO.getIdusu());
    cs.setString(2, ObjEstacionamientoTO.getNombusu());
    cs.setString(3, ObjEstacionamientoTO.getplacasusu());
    
    cs.execute();
        
    }
public void delete(EstacionamientoTO objEstacionamientoTO) throws Exception{
Connection cn = MySQL.getInstance().getConnection();
String sql = "call sp_delete_estacionamiento(?)";
CallableStatement cs= cn.prepareCall(sql);
cs.setString(1, objEstacionamientoTO.getIdusu());
cs.execute();   
}

public void moto(EstacionamientoTO objEstacionamientoTO) throws Exception{
Connection cn = MySQL.getInstance().getConnection();
String sql = "call sp_moto_estacionamiento(?)";
CallableStatement cs= cn.prepareCall(sql);
cs.setString(1, objEstacionamientoTO.getIdusu());
cs.execute();   
}
public void auto(EstacionamientoTO objEstacionamientoTO) throws Exception{
Connection cn = MySQL.getInstance().getConnection();
String sql = "call sp_auto_estacionamiento(?)";
CallableStatement cs= cn.prepareCall(sql);
cs.setString(1, objEstacionamientoTO.getIdusu());
cs.execute();   
}
public void maestro(EstacionamientoTO objEstacionamientoTO) throws Exception{
Connection cn = MySQL.getInstance().getConnection();
String sql = "call sp_maestro_estacionamiento(?)";
CallableStatement cs= cn.prepareCall(sql);
cs.setString(1, objEstacionamientoTO.getIdusu());
cs.execute();   
}
public void alumno(EstacionamientoTO objEstacionamientoTO) throws Exception{
Connection cn = MySQL.getInstance().getConnection();
String sql = "call sp_alumno_estacionamiento(?)";
CallableStatement cs= cn.prepareCall(sql);
cs.setString(1, objEstacionamientoTO.getIdusu());
cs.execute();   
}
public void discapacitado(EstacionamientoTO objEstacionamientoTO) throws Exception{
Connection cn = MySQL.getInstance().getConnection();
String sql = "call sp_discapacitado_estacionamiento(?)";
CallableStatement cs= cn.prepareCall(sql);
cs.setString(1, objEstacionamientoTO.getIdusu());
cs.execute();   
}

}