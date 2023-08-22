/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.bolsadeideas.springboot.backend.apirest.repository;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Franco
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
