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
import java.io.Serializable;

/**
 *
 * @author jeffb
 */
@Entity
@Table(name = "ressourcemunicipale")
@NamedQueries({
    @NamedQuery(name = "Ressourcemunicipale.findAll", query = "SELECT r FROM Ressourcemunicipale r"),
    @NamedQuery(name = "Ressourcemunicipale.findByIdRessource", query = "SELECT r FROM Ressourcemunicipale r WHERE r.idRessource = :idRessource"),
    @NamedQuery(name = "Ressourcemunicipale.findByNomRessource", query = "SELECT r FROM Ressourcemunicipale r WHERE r.nomRessource = :nomRessource"),
    @NamedQuery(name = "Ressourcemunicipale.findByTypeRessource", query = "SELECT r FROM Ressourcemunicipale r WHERE r.typeRessource = :typeRessource"),
    @NamedQuery(name = "Ressourcemunicipale.findByDisponibilite", query = "SELECT r FROM Ressourcemunicipale r WHERE r.disponibilite = :disponibilite")})
public class Ressourcemunicipale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ressource")
    private Integer idRessource;
    @Basic(optional = false)
    @Column(name = "nom_ressource")
    private String nomRessource;
    @Basic(optional = false)
    @Column(name = "type_ressource")
    private String typeRessource;
    @Basic(optional = false)
    @Column(name = "disponibilite")
    private String disponibilite;

    public Ressourcemunicipale() {
    }

    public Ressourcemunicipale(Integer idRessource) {
        this.idRessource = idRessource;
    }

    public Ressourcemunicipale(Integer idRessource, String nomRessource, String typeRessource, String disponibilite) {
        this.idRessource = idRessource;
        this.nomRessource = nomRessource;
        this.typeRessource = typeRessource;
        this.disponibilite = disponibilite;
    }

    public Integer getIdRessource() {
        return idRessource;
    }

    public void setIdRessource(Integer idRessource) {
        this.idRessource = idRessource;
    }

    public String getNomRessource() {
        return nomRessource;
    }

    public void setNomRessource(String nomRessource) {
        this.nomRessource = nomRessource;
    }

    public String getTypeRessource() {
        return typeRessource;
    }

    public void setTypeRessource(String typeRessource) {
        this.typeRessource = typeRessource;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRessource != null ? idRessource.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ressourcemunicipale)) {
            return false;
        }
        Ressourcemunicipale other = (Ressourcemunicipale) object;
        if ((this.idRessource == null && other.idRessource != null) || (this.idRessource != null && !this.idRessource.equals(other.idRessource))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tp.aidecommune.entity.Ressourcemunicipale[ idRessource=" + idRessource + " ]";
    }
    
}
