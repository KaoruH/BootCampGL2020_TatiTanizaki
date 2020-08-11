package com.globallogic.bootcamp.inyeccion.dependencias;

public class Playstation {
	
	public Playstation(Game game) {
		this.videogame = game;
		
	}
	
	private Game videogame;

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}
	
	public String askMyGame() {
		
		if(videogame != null) {
			
			return "El videojuego que estoy corriendo es: " + videogame.getTitle();
		}
		return "¡Estoy vacío!";
	}
	
	

}
