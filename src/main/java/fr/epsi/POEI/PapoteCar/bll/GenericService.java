package fr.epsi.POEI.PapoteCar.bll;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public abstract class GenericService<REPO extends CrudRepository<T, Long>, T> {
	@Autowired
	protected REPO repository;
	
	@Transactional(rollbackOn = EntityNotFoundException.class)
	public void save(T thing){
		this.repository.save(thing);
	}
	
	@Transactional(rollbackOn = EntityNotFoundException.class)
	public List<T> findAll(){
		final List<T> thing = (List<T>)this.repository.findAll();
		if( thing == null ) {
			throw new EntityNotFoundException();
		}
		return thing;
	}
}
