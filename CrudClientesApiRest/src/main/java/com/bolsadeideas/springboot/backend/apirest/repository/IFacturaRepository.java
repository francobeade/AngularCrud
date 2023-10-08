package com.bolsadeideas.springboot.backend.apirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.entity.Factura;

public interface IFacturaRepository extends CrudRepository<Factura, Long> {

}
