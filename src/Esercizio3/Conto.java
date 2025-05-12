package Esercizio3;

import java.util.Scanner;

public class Conto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoOnLine conto = new ContoOnLine("Silvia", 100.0, 50.0);

        while (true) {
            conto.stampaSaldo();
            System.out.print("Inserisci importo da prelevare (0 per uscire): ");
            double importo = scanner.nextDouble();
            if (importo == 0) break;

            try {
                conto.preleva(importo);
            } catch (BancaException e) {
                System.err.println("Errore: " + e.getMessage());
            }
        }
    }
}
