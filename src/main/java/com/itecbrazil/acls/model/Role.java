/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itecbrazil.acls.model;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Itec
 */
public class Role implements GrantedAuthority{
    private int cdCtr;
    private String desc;

    public int getCdCtr() {
        return cdCtr;
    }

    public void setCdCtr(int cdCtr) {
        this.cdCtr = cdCtr;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    @Override
    public String getAuthority() {
        return desc;
    }
    
}
