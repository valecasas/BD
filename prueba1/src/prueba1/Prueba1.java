
package prueba1;
import java.sql.*;


public class Prueba1 {


    public static void main(String[] args) throws SQLException {
        
       try
       {Class.forName("com.mysql.cj.jdbc.Driver");} 
       catch 
               (Exception e){
                     e.printStackTrace();
                            } 
    
    
       // Establecemos la conexión con la base de datos.
       Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/prueba1","root", ""); 
    
    // Preparamos la consulta
    Statement s = conexion.createStatement();
    ResultSet rs = s.executeQuery ("select * from persona");
    
    
    // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
    while (rs.next()){
        System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getDate(3));
                     }
    
    
    // Cerramos la conexion a la base de datos.
    conexion.close();
    }
    
    
    }