package de.hfu;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepository;
import de.hfu.residents.service.BaseResidentService;
import de.hfu.residents.service.ResidentService;
import de.hfu.residents.service.ResidentServiceException;

/** 
 * JUnit Test for ResidentService
 */

public class ResidentServiceTest {
	
	@Test
	public void reposervicetest() throws ResidentServiceException {
		
		//ResidentRepository stub = new ResidentRepositoryStub();
		
		Date date = new Date(2019, 12, 3);
		
		Resident resident1 = new Resident("name1", "nachname", "straße1", "stadt", date);
		Resident resident2 = new Resident("name2", "nachname2", "straße2", "stadt2", date);

			
		List<Resident> bewohner = new ArrayList<>();
		bewohner.add(resident1);
		bewohner.add(resident2);
		
		
		Resident searchResident1 = new Resident("name1","","","",date);
		Resident searchResident2 = new Resident("name2","","","",date);
		Resident searchResident3 = new Resident("","","straße1","",date);
		
		
		
		
		ResidentRepository mock = createMock(ResidentRepository.class);

		expect(mock.getResidents()).andReturn(bewohner);
		//	expect(service.getFilteredResidentsList(searchResident2)).andReturn(suchergebnis2);
		//	expect(service.getFilteredResidentsList(searchResident1)).andReturn(suchergebnis3);
			
		
		replay(mock);
		
		BaseResidentService service = new BaseResidentService();
		service.setResidentRepository(mock);
		service.getFilteredResidentsList(searchResident1);
		
		verify(mock);
			
			
		
		
		//service.setResidentRepository(stub);
		

		
		// ------------------------------------------------------------
		
		/*List<Resident> suchergebnis1 = new ArrayList<>();
		List<Resident> suchergebnis2 = new ArrayList<>();
		List<Resident> suchergebnis3 = new ArrayList<>();
		suchergebnis1 = service.getFilteredResidentsList(searchResident1);
		suchergebnis2 = service.getFilteredResidentsList(searchResident2);
		suchergebnis3 = service.getFilteredResidentsList(searchResident3);*/
		
		
		
		/*assertThat(suchergebnis1.get(0).getGivenName(), equalTo("name1"));
		assertThat(suchergebnis1.get(1).getGivenName(), equalTo("name2"));*/

		// ------------------------------------------------------------
		
		/*List<Resident> suchergebnis2 = new ArrayList<>();
		suchergebnis2 = service.getFilteredResidentsList(searchResident2);
		
		assertThat(suchergebnis2.get(0).getGivenName(), equalTo("name1"));
	 	assertThat(suchergebnis2.size(), equalTo(1));*/
	
		
		// ------------------------------------------------------------
		
		/*List<Resident> suchergebnis3 = new ArrayList<>();
		suchergebnis3 = service.getFilteredResidentsList(searchResident3);
			
		assertThat(suchergebnis3.get(0).getGivenName(), equalTo("name1"));
		assertThat(suchergebnis3.size(), equalTo(1));*/
		
		
		// ------------------------------------------------------------
		
		/*try {
		Resident found = service.getUniqueResident(searchResident1);}
		catch(ResidentServiceException e) {System.out.println("caugth");}
		Resident found2 = service.getUniqueResident(searchResident2);
		assertThat(found2.getGivenName(), equalTo("name1"));
		Resident found3 = service.getUniqueResident(searchResident3);
		assertThat(found2.getGivenName(), equalTo("name1"));*/
		
		
	}

}
