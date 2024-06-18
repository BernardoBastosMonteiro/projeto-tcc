/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Senai
 */
public class Conexao {
    private static final String url = "jdbc:mysql://db4free.net:3306/eles_viageles?useSSL=false";
     private static final String usuario = "bernardo055";
     private static final String senha = "Lola@132";
     public static final String driver = "com.mysql.cj.jdbc.Driver";
     
     public static Connection conectar() throws SQLException{
         Connection conn = null;
         try {
             Class.forName(driver);
             conn = DriverManager.getConnection(url, usuario, senha);
            
         } catch (Exception e) {
             e.printStackTrace();
         }
     return conn;
     }
}
