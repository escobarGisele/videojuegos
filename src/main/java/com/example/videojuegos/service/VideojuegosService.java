package com.example.videojuegos.service;

import org.springframework.stereotype.Service;

import com.example.videojuegos.domain.Videojuego;

import java.util.ArrayList;
import java.util.List;
@Service

public class VideojuegosService {
    public List<Videojuego> buscarDetacados(){
    	List<Videojuego> destacados= new ArrayList<>();
    
    	Videojuego tetris= new Videojuego();
    	tetris.setNombre("tetris");
    	tetris.setDescripcion("es un juego de puzzles ");
    	//falta url 
    	destacados.add(tetris);
    	
    	Videojuego zelda= new Videojuego();
    	zelda.setNombre("zelda");
    	zelda.setDescripcion("juego de aventuras");
    	//falta url 
    	destacados.add(zelda);
    	
    	Videojuego needForSpeed= new Videojuego();
    	needForSpeed.setNombre("needForSpeed");
    	needForSpeed.setDescripcion("juego de aventuras");
    	//falta url de imagen
    	destacados.add(needForSpeed);
    	
    	Videojuego pokemon= new Videojuego();
    	pokemon.setNombre("pokemon");
    	pokemon.setDescripcion("juego de aventuras");
    	//falta url de imagen 
    	destacados.add(pokemon);
    	
		return destacados;
        
    }
}
