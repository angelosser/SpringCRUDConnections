package ec1angelocortes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mallacurricular")
public class MallaCurricular{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private Integer ano;
	
	@OneToMany (mappedBy = "malla", cascade = {CascadeType.MERGE})
	private List<Curso> cursos = new ArrayList<>();
	
	@OneToOne
	private Universidad universidad;
	
	public MallaCurricular(Integer idMalla, Integer ano) {
		super();
		this.idMalla = idMalla;
		this.ano = ano;
	}

	public MallaCurricular() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdMalla() {
		return idMalla;
	}

	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	

}
