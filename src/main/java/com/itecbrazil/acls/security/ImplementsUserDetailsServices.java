/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itecbrazil.acls.security;

import com.itecbrazil.acls.model.Usuario;
import com.itecbrazil.acls.repository.UsuarioDao;
import itec.security.auth.login.AuthScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Itec
 */
@Service
public class ImplementsUserDetailsServices implements UserDetailsService{

    @Autowired
    private UsuarioDao usuarioDao;
    
    @Autowired
    private AuthScope authScope;
     
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findById((int)authScope.getToken().get("cdUsu"));
        if(usuario == null)
            throw new UsernameNotFoundException("Usuario não encontrado!");

        return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), usuario.isAccountNonExpired(), usuario.isCredentialsNonExpired(), usuario.isAccountNonLocked(), usuario.getAuthorities());
    }
    
}
