package tpe.oo.metropolis;

/**
 * Representiert einen Superhelden.
 * @author Christopher Rotter
 *
 */
public class Superheld extends Mutant
{
    /**
     * Die Superkraefte des Superhelden.
     */
    protected Superkraft[] superkraefte;

    public Superheld(String name, int einkommen, String mutation, Superkraft...superkraefte)
    {
        super(name, einkommen, mutation);
        this.superkraefte = superkraefte;
    }

    /**
     * Startet einen Kampf mit dem uebergebenen Schurken.
     * @param schurke Der Schurke, der angegriffen wird.
     * @return  true wenn der Superheld gewinnt, false wenn der Schurke gewinnt.
     */
    public boolean kaempfen(Schurke schurke)
    {
        for(int i = 0; i < superkraefte.length; i++)
            if (superkraefte[i].equals(schurke.schwaeche))
                return true;

        return false;
    }

    public Superkraft[] getSuperkraefte()
    {
        return superkraefte;
    }
}
