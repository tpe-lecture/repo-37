package tpe.oo.metropolis;

/**
 * Representiert einen Mutanten.
 * @author Christopher Rotter
 *
 */
public abstract class Mutant extends Einwohner
{
    /**
     * Die Mutation des Mutanten.
     */
    protected String mutation;

    public Mutant(String name, int einkommen, String mutation)
    {
        super(name, einkommen);
        this.mutation = mutation;
    }
}
