package ec1angelocortes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec1angelocortes.model.Universidad;
import ec1angelocortes.repo.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {

	@Autowired
	private UniversidadRepository repository;
	
	@Override
	@Transactional
	public void insert(Universidad universidad) {
		// TODO Auto-generated method stub
		repository.save(universidad);
	}

	@Override
	@Transactional
	public void update(Universidad univerisdad) {
		// TODO Auto-generated method stub
		repository.save(univerisdad);
	}

	@Override
	@Transactional
	public void delete(Integer universidadId) {
		// TODO Auto-generated method stub
		repository.deleteById(universidadId);
	}

	@Override
	@Transactional(readOnly = true)
	public Universidad findById(Integer universidadId) {
		// TODO Auto-generated method stub
		repository.findById(universidadId).orElse(null);
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Universidad> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
