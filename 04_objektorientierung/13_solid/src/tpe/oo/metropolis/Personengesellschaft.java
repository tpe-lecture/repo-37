package tpe.oo.metropolis;

/**
 * Representiert eine Personengesellschaft.
 * @author Christopher Rotter
 *
 */
public class Personengesellschaft extends Unternehmen implements IEinkommensteuerpflichtig
{
    /**
     * Die Inhaber des Unternehmens.
     */
    protected Buerger[] inhaber;

    public Personengesellschaft(String name, int gewinn, Buerger...inhaber)
    {
        super(name, gewinn);
        this.inhaber = inhaber;
    }

    @Override
    public int einkommensteuer()
    {
        int verbleibend = gewinn;
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
