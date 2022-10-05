package ec1angelocortes.service;

import java.util.List;

import ec1angelocortes.model.MallaCurricular;

public interface MallaCurricularService {
	
	public abstract void insert(MallaCurricular malla);
	public abstract void update(MallaCurricular malla);
	public abstract void delete(Integer mallaId);
	public abstract MallaCurricular findById(Integer mallaId);
	public abstract List<MallaCurricular> findAll();

}
