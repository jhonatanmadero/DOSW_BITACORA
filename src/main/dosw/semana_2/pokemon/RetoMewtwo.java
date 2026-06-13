package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RetoMewtwo {
    public static void main(String[] args) {
        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(2L, "Mew", "Psíquico", 85, 650, "Kanto", true),
                new Pokemon(3L, "Lugia", "Psíquico", 90, 710, "Johto", true),
                new Pokemon(4L, "Ho-Oh", "Fuego", 88, 690, "Johto", true),
                new Pokemon(5L, "Rayquaza", "Dragón", 95, 780, "Hoenn", true),
                new Pokemon(6L, "Charizard", "Fuego", 80, 610, "Kanto", false),
                new Pokemon(7L, "Dragonite", "Dragón", 82, 530, "Kanto", false),
                new Pokemon(8L, "Kyogre", "Agua", 92, 750, "Hoenn", true),
                new Pokemon(9L, "Groudon", "Tierra", 90, 740, "Hoenn", true),
                new Pokemon(10L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false)
        );

        System.out.println("LIGA POKÉMON DOSW — INFORME LEGENDARIOS\n");

        Map<String, List<Pokemon>> legendariosPorRegion = pokemones.stream()
                .filter(Pokemon::isLegendario)
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .collect(Collectors.groupingBy(Pokemon::getRegion));

        legendariosPorRegion.forEach((region, lista) -> {
            double promedio = lista.stream()
                    .mapToDouble(Pokemon::getPoderCombate)
                    .reduce(0, Double::sum) / lista.size();

            List<String> nombres = lista.stream()
                    .map(Pokemon::getNombre)
                    .toList();

            System.out.println("Región: " + region);
            System.out.println("Legendarios: " + nombres);
            System.out.printf("Poder promedio: %.2f%n%n", promedio);
        });

        // Top 3 legendarios más fuertes
        System.out.println("TOP 3 LEGENDARIOS MÁS FUERTES ");
        pokemones.stream()
                .filter(Pokemon::isLegendario)
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .limit(3)
                .forEach(p -> System.out.println(p.getNombre() + " (PC: " + p.getPoderCombate() + ")"));
    }
}