/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metierLogique;

/**
 *Résumé :
 * La classe utilisateur nous sert a crée des utilisateurs 
 * On peut également s'en servir afin de crée un utilisateur dans la base de donnée
 * 
 */
public class Utilisateur {
    private String identifiant;
    private String password;
    
    public Utilisateur()
    {
        
    }
    public Utilisateur(String user,String mdp)
    {
        this.identifiant = user;
        this.password = mdp;
    }
    /**
     * @return the identifiant
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
   
}
