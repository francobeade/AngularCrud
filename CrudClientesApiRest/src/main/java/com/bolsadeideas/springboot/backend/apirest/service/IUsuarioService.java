package com.bolsadeideas.springboot.backend.apirest.service;

import com.bolsadeideas.springboot.backend.apirest.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
