package org.dmfs.equilibrium.qualities;

import org.dmfs.srcless.annotations.staticfactory.StaticFactories;
import org.saynotobugs.confidence.quality.composite.QualityComposition;

import static java.lang.Math.abs;
import static org.saynotobugs.confidence.quality.Core.*;


@StaticFactories("Equilibrium")
public final class Vector extends QualityComposition<org.dmfs.equilibrium.Vector>
{
    public Vector(double x, double y)
    {
        super(allOf(
            has("x", org.dmfs.equilibrium.Vector::x, closeTo(x, abs(x) / 1000)),
            has("y", org.dmfs.equilibrium.Vector::y, closeTo(y, abs(y) / 1000))));
    }
}
