package ec1angelocortes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1angelocortes.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
