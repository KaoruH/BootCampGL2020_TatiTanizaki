package com.globallogic.bootcamp.inyeccion.dependencias;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){


    	Playstation playstation = new Playstation(new Game("Resident Evil"));
    	
    	System.out.println(playstation.askMyGame());
    	
    	playstation.setVideogame(new Game("Brawlhalla"));
    	
    	System.out.println(playstation.askMyGame());
    	
    	playstation = new Playstation(null);
    	
    	System.out.println(playstation.askMyGame());
        
    }
}
