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
@Table(name = "affectationincident")
@NamedQueries({
    @NamedQuery(name = "Affectationincident.findAll", query = "SELECT a FROM Affectationincident a"),
    @NamedQuery(name = "Affectationincident.findByIdAffectation", query = "SELECT a FROM Affectationincident a WHERE a.idAffectation = :idAffectation"),
    @NamedQuery(name = "Affectationincident.findByIdIncident", query = "SELECT a FROM Affectationincident a WHERE a.idIncident = :idIncident"),
    @NamedQuery(name = "Affectationincident.findByIdEquipe", query = "SELECT a FROM Affectationincident a WHERE a.idEquipe = :idEquipe"),
    @NamedQuery(name = "Affectationincident.findByDateAffectation", query = "SELECT a FROM Affectationincident a WHERE a.dateAffectation = :dateAffectation"),
    @NamedQuery(name = "Affectationincident.findByPriorite", query = "SELECT a FROM Affectationincident a WHERE a.priorite = :priorite")})
public class Affectationincident implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_affectation")
    private Integer idAffectation;
    @Basic(optional = false)
    @Column(name = "id_incident")
    private int idIncident;
    @Basic(optional = false)
    @Column(name = "id_equipe")
    private int idEquipe;
    @Column(name = "date_affectation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAffectation;
    @Column(name = "priorite")
    private Integer priorite;

    public Affectationincident() {
    }

    public Affectationincident(Integer idAffectation) {
        this.idAffectation = idAffectation;
    }

    public Affectationincident(Integer idAffectation, int idIncident, int idEquipe) {
        this.idAffectation = idAffectation;
        this.idIncident = idIncident;
        this.idEquipe = idEquipe;
    }

    public Integer getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(Integer idAffectation) {
        this.idAffectation = idAffectation;
    }

    public int getIdIncident() {
        return idIncident;
    }

    public void setIdIncident(int idIncident) {
        this.idIncident = idIncident;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Date getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public Integer getPriorite() {
        return priorite;
    }

    public void setPriorite(Integer priorite) {
        this.priorite = priorite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAffectation != null ? idAffectation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affectationincident)) {
            return false;
        }
        Affectationincident other = (Affectationincident) object;
        if ((this.idAffectation == null && other.idAffectation != null) || (this.idAffectation != null && !this.idAffectation.equals(other.idAffectation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tp.aidecommune.entity.Affectationincident[ idAffectation=" + idAffectation + " ]";
    }
    
}
