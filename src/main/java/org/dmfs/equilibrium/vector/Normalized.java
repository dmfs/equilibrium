package org.dmfs.equilibrium.vector;

import org.dmfs.equilibrium.Vector;
import org.dmfs.equilibrium.VectorComposition;


public final class Normalized extends VectorComposition
{

    public Normalized(Vector from, Vector to)
    {
        this(new Diff(from, to));
    }


    public Normalized(Vector delegate)
    {
        this(delegate, Math.sqrt(delegate.x() * delegate.x() + delegate.y() * delegate.y()));
    }


    private Normalized(Vector delegate, double length)
    {
        super(new Scaled(delegate, 1 / length));
    }
}
