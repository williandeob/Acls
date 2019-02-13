/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itecbrazil.acls.service;

import com.itecbrazil.acls.model.Usuario;
import com.itecbrazil.acls.repository.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 *
 * @author Itec
 */
@Component
public class ImplementsUserDetailsServices implements UserDetailsService{

    @Autowired
    private UsuarioDao usuarioDao;
     
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findById(Integer.parseInt(login));
        if(usuario == null)
            throw new UsernameNotFoundException("Usuario não encontrado!");

        return usuario;
    }
    
}
