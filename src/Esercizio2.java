import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci km percorsi: ");
        double km = scanner.nextDouble();
        System.out.print("Inserisci litri consumati: ");
        double litri = scanner.nextDouble();

        try {
            double consumo = km / litri;
            System.out.println("Km/litro: " + consumo);
        } catch (ArithmeticException e) {
            System.err.println("Errore: divisione per zero.");
        }
    }
}
