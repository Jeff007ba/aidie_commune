/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.service;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Ressourcemunicipale;
import com.tp.aidecommune.repository.RessourceMunicipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RessourceMunicipalService {

    @Autowired
    private RessourceMunicipalRepository ressourceMunicipaleRepository;

    public Ressourcemunicipale enregistrerRessourceMunicipale(Ressourcemunicipale ressourceMunicipale) {
        return ressourceMunicipaleRepository.save(ressourceMunicipale);
    }

    public Ressourcemunicipale trouverRessourceMunicipaleParId(Long id) {
        return ressourceMunicipaleRepository.findById(id).orElse(null);
    }

    // Ajoute d'autres méthodes de service ici
}
