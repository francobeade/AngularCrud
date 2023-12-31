package com.bolsadeideas.springboot.backend.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.backend.apirest.entity.Usuario;
import com.bolsadeideas.springboot.backend.apirest.service.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {

@Autowired
private IUsuarioService usuarioService;
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		
		Map<String, Object> info = new HashMap<>();
		info.put("info_adicional", "Hola que tal!".concat(authentication.getName()));
		info.put("nombre_usuario", usuario.getId() + ": " + usuario.getUsername());
		
		info.put("nombre", usuario.getId() + ": " + usuario.getNombre());
		info.put("apellido", usuario.getId() + ": " + usuario.getApellido());
		info.put("email", usuario.getId() + ": " + usuario.getEmail());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
