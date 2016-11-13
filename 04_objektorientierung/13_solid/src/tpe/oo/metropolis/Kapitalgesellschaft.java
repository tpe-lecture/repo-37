package tpe.oo.metropolis;

/**
 * Representiert eine Kapitalgesellschaft.
 * @author Christopher Rotter
 *
 */
public class Kapitalgesellschaft extends Unternehmen implements IKoerperschaftssteuerpflichtig
{
    /**
     * Die Gesellschafter des Unternehmens.
     */
    protected Buerger[] gesellschafter;

    public Kapitalgesellschaft(String name, int gewinn, Buerger...gesellschafter)
    {
        super(name, gewinn);
        this.gesellschafter = gesellschafter;
    }

    @Override
    public int koerperschaftssteuer()
    {
        return (int) (gewinn * IKoerperschaftssteuerpflichtig.STEUERSATZ);
    }
}
