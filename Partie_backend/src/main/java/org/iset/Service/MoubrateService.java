package org.iset.Service;

import java.util.List;


import org.iset.Repositories.MoubrateRepository;
import org.iset.entities.Moubrate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoubrateService implements IMoubrate {
	@Autowired
	MoubrateRepository fouR;

	
	public MoubrateService(MoubrateRepository fouR) {
		super();
		this.fouR = fouR;
	}
	@Override
	public Moubrate addMatch(Moubrate e)
	{
		return fouR.save(e);
	}
	@Override
	public List<Moubrate> getAllMatch()
	{
		return fouR.findAll();
	}
	@Override
	public void supprimMatch(Long id)
	{
		fouR.deleteById(id);
	}
	@Override
	public Moubrate getMatch(Long id)
	{
		return fouR.findById(id).get();
	}
	@Override
	public Moubrate modifMatch(Moubrate e)
	{
		return fouR.save(e);
	}
}
