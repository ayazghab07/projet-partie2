package org.iset.Controller;

import java.util.List;

import org.iset.Service.GestionnaireContenuService;

import org.iset.entities.GestionnaireContenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionnaireContenuController {
	@Autowired
	GestionnaireContenuService logicielservice;
	
	
	public GestionnaireContenuController(GestionnaireContenuService logicielservice) {
		super();
		this.logicielservice = logicielservice;
	}
	@GetMapping("/logiciel")
	@CrossOrigin(origins = "http://localhost:4200")

	public List<GestionnaireContenu> getallGestionnaireContenu(){
		
		return (List<GestionnaireContenu>) logicielservice.getAllGestionnaireContenu() ;
		
	}
	@PostMapping("/add-logiciel")
	@CrossOrigin(origins = "http://localhost:4200")

	public GestionnaireContenu addLogiciel(@RequestBody GestionnaireContenu l)
	{
		return logicielservice.addGestionnaireContenu(l);
		}
	@GetMapping("/logiciel/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public GestionnaireContenu getLog(@PathVariable Long id )
	{
		return logicielservice.getGestionnaireContenu(id);}
	
	@DeleteMapping("/supprim-logiciel/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public void supprimLog(@PathVariable("id") Long id)
	{
		logicielservice.supprimGestionnaireContenu(id);
	}
	@PostMapping("modif/logiciel")
	@CrossOrigin(origins = "http://localhost:4200")

	public GestionnaireContenu modifLogiciel(@RequestBody GestionnaireContenu l)
	{
		return logicielservice.modifGestionnaireContenu(l);}
}
