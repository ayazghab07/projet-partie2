package org.iset.Service;

import java.util.List;

import org.iset.entities.GestionnaireContenu;

public interface IGestionnaireContenu {
	GestionnaireContenu addGestionnaireContenu(GestionnaireContenu l);
	List<GestionnaireContenu> getAllGestionnaireContenu();
	void supprimGestionnaireContenu(Long id);
	GestionnaireContenu getGestionnaireContenu(Long id);
	GestionnaireContenu modifGestionnaireContenu(GestionnaireContenu l);
}
