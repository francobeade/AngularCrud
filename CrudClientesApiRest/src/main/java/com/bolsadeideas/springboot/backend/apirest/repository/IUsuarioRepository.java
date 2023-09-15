package com.bolsadeideas.springboot.backend.apirest.repository;

import com.bolsadeideas.springboot.backend.apirest.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long>{
   
	public Usuario findByUsername(String username);
	
    @Query("select u from Usuario u where u.username=?1")
    public Usuario findByUsername2(String username);
}
