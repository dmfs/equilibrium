package org.dmfs.equilibrium.vector;

import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;
import static org.dmfs.equilibrium.qualities.Equilibrium.vector;
import static org.saynotobugs.confidence.Assertion.assertThat;
import static org.saynotobugs.confidence.quality.Core.is;


class NormalizedTest
{

    @Test
    void test()
    {
        assertThat(new Normalized(new V(1, 1), new V(2, 2)), is(vector(1 / sqrt(2), 1 / sqrt(2))));
        assertThat(new Normalized(new V(1, 1)), is(vector(1 / sqrt(2), 1 / sqrt(2))));
    }

}