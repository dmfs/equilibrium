package org.dmfs.equilibrium.vector;

import org.dmfs.equilibrium.Vector;
import org.dmfs.equilibrium.VectorComposition;


public final class Scaled extends VectorComposition
{
    public Scaled(Vector delegate, double factor)
    {
        super(factor == 0 ? V.NULL : new V(delegate.x() * factor, delegate.y() * factor));
    }
}
