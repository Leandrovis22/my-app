/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Leandro.Repository;

import com.portfolio.Leandro.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Leandro
 */
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
    
}
