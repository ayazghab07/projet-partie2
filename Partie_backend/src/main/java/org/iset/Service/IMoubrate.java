package org.iset.Service;

import java.util.List;

import org.iset.entities.Moubrate;

public interface IMoubrate {
	Moubrate addMatch(Moubrate e);
	List<Moubrate> getAllMatch();
	void supprimMatch(Long id);
	Moubrate getMatch(Long id);
	 Moubrate modifMatch(Moubrate e);
}
