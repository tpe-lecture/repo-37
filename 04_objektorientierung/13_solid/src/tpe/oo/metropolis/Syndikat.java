package tpe.oo.metropolis;

/**
 * vRepresentiert ein Syndikat.
 * @author Christopher Rotter
 *
 */
public class Syndikat implements IKoerperschaftssteuerpflichtig
{
    /**
     * Der Name des Syndikats.
     */
    protected String name;

    /**
     * Die Mitglieder des Syndikats.
     */
    protected Schurke[] mitglieder;

    public Syndikat(String name, Schurke...mitglieder)
    {
        this.name = name;
        this.mitglieder = mitglieder;
    }

    @Override
    public int koerperschaftssteuer()
    {
        int summe = 0;

        for(int i = 0; i < mitglieder.length; i++)
            summe += mitglieder[i].getEinkommen();

        return (int) (summe* STEUERSATZ);
    }
}
