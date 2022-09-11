package org.dmfs.equilibrium.vector;

import org.dmfs.equilibrium.Vector;
import org.dmfs.equilibrium.VectorComposition;
import org.dmfs.jems2.iterable.Seq;


public final class Sum extends VectorComposition
{
    public Sum(Vector v1, Vector v2)
    {
        super(new V(v1.x() + v2.x(), v1.y() + v2.y()));
    }


    public Sum(Vector... delegates)
    {
        this(new Seq<>(delegates));
    }


    public Sum(Iterable<? extends Vector> delegates)
    {
        super(sum(delegates));
    }


    private static Vector sum(Iterable<? extends Vector> delegates)
    {
        double x = 0;
        double y = 0;
        for (Vector v : delegates)
        {
            x += v.x();
            y += v.y();
        }
        return new V(x, y);
    }
}
