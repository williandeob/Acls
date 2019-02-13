/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itecbrazil.acls.model;

import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Itec
 */
public class Usuario implements UserDetails{
    
    private int cdUsu;
    private String senha;
    private String login;
    private String nmUsu;
    
    private List<Role> roles;
    
    public int getCdUsu() {
        return this.cdUsu;
    }

    public void setCdUsu(int cdUsu) {
        this.cdUsu = cdUsu;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    public void setPassword(String senha) {
        this.senha = senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    public void setUsername(String login) {
        this.login = login;
    }
    
    public String getNmUsu() {
        return this.nmUsu;
    }

    public void setNmUsu(String nmUsu) {
        this.nmUsu = nmUsu;
    }
 
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    

}
