package coverage.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.example.model.Galaxy;
import coverage.example.model.Planet;
import coverage.example.model.Star;

class ApplicationTest {

	@Test
	void testMain() {
		Application.main(null);
		
	}
	
	@Test
	@DisplayName("Por los 100%")
	void testMainPorLos100() {
		
		Application application = new Application();
		
		assertNotNull(application);
	}

	@Test
	@DisplayName("Teste Planet 1")
	void testePlanet1(){

		Planet planet = new Planet();

		planet.setName("Pluto");

		assertEquals("Pluto", planet.getName());

	}

	@Test
	@DisplayName("Teste Planet 2")
	void testePlanet2(){

		Planet planet = new Planet();

		planet.setName("Pluto");

		assertEquals("Planet [name=Pluto]", planet.toString());

	}

	@Test
	@DisplayName("Teste Galaxy 1")
	void testeGalaxy1(){

		Galaxy galaxy = new Galaxy("Andromeda");

		assertNotNull(galaxy);

	}
	
	@Test
	@DisplayName("Teste Star 1")
	void testeStar1() {
		
		Star star = new Star();
		
		star.setName("Sol");
		
		assertEquals("Sol", star.getName());
		
	}
	
	@Test
	@DisplayName("Teste Star 2")
	void testeStar2() {
		
		Star star = new Star();
		
		star.setName("Sun");
		
		List<Planet> planets = new ArrayList<>();
		
		Planet planet = new Planet();
		
		planet.setName("Venus");
		
		planets.add(planet);
		
		planet = new Planet();
		
		planet.setName("Mars");
		
		planets.add(planet);
		
		star.setPlanets(planets);
		
		assertTrue(star.toString().equals("Star [name=" + star.getName() + ", planets=" + star.getPlanets() + "]"));
	}
	
	@Test
	@DisplayName("Teste Star 3")
	void testeStar3() {
		Star star = new Star();
		
		star.setColor("Blue");
		
		assertNotNull(star.getColor());
	}
	


}
