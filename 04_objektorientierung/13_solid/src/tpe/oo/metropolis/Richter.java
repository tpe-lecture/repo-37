package tpe.oo.metropolis;

/**
 * Representiert einen Richter.
 * @author Christopher Rotter
 *
 */
public class Richter extends Mensch
{
    /**
     * Gibt an, ob der Richter korrupt ist.
     */
    protected boolean istKorrupt;

    public Richter(String name, int einkommen, int alter, boolean istKorrupt)
    {
        super(name, einkommen, alter);
        this.istKorrupt = istKorrupt;
    }

    /**
     * Entscheided ueber einen Schuldspruch.
     * @param schurke   Der Schurke, der vor Gericht steht.
     * @return  Das Ergebnis der Verhandlung.
     */
    public boolean verurteilen(Schurke schurke)
    {
        if(istKorrupt)
            return true;

        return false;
    }
}
