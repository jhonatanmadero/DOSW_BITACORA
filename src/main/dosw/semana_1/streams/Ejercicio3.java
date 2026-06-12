package main.dosw.semana_1.streams;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User(1, "Carlos", 25, true),
                new User(2, "Ana", 30, false),
                new User(3, "Pedro", 22, true),
                new User(4, "Maria", 28, true),
                new User(5, "Luis", 19, false)
        );

        List<String> sortedUsers = users.stream()
                .filter(User::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .toList();

        System.out.println("Usuarios activos: " + sortedUsers);
    }
}