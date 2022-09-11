package org.dmfs.equilibrium.vector;

import org.dmfs.equilibrium.Vector;


public final class V implements Vector
{
    public final static Vector NULL = new V(0, 0);

    private final double x;
    private final double y;


    public V(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    @Override
    public double x()
    {
        return x;
    }


    @Override
    public double y()
    {
        return y;
    }
}
