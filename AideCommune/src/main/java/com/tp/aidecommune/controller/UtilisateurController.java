/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.controller;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Utilisateur;
import com.tp.aidecommune.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping
    public Utilisateur creerUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.creerUtilisateur(utilisateur);
    }

    @GetMapping("/{id}")
    public Utilisateur obtenirUtilisateurParId(@PathVariable Long id) {
        return utilisateurService.obtenirUtilisateurParId(id);
    }

    // Ajoute d'autres méthodes de contrôleur ici
}
