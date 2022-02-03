package com.devsuperior.dsclient.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping	
	public ResponseEntity<List<Client>> findAll() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Hetel Santos", "03502690847", 5000.0, sdf.parse("27/08/1962").toInstant(), 1));
		list.add(new Client(2L, "Simone Diniz", "08931894805", 9000.0, sdf.parse("10/10/1965").toInstant(), 1));
		list.add(new Client(3L, "Gustavo Santos Diniz", "43148236823", 3000.0, sdf.parse("06/09/1996").toInstant(), 0));
		return ResponseEntity.ok().body(list);
	}
}
