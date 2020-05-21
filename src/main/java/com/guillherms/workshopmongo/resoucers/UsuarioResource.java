package com.guillherms.workshopmongo.resoucers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guillherms.workshopmongo.domain.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<List<Usuario>>findAll(){
		List<Usuario> list = new ArrayList<>();
		Usuario maria = new Usuario("1001", "Maria", "maria@gmail.com");
		Usuario alex = new Usuario("1002", "Alex", "alex@gmail.com");
		list.addAll(Arrays.asList(maria,alex));
		return ResponseEntity.ok().body(list);
	}

}
