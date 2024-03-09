/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.controller;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Demandecitoyenne;
import com.tp.aidecommune.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demandes")
public class DemandeController {

    @Autowired
    private DemandeService demandeService;

    @PostMapping("/")
    public Demandecitoyenne enregistrerDemande(@RequestBody Demandecitoyenne demande) {
        return demandeService.enregistrerDemande(demande);
    }

    @GetMapping("/{id}")
    public Demandecitoyenne trouverDemandeParId(@PathVariable Long id) {
        return demandeService.trouverDemandeParId(id);
    }

    // Ajoute d'autres méthodes de contrôleur ici
}

