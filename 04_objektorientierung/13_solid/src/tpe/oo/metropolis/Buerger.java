package tpe.oo.metropolis;

/**
 * Representiert einen Buerger.
 * @author Christopher Rotter
 *
 */
public class Buerger extends Mensch implements IEinkommensteuerpflichtig
{
    public Buerger(String name, int einkommen, int alter)
    {
        super(name, einkommen, alter);
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
}
