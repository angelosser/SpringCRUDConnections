package ec1angelocortes.service;

import java.util.List;

import ec1angelocortes.model.Profesor;

public interface ProfesorService {
	
	public abstract void insert(Profesor profesor);
	public abstract void update(Profesor profesor);
	public abstract void delete(Integer profesorId);
	public abstract Profesor findById(Integer profesorId);
	public abstract List<Profesor> findAll();

}
