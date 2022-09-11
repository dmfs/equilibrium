package org.dmfs.equilibrium.vector;

import org.junit.jupiter.api.Test;

import static org.dmfs.equilibrium.qualities.Equilibrium.vector;
import static org.saynotobugs.confidence.Assertion.assertThat;
import static org.saynotobugs.confidence.quality.Core.is;


class VTest
{

    @Test
    void test()
    {
        assertThat(new V(1, 2), is(vector(1, 2)));
        assertThat(V.NULL, is(vector(0, 0)));
    }
}