package ec1angelocortes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1angelocortes.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

}
