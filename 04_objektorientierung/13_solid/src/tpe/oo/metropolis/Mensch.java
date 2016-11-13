package tpe.oo.metropolis;

/**
 * Representiert einen Menschen.
 * @author Christopher Rotter
 *
 */
public abstract class Mensch extends Einwohner
{
    /**
     * Das Alter des Menschen.
     */
    protected int alter;

    public Mensch(String name, int einkommen, int alter)
    {
        super(name, einkommen);
        this.alter = alter;
    }
}
