package com.carros.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carros.domain.Carro;
import com.carros.domain.CarroService;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
	
	// instanciando minha classe CarroService 
	@Autowired
	private CarroService service;
	
	// acionando o metodo para apresentar todos os carros
	@GetMapping()
	public Iterable<Carro> get() {
		return service.getCarros();
	}
	
	// acionando o metodo para apresentar os carros por id
	@GetMapping("/{id}")
	public Optional<Carro> get(@PathVariable("id") Long id) {
		return service.getCarroById(id);
	}

	// acionando o metodo para apresentar os carros por id
	@GetMapping("/tipo/{tipo}")
	public Iterable<Carro> getCarrosByTipo(@PathVariable("tipo") String tipo) {
		return service.getCarroByTipo(tipo);
	}	
	
	// adicionando um novo carro a base via POSTMAN
	@PostMapping
	public String post(@RequestBody Carro carro) {
		Carro c = service.save(carro);
		return "Carro salvo com sucesso: " + c.getId();
	}
	
	// atualizando um carro pelo Id via POSTMAN
	@PutMapping("/{id}")
	public String put(@PathVariable("id") Long id, @RequestBody Carro carro) {
		Carro c = service.update(carro, id);
		return "Carro atualizado com sucesso: " + c.getId();
	}
	
	// deletando um carro pelo Id via POSTMAN
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		service.delete(id);
		return "Carro deletado com sucesso";
	}
	
}
