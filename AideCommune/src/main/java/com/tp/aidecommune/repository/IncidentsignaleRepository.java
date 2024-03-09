/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.aidecommune.repository;

/**
 *
 * @author jeffb
 */
import com.tp.aidecommune.entity.Incidentsignale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentsignaleRepository extends JpaRepository<Incidentsignale, Long> {
}
