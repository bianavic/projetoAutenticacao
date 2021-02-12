package com.piloto.autenticacao.controller;

import com.piloto.autenticacao.model.User;
import com.piloto.autenticacao.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class RegisterController {

    @Autowired
    private RegisterService service;

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, produces = {"application/json"})
    public ResponseEntity cadastro(@RequestBody User usuario){

        service.insert(usuario);

        return ResponseEntity.status(201).body("Usuário cadastrado");
    }
    
}
