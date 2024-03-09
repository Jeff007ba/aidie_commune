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
@Table(name = "demandecitoyenne")
@NamedQueries({
    @NamedQuery(name = "Demandecitoyenne.findAll", query = "SELECT d FROM Demandecitoyenne d"),
    @NamedQuery(name = "Demandecitoyenne.findByIdDemande", query = "SELECT d FROM Demandecitoyenne d WHERE d.idDemande = :idDemande"),
    @NamedQuery(name = "Demandecitoyenne.findByIdUtilisateur", query = "SELECT d FROM Demandecitoyenne d WHERE d.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "Demandecitoyenne.findByDomaine", query = "SELECT d FROM Demandecitoyenne d WHERE d.domaine = :domaine"),
    @NamedQuery(name = "Demandecitoyenne.findByLocalisation", query = "SELECT d FROM Demandecitoyenne d WHERE d.localisation = :localisation"),
    @NamedQuery(name = "Demandecitoyenne.findByDateCreation", query = "SELECT d FROM Demandecitoyenne d WHERE d.dateCreation = :dateCreation"),
    @NamedQuery(name = "Demandecitoyenne.findByEtat", query = "SELECT d FROM Demandecitoyenne d WHERE d.etat = :etat")})
public class Demandecitoyenne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_demande")
    private Integer idDemande;
    @Basic(optional = false)
    @Column(name = "id_utilisateur")
    private int idUtilisateur;
    @Basic(optional = false)
    @Column(name = "domaine")
    private String domaine;
    @Basic(optional = false)
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "localisation")
    private String localisation;
    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Basic(optional = false)
    @Column(name = "etat")
    private String etat;

    public Demandecitoyenne() {
    }

    public Demandecitoyenne(Integer idDemande) {
        this.idDemande = idDemande;
    }

    public Demandecitoyenne(Integer idDemande, int idUtilisateur, String domaine, String description, String localisation, String etat) {
        this.idDemande = idDemande;
        this.idUtilisateur = idUtilisateur;
        this.domaine = domaine;
        this.description = description;
        this.localisation = localisation;
        this.etat = etat;
    }

    public Integer getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(Integer idDemande) {
        this.idDemande = idDemande;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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
        hash += (idDemande != null ? idDemande.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demandecitoyenne)) {
            return false;
        }
        Demandecitoyenne other = (Demandecitoyenne) object;
        if ((this.idDemande == null && other.idDemande != null) || (this.idDemande != null && !this.idDemande.equals(other.idDemande))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tp.aidecommune.entity.Demandecitoyenne[ idDemande=" + idDemande + " ]";
    }
    
}
