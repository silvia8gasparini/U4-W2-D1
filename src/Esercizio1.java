import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }

        while (true) {
            System.out.println(java.util.Arrays.toString(array));
            System.out.print("Inserisci numero (0 per uscire): ");
            int num = scanner.nextInt();
            if (num == 0) break;

            System.out.print("Inserisci posizione (0-4): ");
            int pos = scanner.nextInt();
            try {
                array[pos] = num;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Errore: posizione non valida.");
            }
        }
    }
}
