/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jeffb
 */

@Controller
public class CitoyenController {
    
    @GetMapping("/demande")
    public String showDemandeForm() {
        // Afficher le formulaire de soumission de demande
        return "demande-form";
    }

    @GetMapping("/incident")
    public String showIncidentForm() {
        // Afficher le formulaire de signalement d'incident
        return "incident-form";
    }

    // Autres méthodes pour gérer les demandes et incidents citoyens
}
