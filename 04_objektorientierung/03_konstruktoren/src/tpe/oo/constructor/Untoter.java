package tpe.oo.constructor;

/**
 * Untoter aus der Horde.
 */
public class Untoter extends Wesen {

    /** Standardmäßige Stärke der Fähigkeit zur Unterwasseratmung. */
    public static final int STANDARD_UNTERWASSERATMUNG = 10;

    /** Fähigkeit zur Atmung unter Wasser. */
    private int unterwasseratmung;

    public Untoter(String name)
    {
        super(name);
        unterwasseratmung = STANDARD_UNTERWASSERATMUNG;
    }

    public Untoter(String name, int unterwasseratmung)
    {
        this(name);
        this.unterwasseratmung = unterwasseratmung;
    }

    /**
     * Fähigkeit zur Unterwasseratmnung.
     *
     * @return the Stärke der Fähigkeit.
     */
    public int getUnterwasseratmung() {
        return unterwasseratmung;
    }
}
