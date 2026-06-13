package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio18 {
    public static void main(String[] args) {

        List<Pokemon> pokemones = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 82, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 65, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 80, 610, "Kanto", false),
                new Pokemon(7L, "Bulbasaur", "Planta", 40, 280, "Kanto", false),
                new Pokemon(8L, "Snorlax", "Normal", 90, 450, "Kanto", false)
        );

        AtomicInteger posicion = new AtomicInteger(1);

        pokemones.stream()
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .limit(5)
                .forEach(p -> System.out.println("#" + posicion.getAndIncrement()
                        + " " + p.getNombre() + " - PC: " + p.getPoderCombate()));
    }
}