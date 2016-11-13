package tpe.oo.metropolis;

/**
 * Representiert eine Superkraft.
 * @author Christopher Rotter
 *
 */
public class Superkraft
{
    /**
     * Der Name der Superkraft.
     */
    protected String name;

    public Superkraft(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        else if(obj == this)
            return true;
        else if(obj.getClass() == this.getClass())
        {
            Superkraft kraft = (Superkraft) obj;

            return name.equals(kraft.name);
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
}
