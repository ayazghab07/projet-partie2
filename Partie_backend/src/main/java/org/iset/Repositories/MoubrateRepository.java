package org.iset.Repositories;

import org.iset.entities.Moubrate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MoubrateRepository extends JpaRepository<Moubrate, Long> {

}
