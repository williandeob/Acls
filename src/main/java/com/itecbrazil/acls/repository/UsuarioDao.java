/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itecbrazil.acls.repository;

import com.itecbrazil.acls.model.Usuario;

/**
 *
 * @author Itec
 */
public interface UsuarioDao {

    public Usuario findById(int cdUsu);
    
}
