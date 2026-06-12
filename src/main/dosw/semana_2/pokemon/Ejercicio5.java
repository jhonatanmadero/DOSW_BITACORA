package main.dosw.semana_2.pokemon;

import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {

        List<String[]> pokemones = List.of(
                new String[]{"Pikachu", "45"},
                new String[]{"Mewtwo", "88"},
                new String[]{"Dragonite", "82"},
                new String[]{"Squirtle", "38"},
                new String[]{"Mew", "85"},
                new String[]{"Charmander", "62"}
        );

        List<String> legendarios = pokemones.stream()
                .filter(p -> Integer.parseInt(p[1]) > 80)
                .map(p -> p[0])
                .toList();

        long cantidad = legendarios.stream().count();

        System.out.println("Pokémon con nivel > 80: " + cantidad);
        System.out.println(legendarios);
    }
}