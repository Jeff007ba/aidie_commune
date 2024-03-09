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
@Table(name = "equipemaintenance")
@NamedQueries({
    @NamedQuery(name = "Equipemaintenance.findAll", query = "SELECT e FROM Equipemaintenance e"),
    @NamedQuery(name = "Equipemaintenance.findByIdEquipe", query = "SELECT e FROM Equipemaintenance e WHERE e.idEquipe = :idEquipe"),
    @NamedQuery(name = "Equipemaintenance.findByNomEquipe", query = "SELECT e FROM Equipemaintenance e WHERE e.nomEquipe = :nomEquipe"),
    @NamedQuery(name = "Equipemaintenance.findByChefEquipe", query = "SELECT e FROM Equipemaintenance e WHERE e.chefEquipe = :chefEquipe")})
public class Equipemaintenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_equipe")
    private Integer idEquipe;
    @Basic(optional = false)
    @Column(name = "nom_equipe")
    private String nomEquipe;
    @Basic(optional = false)
    @Column(name = "chef_equipe")
    private String chefEquipe;

    public Equipemaintenance() {
    }

    public Equipemaintenance(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Equipemaintenance(Integer idEquipe, String nomEquipe, String chefEquipe) {
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
        this.chefEquipe = chefEquipe;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public String getChefEquipe() {
        return chefEquipe;
    }

    public void setChefEquipe(String chefEquipe) {
        this.chefEquipe = chefEquipe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipe != null ? idEquipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipemaintenance)) {
            return false;
        }
        Equipemaintenance other = (Equipemaintenance) object;
        if ((this.idEquipe == null && other.idEquipe != null) || (this.idEquipe != null && !this.idEquipe.equals(other.idEquipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tp.aidecommune.entity.Equipemaintenance[ idEquipe=" + idEquipe + " ]";
    }
    
}
