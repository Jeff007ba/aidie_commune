/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.aidecommune.service;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Demandecitoyenne;
import com.tp.aidecommune.repository.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DemandeService {

    @Autowired
    private DemandeRepository demandeRepository;

    public Demandecitoyenne enregistrerDemande(Demandecitoyenne demande) {
        return demandeRepository.save(demande);
    }

    /**
     *
     * @param id
     * @return
     */
    public Demandecitoyenne trouverDemandeParId(Long id) {
        return demandeRepository.findById(id).orElse(null);
    }

    // Ajoute d'autres méthodes de service ici
}
