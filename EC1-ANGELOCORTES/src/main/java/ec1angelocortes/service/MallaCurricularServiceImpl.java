package ec1angelocortes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec1angelocortes.model.MallaCurricular;
import ec1angelocortes.repo.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {
	
	@Autowired
	private MallaCurricularRepository repository;

	@Override
	@Transactional
	public void insert(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repository.save(malla);
	}

	@Override
	@Transactional
	public void update(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repository.save(malla);
	}

	@Override
	@Transactional
	public void delete(Integer mallaId) {
		// TODO Auto-generated method stub
		repository.deleteById(mallaId);
	}

	@Override
	@Transactional(readOnly = true)
	public MallaCurricular findById(Integer mallaId) {
		// TODO Auto-generated method stub
		repository.findById(mallaId).orElse(null);
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<MallaCurricular> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
