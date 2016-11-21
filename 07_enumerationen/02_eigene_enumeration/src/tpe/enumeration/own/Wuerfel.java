package tpe.enumeration.own;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

    /** Würfel. */
    protected WuerfelTyp wuerfel;

    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    /**
     * Einen neuen Würfel anlegen.
     *
     * @param numSides Anzahl der Seiten des Würfels.
     */
    public Wuerfel(WuerfelTyp wuerfel) {
        this.wuerfel = wuerfel;
    }

    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    public int roll() {
        return rnd.nextInt(wuerfel.numSides()) + 1;
    }
}
