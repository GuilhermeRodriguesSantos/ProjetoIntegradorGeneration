package com.Mawe.ProjetoIntegrador.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Mawe.ProjetoIntegrador.model.Usuario;
import com.Mawe.ProjetoIntegrador.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImplements implements UserDetailsService{
	
private @Autowired UsuarioRepository repositoryUsuario;
	
	/**
	 * Nesta exceção, é trazida da classe Usuario, usada como parâmetro usuarioExistente,
	 um email. Se este usuário existir, é retornado o email; caso o contrário, é informado
	 que o email não existe
	 * 
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuario> usuarioExistente = repositoryUsuario.findByEmail(username);
		
		if(usuarioExistente.isPresent()) {
			return new UserDetailsImplements(usuarioExistente.get());
		}else {
			throw new UsernameNotFoundException(username + "Não existe");
		}
	}
}
