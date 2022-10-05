package ec1angelocortes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1angelocortes.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {

}
