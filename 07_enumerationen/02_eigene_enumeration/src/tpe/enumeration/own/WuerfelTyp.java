package tpe.enumeration.own;

public enum WuerfelTyp
{
    D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);

    private final int numSides;

    private WuerfelTyp(int numSides)
    {
        this.numSides = numSides;
    }

    public int numSides()
    {
        return numSides;
    }

    public double average()
    {
        return this.numSides() / 2.0 + 0.5;
    }
}
