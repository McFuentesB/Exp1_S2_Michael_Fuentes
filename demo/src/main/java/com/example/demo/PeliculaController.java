package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController{
    private List<Pelicula> peliculas= new ArrayList <>();
    public PeliculaController(){
        peliculas.add(new Pelicula(id:1, titulo="Alien: Romulus",año=2024,director="Federico Alvarez",
        genero="thriller",sinopsis="Este thriller de ciencia ficción y terror vuelve a las raíces de la exitosa franquicia ALIEN: Mientras exploran en las profundidades de una estación espacial abandonada, un grupo de jóvenes colonizadores del espacio se encuentra cara a cara con la forma de vida más aterradora del universo."));
        peliculas.add(new Pelicula(id:2, titulo="Wathcmen",año=2009,director="Zack Snyder",
        genero="Ciencia Ficcion",sinopsis="Después de que si excolega es asesinado, un vigilante enmascarado descubre un plan para destruir a los superhéroes del mundo"));
        peliculas.add(new Pelicula(id:3, titulo="De noche con el diablo",año=2023,director="Cameron Cairnes",
        genero="Terror",sinopsis="Halloween de 1977. Jack, el presentador de un programa de televisión, entrevista a la superviviente del suicidio en masa de una secta satánica. Al hacerlo, libera a un demonio que convertirá su vida. y las de muchos otros, en una pesadilla."));
        peliculas.add(new Pelicula(id:4, titulo="Logan",año=2017,director="James Mangold",
        genero="Ciencia Ficción",sinopsis="Han pasado los años y los mutantes están en declive. Logam, débil y cansado, vive alejado de todos hasta que acepta una última misión de Charles Xavier: la de proteger a una joven especial, de nombre Laura Kinney pero conocida como X-23, la última esperanza de la raza mutante."));
        peliculas.add(new Pelicula(id:5, titulo="El joven Frankenstein",año=1974,director="Mel Brooks",
        genero="Comedia",sinopsis="El doctor Frankestein recibe de herencia de su abuelo un castillo en Transilvania. El viaja hasta allí, y lee el libro dejado por su antecesor sobre sus experiancias en reanimar muertos. El médico decide poner en práctica la teoría del abuelo."));
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas(){
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id){
        for (Pelicula pelicula: peliculas){
            if (pelicula.getId() == id){
                return pelicula
            }
        }

        return null;
    }
}