package tpe.oo.metropolis;

/**
 * Ein Interface für Individuen, die mit Gewerbesteuer besteuert werden.
 * @author Christopher Rotter
 *
 */
public interface IGewerbesteuerpflichtig extends ISteuerpflichtig
{
    /**
     * Der anzuwendende Steuersatz.
     */
    public static final float STEUERSATZ = 0.15f;

    /**
     * Berechnet die Abgaben für das jeweilige Individuum.
     * @return  Die zu entrichtende Gewerbesteuer.
     */
    public int gewerbesteuer();
}
