package main.dosw.semana_1.streams;

import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {

        List<Transaction> transactions = List.of(
                new Transaction("T001", 150.0, true),
                new Transaction("T002", 200.0, false),
                new Transaction("T003", 350.0, true),
                new Transaction("T004", 100.0, false),
                new Transaction("T005", 500.0, true)
        );

        boolean loteValido = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.isApproved());

        System.out.println("\n¿Existe alguna transacción no aprobada?: " + loteValido);
        System.out.println("¿Lote válido?: " + !loteValido);
    }
}