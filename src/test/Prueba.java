/**
 * Segundo paso
 * @author Luis Encarnación, Carlos Vargas.
 */
package test;
import cnMySQL.MySQL;
import java.sql.Connection;
public class Prueba {   
    public static void main(String args []){
        try {
            Connection cn= MySQL.getInstance().getConnection();
            System.out.println("Conexion Establecida");
        }catch (Exception e){
            System.out.println("Error de conexion!!");
        }    
    }    
}
