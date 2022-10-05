package ec1angelocortes.service;

import java.util.List;

import ec1angelocortes.model.Curso;


public interface CursoService {
	
	public abstract void insert(Curso curso);
	public abstract void update(Curso curso);
	public abstract void delete(Integer cursoId);
	public abstract Curso findById(Integer cursoId);
	public abstract List<Curso> findAll();

}
