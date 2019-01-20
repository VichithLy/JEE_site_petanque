/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metierLogique;

import java.util.Date;

public class Match {
    
    private int id;
    private String nomMatch;
    private Date heureDebut;
    private Date heureFin;
    private String description;
    private String lieu;
    private String equipe1;
    private String equipe2;

    public Match(int id, String nomMatch, Date heureDebut, Date heureFin, String description, String lieu, String equipe1, String equipe2) {
        this.id = id;
        this.nomMatch = nomMatch;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.description = description;
        this.lieu = lieu;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomMatch() {
        return nomMatch;
    }

    public void setNomMatch(String nomMatch) {
        this.nomMatch = nomMatch;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }

    public String getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }
    
    

}

   