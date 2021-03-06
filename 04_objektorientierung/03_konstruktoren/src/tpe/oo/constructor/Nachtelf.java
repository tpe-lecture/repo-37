package tpe.oo.constructor;

/**
 * Nachtelf aus der Allianz.
 */
public class Nachtelf extends Wesen {

    /** Standardmäßige Stärke der Fähigkeit Naturwiderstand. */
    public static final int STANDARD_NATURWIDERSTAND = 5;

    /** Fähigkeit zum Widerstand gegen Naturmagie */
    private int naturwiderstand;

    public Nachtelf(String name)
    {
        super(name);
        naturwiderstand = STANDARD_NATURWIDERSTAND;
    }

    public Nachtelf(String name, int naturwiderstand)
    {
        this(name);
        this.naturwiderstand = naturwiderstand;
    }

    /**
     * Stärke des Naturwiderstandes.
     *
     * @return the naturwiderstand
     */
    public int getNaturwiderstand() {
        return naturwiderstand;
    }
}
