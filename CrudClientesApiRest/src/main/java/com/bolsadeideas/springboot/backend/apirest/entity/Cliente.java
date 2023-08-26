/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolsadeideas.springboot.backend.apirest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 *
 * @author Franco
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "No puede estar vacio")
    @Size(min = 3, max = 12, message = "El tamaño tiene que ser entre 3 y 12")
    @Column(nullable=false)
    private String nombre;
    
    @NotEmpty(message = "No puede estar vacio")
    private String apellido;
    
    @NotEmpty(message = "No puede estar vacio")
    @Email(message = "no es una dirección de correo bien formada")
    @Column(nullable=false , unique = true)
    private String email;
    
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    
    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido, String email, Date createAt) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.createAt = createAt;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    
    private static final long serialVersionUID =1L;
}
