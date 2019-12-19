package de.hfu;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;

/**
 * @author Stefan Betermieux
 */
public class ResidentRepositoryStub implements ResidentRepository{

	Date date = new Date(2019, 12, 3);
  
	private Resident resident1 = new Resident("name1", "nachname", "straße1", "stadt", date);
	private Resident resident2 = new Resident("name2", "nachname2", "straße2", "stadt2", date);

	public List<Resident> getResidents(){
		
		List<Resident> bewohner = new ArrayList<>();
		bewohner.add(resident1);
		bewohner.add(resident2);
		
		return bewohner;
		
		
	}
}