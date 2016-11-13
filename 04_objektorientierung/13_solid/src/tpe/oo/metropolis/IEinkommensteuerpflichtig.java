package tpe.oo.metropolis;

/**
 * Ein Interface für Individuen, die mit Einkommensteuer besteuert werden.
 * @author Christopher Rotter
 *
 */
public interface IEinkommensteuerpflichtig extends ISteuerpflichtig
{
    /**
     * Der anzuwendende Steuersatz für Steuerklasse 1.
     */
    public static final float STEUERSATZ1 = 0.08f;

    /**
     * Der anzuwendende Steuersatz für Steuerklasse 2.
     */
    public static final float STEUERSATZ2 = 0.15f;

    /**
     * Der anzuwendende Steuersatz für Steuerklasse 3.
     */
    public static final float STEUERSATZ3 = 0.25f;

    /**
     * Der anzuwendende Steuersatz für Steuerklasse 4.
     */
    public static final float STEUERSATZ4 = 0.40f;

    /**
     * Berechnet die Abgaben für das jeweilige Individuum.
     * @return  Die zu entrichtende Einkommensteuer.
     */
    public int einkommensteuer();
}
