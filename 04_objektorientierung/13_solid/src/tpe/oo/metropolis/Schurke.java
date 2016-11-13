package tpe.oo.metropolis;

/**
 * Representiert einen Schurken.
 * @author Christopher Rotter
 *
 */
public class Schurke extends Mutant implements IEinkommensteuerpflichtig
{
    /**
     * Die Schwaeche des Schurken.
     */
    protected Superkraft schwaeche;

    public Schurke(String name, int einkommen, String mutation, Superkraft schwaeche)
    {
        super(name, einkommen, mutation);
        this.schwaeche = schwaeche;
    }

    @Override
    public int einkommensteuer()
    {
        int verbleibend = einkommen;
        int abgaben = 0;
        int i = 1;

        while(verbleibend > 0)
        {
            switch(i)
            {
                case 1:
                    if(verbleibend < 20000)
                        abgaben += (int) (verbleibend * STEUERSATZ1);
                    else
                        abgaben += (int) (20000 * STEUERSATZ1);

                    verbleibend -= 20000;
                    break;
                case 2:
                    if(verbleibend < 20000)
                        abgaben += (int) (verbleibend * STEUERSATZ2);
                    else
                        abgaben += (int) (40000 * STEUERSATZ2);

                    verbleibend -= 40000;
                    break;
                case 3:
                    if(verbleibend < 20000)
                        abgaben += (int) (verbleibend * STEUERSATZ3);
                    else
                        abgaben += (int) (60000 * STEUERSATZ3);

                    verbleibend -= 60000;
                    break;
                case 4:
                    abgaben += (int) (verbleibend * STEUERSATZ4);
                    verbleibend = 0;
                    break;
            }
        }

        return abgaben;
    }

    /**
     * Startet einen Kampf mit dem uebergebenen Superhelden.
     * @param superheld Der Superheld, der angegriffen wird.
     * @return  true wenn der Schurke gewinnt, false wenn der Superheld gewinnt.
     */
    public boolean kaempfen(Superheld superheld)
    {
        Superkraft[] gegnerKraefte = superheld.getSuperkraefte();

        for(int i = 0; i < gegnerKraefte.length; i++)
            if(schwaeche.equals(gegnerKraefte[i]))
                return false;

        return true;
    }

    public Superkraft getSchwaeche()
    {
        return schwaeche;
    }
}
