package ec1angelocortes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1angelocortes.model.MallaCurricular;

@Repository
public interface MallaCurricularRepository extends JpaRepository<MallaCurricular, Integer>{

}
