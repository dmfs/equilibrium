package org.dmfs.equilibrium.vector.predicate;

import org.dmfs.equilibrium.Vector;
import org.dmfs.jems2.Predicate;


public final class EqualTo implements Predicate<Vector>
{
    private final Vector mVector;


    public EqualTo(Vector vector)
    {
        mVector = vector;
    }


    @Override
    public boolean satisfiedBy(Vector testedInstance)
    {
        return mVector.x() == testedInstance.x() && mVector.y() == testedInstance.y();
    }
}
