package com.samucabarr.customers_crud.services;


import com.samucabarr.customers_crud.dto.ClientDTO;
import com.samucabarr.customers_crud.entities.Client;
import com.samucabarr.customers_crud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServices {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO clientById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }
}
