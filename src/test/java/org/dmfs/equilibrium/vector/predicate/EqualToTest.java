package org.dmfs.equilibrium.vector.predicate;

import org.dmfs.equilibrium.vector.V;
import org.junit.jupiter.api.Test;

import static org.saynotobugs.confidence.Assertion.assertThat;
import static org.saynotobugs.confidence.quality.Core.equalTo;
import static org.saynotobugs.confidence.quality.Core.has;


class EqualToTest
{

    @Test
    void test()
    {
        assertThat(new EqualTo(new V(1, -1)), has(p -> p.satisfiedBy(new V(1, -1)), equalTo(true)));
        assertThat(new EqualTo(new V(1, -1)), has(p -> p.satisfiedBy(new V(-1, 1)), equalTo(false)));
    }

}