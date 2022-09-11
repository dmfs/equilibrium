package org.dmfs.equilibrium.vector;

import org.junit.jupiter.api.Test;

import static org.dmfs.equilibrium.qualities.Equilibrium.vector;
import static org.saynotobugs.confidence.Assertion.assertThat;
import static org.saynotobugs.confidence.quality.Core.is;


class SumTest
{

    @Test
    void test()
    {
        assertThat(new Sum(new V(1, 1), new V(2, 2)), is(vector(3, 3)));
        assertThat(new Sum(new V(1, -1), new V(-2, 2)), is(vector(-1, 1)));
        assertThat(new Sum(new V(1, -1), new V(-2, 2), new V(4, 4)), is(vector(3, 5)));
    }

}