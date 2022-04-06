package org.iset.Controller;

import java.util.List;

import org.iset.Service.ParieurService;
import org.iset.entities.Parieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ParieurController {
@Autowired
ParieurService parieurservice;

public ParieurController(ParieurService parieurservice) {
	super();
	this.parieurservice = parieurservice;
}
@GetMapping("/parieurs")


public List<Parieur> getallEtudiant(){
	
	return (List<Parieur>) parieurservice.getAllParieur();
	
}
@PostMapping("/add-parieur")


public Parieur addParieur(@RequestBody Parieur e)
{
	return parieurservice.addParieur(e);
	}
@GetMapping("/parieur/{id}")


public Parieur getParieur(@PathVariable Long id )
{
	return parieurservice.getParieur(id);}
@DeleteMapping("/supprim-parieur/{id}")


public void supprimParieur(@PathVariable("id") Long id)
{
	parieurservice.supprimParieur(id);
}
@PostMapping("/modif-parieur")


public Parieur modifParieur(@RequestBody Parieur e )
{
	return parieurservice.modifParieur(e);}
}


