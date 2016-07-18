/**
 * Primer paso
 * @author Luis Encarnación, Carlos Vargas.
 */
package cnMySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQL {

    /**
     * @return the instance
     */
    public static MySQL getInstance() throws Exception {
       if(instance==null){
       instance=new MySQL();
       }
        return instance;
    }
   private Connection connection=null;
   private static MySQL instance= null;
   
   public MySQL()throws Exception{
   String url  ="jdbc:mysql://localhost:3307/estacionamiento_utpl?zeroDateTimeBehavior=convertToNull";  
   Class.forName("com.mysql.jdbc.Driver");
   connection = DriverManager.getConnection(url,"root","root");//el usuario y
   
   }
    public Connection getConnection() {
        return connection;
    }
    
    @Override
    protected void finalize() throws Throwable{
    if(!connection.isClosed()){
    connection.close();
    connection=null;
    }
        super.finalize();
    
    }           
//Creacion de clases
    
    
}

