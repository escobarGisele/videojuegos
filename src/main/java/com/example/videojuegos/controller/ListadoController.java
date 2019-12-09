
package com.example.videojuegos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.videojuegos.domain.Videojuego;
import com.example.videojuegos.service.VideojuegosService;

@Controller 
public class ListadoController {
	public final VideojuegosService videojuegosService;
	
    public ListadoController(VideojuegosService videojuegosService) {
		
		this.videojuegosService = videojuegosService;
	}

	@RequestMapping("/")
    public String ListarVideoJuegos(Model model){
    //busqueda de video juegos 
		List<Videojuego> destacados = videojuegosService.buscarDetacados();
		model.addAttribute("videojuegos", destacados);
    return "listado"; 
    }
}
