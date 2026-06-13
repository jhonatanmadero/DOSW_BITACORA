package main.dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio19 {
    public static void main(String[] args) {

        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Gary", 10, List.of(
                        new Pokemon(1L, "Mewtwo", "Psíquico", 88, 880, "Kanto", true),
                        new Pokemon(2L, "Dragonite", "Dragón", 82, 830, "Kanto", false),
                        new Pokemon(3L, "Gengar", "Fantasma", 65, 630, "Kanto", false)
                )),
                new Entrenador(2L, "Ash", 8, List.of(
                        new Pokemon(4L, "Pikachu", "Eléctrico", 45, 620, "Kanto", false),
                        new Pokemon(5L, "Charizard", "Fuego", 80, 610, "Kanto", false),
                        new Pokemon(6L, "Squirtle", "Agua", 38, 620, "Kanto", false)
                )),
                new Entrenador(3L, "Dawn", 7, List.of(
                        new Pokemon(7L, "Piplup", "Agua", 42, 750, "Sinnoh", false),
                        new Pokemon(8L, "Togekiss", "Hada", 70, 780, "Sinnoh", false),
                        new Pokemon(9L, "Mamoswine", "Hielo", 65, 570, "Sinnoh", false)
                )),
                new Entrenador(4L, "Brock", 6, List.of(
                        new Pokemon(10L, "Onix", "Roca", 60, 550, "Kanto", false),
                        new Pokemon(11L, "Geodude", "Roca", 45, 420, "Kanto", false),
                        new Pokemon(12L, "Steelix", "Acero", 70, 700, "Kanto", false)
                ))
        );

        AtomicInteger posicion = new AtomicInteger(1);

        entrenadores.stream()
                .sorted(Comparator
                        .<Entrenador>comparingInt(Entrenador::getMedallas).reversed()
                        .thenComparingDouble(e -> -e.getEquipo().stream()
                                .mapToDouble(Pokemon::getPoderCombate).sum())
                        .thenComparing(Entrenador::getNombre))
                .limit(3)
                .forEach(e -> {
                    double poderTotal = e.getEquipo().stream()
                            .mapToDouble(Pokemon::getPoderCombate)
                            .sum();
                    System.out.println("#" + posicion.getAndIncrement()
                            + " " + e.getNombre()
                            + " - " + e.getMedallas() + " medallas"
                            + ", PC: " + poderTotal);
                });
    }
}