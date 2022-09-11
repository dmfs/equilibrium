package org.dmfs.equilibrium.vector.single;

import org.dmfs.equilibrium.vector.V;
import org.dmfs.jems2.Single;
import org.junit.jupiter.api.Test;

import static org.saynotobugs.confidence.Assertion.assertThat;
import static org.saynotobugs.confidence.quality.Core.closeTo;
import static org.saynotobugs.confidence.quality.Core.has;


class LengthOfTest
{

    @Test
    void test()
    {
        assertThat(new LengthOf(new V(3, 4)), has(Single::value, closeTo(5, 0.0001)));
    }

}