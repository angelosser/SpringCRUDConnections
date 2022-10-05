package ec1angelocortes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;
	private String descripcion;
	
	@ManyToOne 
	@JoinColumn(
			name ="id_Malla",
			nullable = false,
			unique = true,
			foreignKey =  @ForeignKey(foreignKeyDefinition = "foreign key (id_Malla) references mallacurricular(id_Malla)")

			)
	private MallaCurricular malla;
	
	@ManyToMany(mappedBy = "curso")
	private List<Profesor> profesor = new ArrayList<>();
	
	public Curso(Integer idCurso, String curso, String descripcion) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
	}

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
