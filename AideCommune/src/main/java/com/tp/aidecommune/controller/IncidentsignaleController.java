/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.controller;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Incidentsignale;
import com.tp.aidecommune.service.IncidentsignaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/incidents")
public class IncidentsignaleController {

    @Autowired
    private IncidentsignaleService incidentService;

    @PostMapping("/")
    public Incidentsignale enregistrerIncident(@RequestBody Incidentsignale incident) {
        return incidentService.enregistrerIncident(incident);
    }

    @GetMapping("/{id}")
    public Incidentsignale trouverIncidentParId(@PathVariable Long id) {
        return incidentService.trouverIncidentParId(id);
    }

    // Ajoute d'autres méthodes de contrôleur ici
}
