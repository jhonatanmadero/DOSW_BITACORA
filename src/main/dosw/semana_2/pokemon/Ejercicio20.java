package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio20 {
    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 82, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 65, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 80, 610, "Kanto", false),
                new Pokemon(7L, "Chikorita", "Planta", 40, 250, "Johto", false),
                new Pokemon(8L, "Mew", "Psíquico", 85, 650, "Kanto", true),
                new Pokemon(9L, "Totodile", "Agua", 38, 255, "Johto", false),
                new Pokemon(10L, "Vulpix", "Fuego", 35, 250, "Kanto", false)
        );

        // Por tipo
        Map<String, Long> porTipo = pokemones.stream()
                .collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting()));

        // Por región
        Map<String, Long> porRegion = pokemones.stream()
                .collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting()));

        // Cantidad de legendarios
        long legendarios = pokemones.stream()
                .filter(Pokemon::isLegendario)
                .count();

        // Promedio de nivel
        double promedioNivel = pokemones.stream()
                .mapToInt(Pokemon::getNivel)
                .average()
                .orElse(0);

        // Pokémon más fuerte
        Pokemon masFuerte = pokemones.stream()
                .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                .orElseThrow();

        System.out.println("Por tipo: " + porTipo);
        System.out.println("Por región: " + porRegion);
        System.out.println("Legendarios: " + legendarios);
        System.out.printf("Promedio niv: %.1f%n", promedioNivel);
        System.out.println("Más fuerte: " + masFuerte.getNombre() + " (PC: " + masFuerte.getPoderCombate() + ")");
    }
}