package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;

public class Ejercicio17 {
    public static void main(String[] args) {
        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Ash", 8, List.of(
                        new Pokemon(1L, "Pikachu", "Eléctrico", 45, 620, "Kanto", false),
                        new Pokemon(2L, "Charizard", "Fuego", 80, 610, "Kanto", false),
                        new Pokemon(3L, "Squirtle", "Agua", 38, 620, "Kanto", false)
                )),
                new Entrenador(2L, "Gary", 10, List.of(
                        new Pokemon(4L, "Mewtwo", "Psíquico", 88, 880, "Kanto", true),
                        new Pokemon(5L, "Dragonite", "Dragón", 82, 830, "Kanto", false),
                        new Pokemon(6L, "Gengar", "Fantasma", 65, 630, "Kanto", false)
                )),
                new Entrenador(3L, "Brock", 6, List.of(
                        new Pokemon(7L, "Onix", "Roca", 60, 550, "Kanto", false),
                        new Pokemon(8L, "Geodude", "Roca", 45, 420, "Kanto", false),
                        new Pokemon(9L, "Steelix", "Acero", 70, 700, "Kanto", false)
                ))
        );
        Entrenador masPoderoso = entrenadores.stream()
                .max(Comparator.comparingDouble(e ->
                        e.getEquipo().stream()
                                .mapToDouble(Pokemon::getPoderCombate)
                                .sum()
                ))
                .orElseThrow();
        double poderTotal = masPoderoso.getEquipo().stream()
                .mapToDouble(Pokemon::getPoderCombate)
                .sum();
        System.out.println("Entrenador más poderoso: " + masPoderoso.getNombre());
        System.out.println("Poder acumulado del equipo: " + poderTotal);
    }
}