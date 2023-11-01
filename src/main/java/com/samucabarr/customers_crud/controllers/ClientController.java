package com.samucabarr.customers_crud.controllers;

import com.samucabarr.customers_crud.dto.ClientDTO;
import com.samucabarr.customers_crud.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientServices services;

    @GetMapping(value = "/{id}")
    public ClientDTO clientById(@PathVariable Long id) {
        return services.clientById(id);
    }
}
