/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itecbrazil.acls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Itec
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    
    @RequestMapping(method = RequestMethod.GET, path="/getNome")
    public String getNome() {
       return "Demo";
    }
}
