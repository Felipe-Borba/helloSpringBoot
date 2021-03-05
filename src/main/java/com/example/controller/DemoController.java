package com.example.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 1. Criar um serviço para adicionar pessoas (id, nome)
 * 2. Listar as pessoas
 * 3. Apagar as pessoas
 *
 * ## Aprender/Estudar
 *
 * 1. verbos HTTP (GET, POST)
 * 2. REST
 * 3. Adicionar o banco de dados em memoria na aplicação
 *
 *
 */

@RestController
public class DemoController {

    @RequestMapping(value = "/print/{msg}", method = RequestMethod.GET)
    public String print(@PathVariable(value = "msg") String message) {
        return "Hello " + message;
    }

}
