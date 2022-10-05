package ec1angelocortes.service;

import java.util.List;

import ec1angelocortes.model.Universidad;

public interface UniversidadService {
	
	public abstract void insert(Universidad universidad);
	public abstract void update(Universidad univerisdad);
	public abstract void delete(Integer universidadId);
	public abstract Universidad findById(Integer universidadId);
	public abstract List<Universidad> findAll();
}
