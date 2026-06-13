package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 82, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 65, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 80, 610, "Kanto", false)
        );

        List<Pokemon> equipoElite = pokemones.stream()
                .filter(p -> p.getPoderCombate() > 500)
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .toList();

        System.out.println("Equipo Élite (PC > 500):");
        equipoElite.stream()
                .forEach(p -> System.out.println(p.getNombre() + " (PC: " + p.getPoderCombate() + ")"));
    }
}