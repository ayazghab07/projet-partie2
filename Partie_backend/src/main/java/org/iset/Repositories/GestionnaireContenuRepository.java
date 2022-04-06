package org.iset.Repositories;

import org.iset.entities.GestionnaireContenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GestionnaireContenuRepository extends JpaRepository<GestionnaireContenu, Long> {

}
