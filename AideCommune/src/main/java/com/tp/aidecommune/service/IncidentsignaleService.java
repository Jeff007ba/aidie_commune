/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.service;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Incidentsignale;
import com.tp.aidecommune.repository.IncidentsignaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IncidentsignaleService {

    @Autowired
    private IncidentsignaleRepository incidentRepository;

    public Incidentsignale enregistrerIncident(Incidentsignale incident) {
        return incidentRepository.save(incident);
    }

    public Incidentsignale trouverIncidentParId(Long id) {
        return incidentRepository.findById(id).orElse(null);
    }

    // Ajoute d'autres méthodes de service ici
}

