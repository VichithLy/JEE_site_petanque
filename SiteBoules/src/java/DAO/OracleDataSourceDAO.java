/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author p1700906
 */
public class OracleDataSourceDAO extends OracleDataSource {
    private static OracleDataSourceDAO ods;
    
    private OracleDataSourceDAO() throws SQLException
    {
        
    }
    public static OracleDataSourceDAO getOracleDataSourceDAO()
    {
        try
        {
            ods = new OracleDataSourceDAO();
            ods.setDriverType("thin");
            ods.setPortNumber(1521);
            ods.setServiceName("orcl.univ-lyon1.fr");
            ods.setUser("p1700906");
            ods.setPassword("294734");
            ods.setServerName("iutdoua-oracle.univ-lyon1.fr");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(OracleDataSourceDAO.class.getName()).log(Level.SEVERE,null, ex);
        }
        finally
        {
            
        }
            return ods;    
    }
    
}
