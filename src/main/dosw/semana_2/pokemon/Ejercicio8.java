package main.dosw.semana_2.pokemon;
import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {

        List<String[]> pokemones = List.of(
                new String[]{"Pikachu", "true"},
                new String[]{"Raichu", "false"},
                new String[]{"Charmander", "true"},
                new String[]{"Charizard", "false"},
                new String[]{"Squirtle", "true"},
                new String[]{"Blastoise", "false"}
        );

        List<String> listosParaEvolucionar = pokemones.stream()
                .filter(p -> Boolean.parseBoolean(p[1]))
                .map(p -> p[0])
                .toList();

        System.out.println("Listos para evolucionar: " + listosParaEvolucionar);
    }
}