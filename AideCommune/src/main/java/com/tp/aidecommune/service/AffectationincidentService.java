/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.service;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Equipemaintenance;
import com.tp.aidecommune.entity.Incidentsignale;
import com.tp.aidecommune.repository.EquipeMaintenanceRepository;
import com.tp.aidecommune.repository.IncidentsignaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AffectationincidentService {

    @Autowired
    private IncidentsignaleRepository incidentRepository;

    @Autowired
    private EquipeMaintenanceRepository equipeMaintenanceRepository;

    public Incidentsignale affecterIncident(Long incidentId, Long equipeMaintenanceId) {
        Incidentsignale incident = incidentRepository.findById(incidentId).orElse(null);
        Equipemaintenance equipeMaintenance = (Equipemaintenance) equipeMaintenanceRepository.findById(equipeMaintenanceId);

        if (incident != null && equipeMaintenance != null) {
            incident.setEquipeMaintenance(equipeMaintenance);
            return incidentRepository.save(incident);
        }

        return null;
    }

    // Ajoute d'autres méthodes de service ici
}
