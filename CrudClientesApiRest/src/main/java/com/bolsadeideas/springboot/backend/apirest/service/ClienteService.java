/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bolsadeideas.springboot.backend.apirest.service;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Franco
 */
public interface ClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
}
