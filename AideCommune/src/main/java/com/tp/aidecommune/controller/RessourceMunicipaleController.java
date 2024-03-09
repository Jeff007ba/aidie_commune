/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.controller;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Ressourcemunicipale;
import com.tp.aidecommune.service.RessourceMunicipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ressources-municipales")
public class RessourceMunicipaleController {

    @Autowired
    private RessourceMunicipalService ressourceMunicipaleService;

    @PostMapping("/")
    public Ressourcemunicipale enregistrerRessourceMunicipale(@RequestBody Ressourcemunicipale ressourceMunicipale) {
        return ressourceMunicipaleService.enregistrerRessourceMunicipale(ressourceMunicipale);
    }

    @GetMapping("/{id}")
    public Ressourcemunicipale trouverRessourceMunicipaleParId(@PathVariable Long id) {
        return ressourceMunicipaleService.trouverRessourceMunicipaleParId(id);
    }

    // Ajoute d'autres méthodes de contrôleur ici
}
