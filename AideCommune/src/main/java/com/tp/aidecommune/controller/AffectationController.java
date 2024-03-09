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
import com.tp.aidecommune.service.AffectationincidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/affectations")
public class AffectationController {

    @Autowired
    private AffectationincidentService affectationService;

    @PostMapping("/incident/{incidentId}/equipe/{equipeId}")
    public Incidentsignale affecterIncident(@PathVariable Long incidentId, @PathVariable Long equipeId) {
        return affectationService.affecterIncident(incidentId, equipeId);
    }

    // Ajoute d'autres méthodes de contrôleur ici
}
