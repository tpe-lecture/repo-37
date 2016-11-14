package tpe.exceptions.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Ein simples Zahlenraten-Spiel.
 */
public final class Zahlenraten {

    /**
     * Liest einen String von der Tastatur.
     *
     * @return der gelesene String
     */
    private static String readNumber() {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String input = "";

        try
        {
            input = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return input;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumentes
     */
    public static void main(String[] args) {

        // zu ratende Zahl bestimmen
        int zahl = new Random().nextInt(100) + 1;

        int versuche = 0;
        int geraten;

        while (true) {
            System.out.print("Bitte geben Sie eine Zahl ein: ");

            while (true)
            {
                try
                {
                    geraten  = Integer.parseInt(readNumber());
                    break;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Ungültige Eingabe! Bitte eine Integer-Zahl eingeben:");
                }
            }

            versuche++;

            if (geraten < zahl) {
                System.out.println("Zu niedrig");
            }
            else if (geraten > zahl) {
                System.out.println("Zu hoch.");
            }
            else {
                System.out.printf("Richtig in %d Versuchen", versuche);
                break;
            }
        }
    }
}
