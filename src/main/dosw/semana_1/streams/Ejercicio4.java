package main.dosw.semana_1.streams;

import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User(1, "Carlos", 25, true),
                new User(2, "Ana", 30, false),
                new User(3, "Pedro", 16, true),
                new User(4, "Maria", 28, true),
                new User(5, "Luis", 15, false),
                new User(6, "Sofia", 22, true)
        );

        List<String> mayoresDeEdad = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();

        System.out.println("Personas mayores de edad: " + mayoresDeEdad);
    }
}