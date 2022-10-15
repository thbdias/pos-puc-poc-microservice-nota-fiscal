package br.com.nota.fiscal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nota.fiscal.dto.NotaFiscalDTO;


@RestController
@RequestMapping
public class NotaFiscalController {
		
	
	@PostMapping("/emitir")
	public String emitirNfe(@RequestBody NotaFiscalDTO notaFiscalDTO) {
		int num = 1 + (int)(Math.random() * ((999 - 1) + 1));
		
		return "nota emitida (" + num + ")";
	}

}
