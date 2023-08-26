/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.bolsadeideas.springboot.backend.apirest.repository;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Franco
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
