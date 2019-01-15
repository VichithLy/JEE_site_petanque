/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metierLogique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBaseDonnee {
    
    public static Connection getConnexion() throws ClassNotFoundException, SQLException
            
    {
       String hostName = "iutdoua-oracle.univ-lyon1.fr";
       String sid = "orcl";
       String userName = "p1700906";
       String password = "294734";
       
       return getConnexion(hostName, sid, userName, password);
    }

    public static Connection getConnexion(String hostName, String sid,
           String userName, String password) throws ClassNotFoundException,
           SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
        Connection co =  DriverManager.getConnection(connectionURL, userName,
               password);
       return co;
    }
}
