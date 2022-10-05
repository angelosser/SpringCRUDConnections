package ec1angelocortes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec1angelocortes.model.Profesor;
import ec1angelocortes.repo.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository repository;
	
	@Override
	@Transactional
	public void insert(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.save(profesor);
	}

	@Override
	@Transactional
	public void update(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.save(profesor);
	}

	@Override
	@Transactional
	public void delete(Integer profesorId) {
		// TODO Auto-generated method stub
		repository.deleteById(profesorId);
	}

	@Override
	@Transactional(readOnly = true)
	public Profesor findById(Integer profesorId) {
		// TODO Auto-generated method stub
		repository.findById(profesorId).orElse(null);
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Profesor> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
