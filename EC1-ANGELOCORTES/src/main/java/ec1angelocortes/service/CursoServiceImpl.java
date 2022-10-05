package ec1angelocortes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec1angelocortes.model.Curso;
import ec1angelocortes.repo.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	@Override
	@Transactional
	public void insert(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);
	}

	@Override
	@Transactional
	public void update(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);
	}

	@Override
	@Transactional
	public void delete(Integer cursoId) {
		// TODO Auto-generated method stub
		repository.deleteById(cursoId);
	}

	@Override
	@Transactional(readOnly = true)
	public Curso findById(Integer cursoId) {
		// TODO Auto-generated method stub
		repository.findById(cursoId).orElse(null);
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
