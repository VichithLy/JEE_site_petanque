/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metierLogique.*;
/**
 *
 * @author Sorrenti.J
 */
public class AccesDonnée {
    
    
    public static Utilisateur trouveUtilisateur(Connection co, //
            String identifiant, String password) throws SQLException {
 
        String sql = "Select a.identifiant, a.Password from User_Account a "
                + " where a.User_Name = ? and a.password= ?";
 
        PreparedStatement pstm = co.prepareStatement(sql);
        pstm.setString(1, identifiant);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            Utilisateur user = new Utilisateur();
            user.setIdentifiant(identifiant);
            user.setPassword(password);
            return user;
        }
        return null;
    }
    
    public static Utilisateur trouveUtilisateur(Connection co, String identifiant) throws SQLException {
 
        String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a "//
                + " where a.User_Name = ? ";
 
        PreparedStatement pstm = co.prepareStatement(sql);
        pstm.setString(1, identifiant);
 
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String password = rs.getString("Password");
            Utilisateur user = new Utilisateur();
            user.setIdentifiant(identifiant);
            user.setPassword(password);
            return user;
        }
        return null;
    }
 
}
