package tpe.oo.metropolis;

/**
 * Representiert einen Einwohner.
 * @author Christopher Rotter
 *
 */
public abstract class Einwohner
{
    /**
     * Der Name des Einwohners.
     */
    protected String name;

    /**
     * Das Einkommen des Einwohners.
     */
    protected int einkommen;

    public Einwohner(String name, int einkommen)
    {
        this.name = name;
        this.einkommen = einkommen;
    }

    public int getEinkommen()
    {
        return einkommen;
    }
}
