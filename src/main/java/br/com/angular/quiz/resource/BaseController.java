package br.com.angular.quiz.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javassist.NotFoundException;

public abstract class BaseController<Entity extends BaseEntity,
	Repository extends BaseRepository<Entity>,
	Service extends BaseService<Entity, Repository>> {
	
	@Autowired
	private Service service;
	
	@GetMapping // Shows all data
	public ResponseEntity<List<Entity>> index() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/{id}") // Shows one data
	public ResponseEntity<Entity> show(@PathVariable("id") Integer id)
		throws NotFoundException {
		return ResponseEntity.ok(service.getOne(id));
	}
	
	@PostMapping // Store data
	@Transactional
	public ResponseEntity<Entity> store(@Valid @RequestBody Entity entity) {
		return ResponseEntity.ok(service.store(entity));
	}
	
	@PutMapping("/{id}") // Update data
	@Transactional
	public ResponseEntity<Entity> update(@PathVariable Integer id,
			@Valid @RequestBody Entity entity)
			throws NotFoundException {
		return ResponseEntity.ok(service.update(id, entity));
	}
	
	@DeleteMapping("/{id}") // Delete data by id
	@Transactional
	public ResponseEntity<Entity> destroy(@PathVariable Integer id)
			throws NotFoundException {
		service.destroy(id);
		return ResponseEntity.noContent().build();
	}

}
