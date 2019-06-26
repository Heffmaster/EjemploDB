/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodb;

import java.sql.*; 
/**
 *
 * @author FHERNADEZ
 */
public class EjemploDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        { 
            System.out.println("Se versiona 1.0.0.0001");    
            Insert();
            Update();
            Select();
            Delete();
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    }
    
    
    
    
    
    public static void Insert() 
    { 
        int  id = 1; 
        String email = "geeks@geeks.org"; 
          
        try
        { 

            Class.forName("oracle.jdbc.driver.OracleDriver"); 
              
            // Establishing Connection 
            Connection con = DriverManager.getConnection( 
             "jdbc:oracle:thin:@192.168.1.24:1521:oraslb", "lab_slbdesa", "lab_slbdesadba"); 
            Statement stmt = con.createStatement(); 
              
            // Inserting data in database 
            String q1 = "insert into TEMP_JENKINS values('" +id+ "','" +email+ "')"; 
            int x = stmt.executeUpdate(q1); 
            if (x > 0)             
                System.out.println("Se actualizó registro correctamente");             
            else            
                System.out.println("Falló la inserción"); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
    
    
    
    public static void Select() 
    { 
        int id =1;
        try
        { 
            // Establishing Connection 
            Connection con = DriverManager.getConnection( 
             "jdbc:oracle:thin:@192.168.1.24:1521:oraslb", "lab_slbdesa", "lab_slbdesadba"); 
            Statement stmt = con.createStatement(); 
              
            // SELECT query 
            String q1 = "select * from TEMP_JENKINS WHERE id = '" + id+"'"; 
            ResultSet rs = stmt.executeQuery(q1); 
            if (rs.next()) 
            { 
                System.out.println("Id : " + rs.getString(1)); 
                System.out.println("Descripcion:" + rs.getString(2)); 
            } 
            else
            { 
                System.out.println("No such user id is already registered"); 
            } 
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    }
    
    
    
    
    
    
    
    public static void Update() 
    { 
        int  id = 1; 
        String email = "geeks@geeks.org.UPDATE"; 
          
        try
        { 

            Class.forName("oracle.jdbc.driver.OracleDriver"); 
              
            // Establishing Connection 
            Connection con = DriverManager.getConnection( 
             "jdbc:oracle:thin:@192.168.1.24:1521:oraslb", "lab_slbdesa", "lab_slbdesadba"); 
            Statement stmt = con.createStatement(); 
              
          // Updating database 
            String q1 = "UPDATE TEMP_JENKINS set DESCRIPCION = '" + email +  
                    "' WHERE id = '" +id+ "'"; 
            int x = stmt.executeUpdate(q1); 
              
            if (x > 0)             
                System.out.println("Se actualizo correctamente");             
            else            
                System.out.println("Ocurrio un error"); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
    
    
    
    
       public static void Delete() 
    { 
          
        try
        { 

            Class.forName("oracle.jdbc.driver.OracleDriver"); 
              
            // Establishing Connection 
            Connection con = DriverManager.getConnection( 
             "jdbc:oracle:thin:@192.168.1.24:1521:oraslb", "lab_slbdesa", "lab_slbdesadba"); 
            Statement stmt = con.createStatement(); 
              
          // Updating database 
            String q1 = "Delete from  TEMP_JENKINS"; 
            int x = stmt.executeUpdate(q1); 
            if (x > 0)             
                System.out.println("Se eliminaron todos los registros");             
            else            
                System.out.println("No hay datos para eliminar"); 
             
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
    
    
    
    
    
    
}
