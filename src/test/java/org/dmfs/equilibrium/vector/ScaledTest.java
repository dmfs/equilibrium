package org.dmfs.equilibrium.vector;

import org.junit.jupiter.api.Test;

import static org.dmfs.equilibrium.qualities.Equilibrium.vector;
import static org.saynotobugs.confidence.Assertion.assertThat;
import static org.saynotobugs.confidence.quality.Core.is;


class ScaledTest
{

    @Test
    void test()
    {
        assertThat(new Scaled(new V(1, 1), 10), is(vector(10, 10)));
        assertThat(new Scaled(new V(1, 1), -10), is(vector(-10, -10)));
        assertThat(new Scaled(new V(1, 1), 0), is(vector(0, 0)));

    }

}