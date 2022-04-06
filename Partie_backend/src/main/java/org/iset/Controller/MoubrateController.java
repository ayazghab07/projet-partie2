package org.iset.Controller;

import java.util.List;


import org.iset.Service.MoubrateService;

import org.iset.entities.Moubrate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoubrateController {
	@Autowired
	MoubrateService matchservice;
	
	public MoubrateController(MoubrateService matchservice) {
		super();
		this.matchservice = matchservice;
	}
	@GetMapping("/match")
	@CrossOrigin(origins = "http://localhost:4200")

	public List<Moubrate> getallFournisseur(){
		
		return (List<Moubrate>) matchservice.getAllMatch();
		
	}
	@PostMapping("/add-match")
	@CrossOrigin(origins = "http://localhost:4200")

	public Moubrate addFournisseur(@RequestBody Moubrate m)
	{
		return matchservice.addMatch(m);
		}
	@GetMapping("/match/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public Moubrate getFour(@PathVariable Long id )
	{
		return matchservice.getMatch(id);}
	
	@DeleteMapping("/supprim-fournisseur/{id}")
	@CrossOrigin(origins = "http://localhost:4200")

	public void supprimMatch(@PathVariable Long id)
	{
		matchservice.supprimMatch(id);
	}
	@PostMapping("modif/match")
	@CrossOrigin(origins = "http://localhost:4200")

	public Moubrate modifMatch(@RequestBody Moubrate m )
	{
		return matchservice.modifMatch(m);}
}
