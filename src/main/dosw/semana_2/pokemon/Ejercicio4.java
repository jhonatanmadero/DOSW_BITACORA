package main.dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        List<String[]> pokemones = List.of(
                new String[]{"Pikachu", "45"},
                new String[]{"Charmander", "62"},
                new String[]{"Squirtle", "38"},
                new String[]{"Snorlax", "90"},
                new String[]{"Mewtwo", "88"}
        );

        String[] pokemonAlfa = pokemones.stream()
                .max(Comparator.comparingInt(p -> Integer.parseInt(p[1])))
                .orElseThrow();

        System.out.println("Pokémon Alfa: " + pokemonAlfa[0] + " (nivel " + pokemonAlfa[1] + ")");
    }
}