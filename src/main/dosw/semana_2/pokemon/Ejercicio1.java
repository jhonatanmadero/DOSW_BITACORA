package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<String[]> pokemones = List.of(
                new String[]{"Pikachu", "Eléctrico"},
                new String[]{"Charmander", "Fuego"},
                new String[]{"Squirtle", "Agua"},
                new String[]{"Vulpix", "Fuego"},
                new String[]{"Bulbasaur", "Planta"},
                new String[]{"Flareon", "Fuego"}
        );

        List<String> tipoFuego = pokemones.stream()
                .filter(p -> p[1].equals("Fuego"))
                .map(p -> p[0])
                .toList();

        System.out.println("Pokémon tipo Fuego: " + tipoFuego);
    }
}