
package com.example.videojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class ListadoController {
    @RequestMapping("/")
    public String ListarVideoJuegos(){
    //buesqueda de video juegos 
    return "listado"; 
    }
}
