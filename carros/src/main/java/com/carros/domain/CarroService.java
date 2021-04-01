package com.carros.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class CarroService {

	@Autowired
	private CarroRepository rep;
	
	// metodo que retorna toda a lista de carros
	public Iterable<Carro> getCarros() {
		return rep.findAll();
	}
	
	// metodo que retorna os carros por id
	public Optional<Carro> getCarroById(Long id) {
		return rep.findById(id);
	}
	
	// metodo que retorna os carros por tipo
	public Iterable<Carro> getCarroByTipo(String tipo) {
		return rep.findByTipo(tipo);		
	}

	
	// metodo que add um carro a base de dados	
	public Carro save(Carro carro) {
		return rep.save(carro);
	}

	// metodo que atualiza um carro na base de dados
	public Carro update(Carro carro, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro");
		
		// Busca o carro no banco de dados
		Optional<Carro> optional = getCarroById(id);
		if(optional.isPresent()) {
			Carro db = optional.get();
			// Copiar as propriedades
			db.setNome(carro.getNome());
			db.setTipo(carro.getTipo());
			System.out.println("Carro id: " + db.getId());
			
			// Atualiza o carro
			rep.save(db);

			return db;
		}
		else {
			throw new RuntimeException("Não foi possível atualizar o registro");
		}
	}

	// metodo que deleta um carro da base de dados
	public void delete(Long id) {
		Optional<Carro> carro = getCarroById(id);
		if(carro.isPresent()) {
			rep.deleteById(id);
		}
		
	}
}
