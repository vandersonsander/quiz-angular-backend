package br.com.angular.quiz.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import br.com.angular.quiz.util.Utils;

public abstract class BaseService
	<Entity extends BaseEntity,
	Repository extends BaseRepository<Entity>> {
	
	@Autowired
	protected Repository repository;
	
	public List<Entity> getAll() {
		return repository.findAll();
	}
	
	public Entity getOne(Integer id) {
		Optional<Entity> data = repository.findById(id);
		if (!data.isPresent())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Entidade não encontrada!");
		return data.get();
	}
	
	public Entity store(Entity entity) {
		try {
			return repository.save(entity);
		} catch (RuntimeException err) {
			throw new ResponseStatusException(HttpStatus.FORBIDDEN,
					"Erro ao cadastrar");
		}
	}
	
	public Entity update(Integer id, Entity entity) {
		Entity updateEntity = this.getOne(id);
		entity.setId(id);
		Utils.updateProperties(entity, updateEntity, true);
		return this.store(updateEntity);
	}
	
	public void destroy(Integer id) {
		Entity entity = this.getOne(id);
		repository.delete(entity);
	}

}
