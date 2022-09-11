package org.dmfs.equilibrium.vector.single;

import org.dmfs.equilibrium.Vector;
import org.dmfs.jems2.single.DelegatingSingle;


public final class LengthOf extends DelegatingSingle<Double>
{
    public LengthOf(Vector delegate)
    {
        super(() -> Math.sqrt(delegate.x() * delegate.x() + delegate.y() * delegate.y()));
    }
}
