package com.samucabarr.customers_crud.controllers;

import com.samucabarr.customers_crud.dto.ClientDTO;
import com.samucabarr.customers_crud.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientServices services;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> clientById(@PathVariable Long id) {
        ClientDTO dto = services.clientById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
        Page<ClientDTO> dto = services.findAll(pageable);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto) {
        return services.insert(dto);
    }

}
