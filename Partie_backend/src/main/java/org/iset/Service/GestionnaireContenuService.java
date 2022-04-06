package org.iset.Service;

import java.util.List;

import org.iset.Repositories.GestionnaireContenuRepository;
import org.iset.entities.GestionnaireContenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionnaireContenuService implements IGestionnaireContenu {
	@Autowired
	GestionnaireContenuRepository lgR;

	public GestionnaireContenuService(GestionnaireContenuRepository lgR) {
		super();
		this.lgR = lgR;
	}
	@Override
	public GestionnaireContenu addGestionnaireContenu(GestionnaireContenu l)
	{
		return lgR.save(l);
	}
	@Override
	public List<GestionnaireContenu> getAllGestionnaireContenu()
	{
		return lgR.findAll();
	}
	@Override
	public void supprimGestionnaireContenu(Long id)
	{
		lgR.deleteById(id);
	}
	@Override
	public GestionnaireContenu getGestionnaireContenu(Long id)
	{
		return lgR.findById(id).get();
	}
	@Override
	public GestionnaireContenu modifGestionnaireContenu(GestionnaireContenu l)
	{
		lgR.save(l);
		return l;
	}

}
