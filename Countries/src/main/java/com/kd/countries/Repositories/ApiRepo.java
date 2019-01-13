package com.kd.countries.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.countries.models.Countries;

@Repository
public interface ApiRepo extends CrudRepository<Countries, Long>{
//	@Query("SELECT c, t FROM Countries c JOIN c.Cities t")
//    List<Object[]> joincountriesAndcities();
    // Query 1
	@Query("SELECT c, l FROM Countries c JOIN c.Languages l where l.language=?1 ORDER By l.percentage DESC")
	List<Object[]> joincountriesAndlanguages(String lang);

	//Query 2
	@Query("SELECT c, COUNT(t) FROM Countries c JOIN c.Cities t Group by c.code order by count(t) desc")
	List<Object[]> joincountriesAndcities();
	
	//Query 3
	@Query("SELECT t from Countries c JOIN c.Cities t where t.population>500000 and c.name= ?1 order by t.population desc")
	List<Object[]> joincountriesAndcities(String count);

	//Query 4
	@Query("SELECT c, l from Countries c JOIN c.Languages l where l.percentage>89 order by l.percentage desc")
	List<Object[]> joincountriesAndlanguages();

	//Query 5
	@Query("Select c from Countries c where c.surfaceArea<501 and c.population>100000")
	List<Object[]> countriessurface();
	
	//Query 6
	@Query("Select c from Countries c where c.governmentForm=?1 and c.surfaceArea>200 and c.lifeExpectancy>75")
	List<Object[]> countriesGovForm(String cons);
	
	//Query 7
	@Query("Select c, t from Countries c JOIN c.Cities t where c.name=?1 and t.district=?2 and t.population>500000")
	List<Object[]> countriesAndcities(String cons, String dist);
	
	//Query 8
	@Query("Select c, count(c) from Countries c Group by c.region order by count(c) desc")
	List<Object[]> countriesRegion();
}
