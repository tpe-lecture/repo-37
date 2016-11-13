package tpe.oo.metropolis;

/**
 * Representiert ein Finanzamt.
 * @author Christopher Rotter
 *
 */
public class Finanzamt
{
    /**
     * Alle steuerflichtigen Individuen.
     */
    protected ISteuerpflichtig[] steuerpflichtige;

    public Finanzamt(ISteuerpflichtig...steuerpflichtige)
    {
        this.steuerpflichtige = steuerpflichtige;
    }

    /**
     * Berechnet die Summe aller Steuereinnahmen für alle bekannten Steuerpflichtigen.
     * @return  Die Summe aller Steuern.
     */
    public int berechneSteuern()
    {
        int summe = 0;

        for(int i = 0; i < steuerpflichtige.length; i++)
        {
            if(steuerpflichtige[i] instanceof IEinkommensteuerpflichtig)
            {
                IEinkommensteuerpflichtig obj = (IEinkommensteuerpflichtig) steuerpflichtige[i];
                summe += obj.einkommensteuer();
            }
            
            if(steuerpflichtige[i] instanceof IKoerperschaftssteuerpflichtig)
            {
                IKoerperschaftssteuerpflichtig obj = (IKoerperschaftssteuerpflichtig) steuerpflichtige[i];
                summe += obj.koerperschaftssteuer();
            }
            
            if(steuerpflichtige[i] instanceof IGewerbesteuerpflichtig)
            {
                IGewerbesteuerpflichtig obj = (IGewerbesteuerpflichtig) steuerpflichtige[i];
                summe += obj.gewerbesteuer();
            }
        }

        return summe;
    }
}
