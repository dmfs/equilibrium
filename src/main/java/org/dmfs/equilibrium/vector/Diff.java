package org.dmfs.equilibrium.vector;

import org.dmfs.equilibrium.Vector;
import org.dmfs.equilibrium.VectorComposition;


public final class Diff extends VectorComposition
{
    public Diff(Vector from, Vector to)
    {
        super(new V(to.x() - from.x(), to.y() - from.y()));
    }

}
