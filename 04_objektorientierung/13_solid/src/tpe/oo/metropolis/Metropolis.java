package tpe.oo.metropolis;

import java.util.LinkedList;

/**
 * Representiert die Stadt Metropolis.
 * @author Christopher Rotter
 *
 */
public class Metropolis
{
    /**
     * Das Finanzamt von Metropolis.
     */
    protected Finanzamt finanzamt;

    /**
     * Die Einwohner von Metropolis.
     */
    protected Einwohner[] einwohner;

    /**
     * Die Unternehmen von Metropolis.
     */
    protected Unternehmen[] unternehmen;

    /**
     * Die Syndikate von Metropolis.
     */
    protected Syndikat[] syndikate;

    public Metropolis(Einwohner[] einwohner, Unternehmen[] unternehmen, Syndikat[] syndikate)
    {
        this.einwohner = einwohner;
        this.unternehmen = unternehmen;
        this.syndikate = syndikate;

        LinkedList<ISteuerpflichtig> steuerpflichtigeListe = new LinkedList<ISteuerpflichtig>();

        for(int i = 0; i < einwohner.length; i++)
            if(einwohner[i] instanceof ISteuerpflichtig)
            steuerpflichtigeListe.add((ISteuerpflichtig) einwohner[i]);

        for(int i = 0; i < unternehmen.length; i++)
            steuerpflichtigeListe.add((ISteuerpflichtig) unternehmen[i]);

        for(int i = 0; i < syndikate.length; i++)
            steuerpflichtigeListe.add((ISteuerpflichtig) syndikate[i]);

        ISteuerpflichtig[] steuerpflichtige = new ISteuerpflichtig[steuerpflichtigeListe.size()];

        for(int i = 0; i < einwohner.length; i++)
            steuerpflichtige[i] = steuerpflichtigeListe.get(i);

        finanzamt = new Finanzamt(steuerpflichtige);
    }

    public static void main(String[] args)
    {
        Schurke azog = new Schurke("Azog der Schänder", 27990, "Orkismus", null);
        Schurke hannibal = new Schurke("Hannibal Lecter", 19910, "Kannibalismus", null);
        Schurke onox = new Schurke("Onox", 270201, "Legendismus", null);

        Syndikat syndikatDerSuperschurken = new Syndikat("Syndikat der Superschurken", azog, hannibal);

        Finanzamt finanzamt = new Finanzamt(azog, hannibal, onox, syndikatDerSuperschurken);

        System.out.println("Die Steuereinnahen belaufen sich auf: " + finanzamt.berechneSteuern() + " Metropolis-Dollar.");
    }
}
