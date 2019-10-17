package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeAc2 {
	
	@RequestMapping(value = "/multiplo/{valor1}", method = RequestMethod.GET)
	public Integer somar(@PathVariable Integer valor1) {
		
		Integer resultado;
		Integer resposta;
		Integer v1 = 5;
		
		resposta = valor1 % v1;
		
		if (resposta == 0)
			
			resultado = (valor1 + 5);
		else
			resultado = -1 ;

		return resultado;
	}
}