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

import ec1angelocortes.model.Profesor;
import ec1angelocortes.service.ProfesorService;

@RestController
@RequestMapping("/profesor/v1")
public class ProfesorController {
	
	@Autowired
	private ProfesorService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listar() {
		return new ResponseEntity<List<Profesor>>(service.findAll(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Profesor profesor) {
		service.insert(profesor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Profesor> obtenerPorId(@PathVariable Integer id) {

		Profesor profesor = service.findById(id);

		if (profesor != null) {
			return new ResponseEntity<Profesor>(profesor, HttpStatus.OK);
		} else {
			return new ResponseEntity<Profesor>(profesor, HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Profesor profesor) {
		Profesor p = service.findById(profesor.getIdProfesor());

		if (p != null) {
			service.update(profesor);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		Profesor profesor = service.findById(id);
		
		if (profesor != null) {
			service.delete(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}	
	}

}
