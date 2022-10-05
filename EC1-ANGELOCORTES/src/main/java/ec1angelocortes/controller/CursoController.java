package ec1angelocortes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec1angelocortes.model.Curso;
import ec1angelocortes.service.CursoService;

@RestController
@RequestMapping("/curso/v1")
public class CursoController {
	
	@Autowired
	private CursoService service;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Curso>> listar() {
		return new ResponseEntity<List<Curso>>(service.findAll(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Curso curso) {
		service.insert(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Curso> obtenerPorId(@PathVariable Integer id) {

		Curso curso = service.findById(id);

		if (curso != null) {
			return new ResponseEntity<Curso>(curso, HttpStatus.OK);
		} else {
			return new ResponseEntity<Curso>(curso, HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Curso curso) {
		Curso c = service.findById(curso.getIdCurso());

		if (c != null) {
			service.update(curso);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		Curso curso = service.findById(id);
		
		if (curso != null) {
			service.delete(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
