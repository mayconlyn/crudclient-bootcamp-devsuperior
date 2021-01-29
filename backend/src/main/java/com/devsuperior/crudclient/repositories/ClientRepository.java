package com.devsuperior.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.crudclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
