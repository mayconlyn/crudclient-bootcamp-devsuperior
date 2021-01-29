package com.devsuperior.crudclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List <Client>> findAll(){
		List<Client> list = new ArrayList<>();
		
		list.add(new Client(1L, "Maycon Garcia", "08299999999", 2000.00, Instant.now(), 2));
		return ResponseEntity.ok().body(list);
	}

}
