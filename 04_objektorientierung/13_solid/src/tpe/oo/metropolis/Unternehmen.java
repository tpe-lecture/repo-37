package tpe.oo.metropolis;

/**
 * Representiert ein Unternehmen.
 * @author Christopher Rotter
 *
 */
public abstract class Unternehmen implements IGewerbesteuerpflichtig
{
    /**
     * Der Name des Unternehmens.
     */
    protected String name;

    /**
     * Der Gewinn des Unternehmens.
     */
    protected int gewinn;

    public Unternehmen(String name, int gewinn)
    {
        this.name = name;
        this.gewinn = gewinn;
    }

    @Override
    public int gewerbesteuer()
    {
        return (int) (gewinn * STEUERSATZ);
    }
}
