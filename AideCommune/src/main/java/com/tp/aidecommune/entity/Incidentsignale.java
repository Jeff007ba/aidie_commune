/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jeffb
 */
@Entity
@Table(name = "incidentsignale")
@NamedQueries({
    @NamedQuery(name = "Incidentsignale.findAll", query = "SELECT i FROM Incidentsignale i"),
    @NamedQuery(name = "Incidentsignale.findByIdIncident", query = "SELECT i FROM Incidentsignale i WHERE i.idIncident = :idIncident"),
    @NamedQuery(name = "Incidentsignale.findByIdUtilisateur", query = "SELECT i FROM Incidentsignale i WHERE i.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "Incidentsignale.findByLocalisation", query = "SELECT i FROM Incidentsignale i WHERE i.localisation = :localisation"),
    @NamedQuery(name = "Incidentsignale.findByDateSignalement", query = "SELECT i FROM Incidentsignale i WHERE i.dateSignalement = :dateSignalement"),
    @NamedQuery(name = "Incidentsignale.findByEtat", query = "SELECT i FROM Incidentsignale i WHERE i.etat = :etat")})
public class Incidentsignale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_incident")
    private Integer idIncident;
    @Basic(optional = false)
    @Column(name = "id_utilisateur")
    private int idUtilisateur;
    @Basic(optional = false)
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "localisation")
    private String localisation;
    @Column(name = "date_signalement")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSignalement;
    @Basic(optional = false)
    @Column(name = "etat")
    private String etat;

    public Incidentsignale() {
    }

    public Incidentsignale(Integer idIncident) {
        this.idIncident = idIncident;
    }

    public Incidentsignale(Integer idIncident, int idUtilisateur, String description, String localisation, String etat) {
        this.idIncident = idIncident;
        this.idUtilisateur = idUtilisateur;
        this.description = description;
        this.localisation = localisation;
        this.etat = etat;
    }

    public Integer getIdIncident() {
        return idIncident;
    }

    public void setIdIncident(Integer idIncident) {
        this.idIncident = idIncident;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Date getDateSignalement() {
        return dateSignalement;
    }

    public void setDateSignalement(Date dateSignalement) {
        this.dateSignalement = dateSignalement;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIncident != null ? idIncident.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Incidentsignale)) {
            return false;
        }
        Incidentsignale other = (Incidentsignale) object;
        if ((this.idIncident == null && other.idIncident != null) || (this.idIncident != null && !this.idIncident.equals(other.idIncident))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tp.aidecommune.entity.Incidentsignale[ idIncident=" + idIncident + " ]";
    }

    public void setEquipeMaintenance(Equipemaintenance equipeMaintenance) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
