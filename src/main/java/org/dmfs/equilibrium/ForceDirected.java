package org.dmfs.equilibrium;

import org.dmfs.equilibrium.vector.Diff;
import org.dmfs.equilibrium.vector.Normalized;
import org.dmfs.equilibrium.vector.Scaled;
import org.dmfs.equilibrium.vector.Sum;
import org.dmfs.equilibrium.vector.predicate.EqualTo;
import org.dmfs.equilibrium.vector.single.LengthOf;
import org.dmfs.jems2.Function;
import org.dmfs.jems2.iterable.Mapped;
import org.dmfs.jems2.iterable.Sieved;
import org.dmfs.jems2.predicate.Having;
import org.dmfs.jems2.predicate.Not;
import org.dmfs.jems2.single.Collected;

import java.util.ArrayList;
import java.util.List;


public final class ForceDirected<T> implements Function<Graph<T>, Graph<T>>
{
    private final Function<Double, Double> attractiveForce;
    private final Function<Double, Double> repulsiveForce;


    public ForceDirected(Function<Double, Double> attractiveForce, Function<Double, Double> repulsiveForce)
    {
        this.attractiveForce = attractiveForce;
        this.repulsiveForce = repulsiveForce;
    }


    @Override
    public Graph<T> value(Graph<T> input)
    {
        List<Node<T>> nodes = new Collected<Node<T>, List<Node<T>>>(
            ArrayList::new,
            new Mapped<>(node ->
            {
                final Vector pos = new Sum(node.pos(),
                    new Sum(
                        new Mapped<>(n -> netForce(node.pos(), n.pos(), input.linkWeight(node, n), node.mass(), node.charge() * n.charge()),
                            new Sieved<>(
                                new Having<>(Node::pos, new Not<>(new EqualTo(node.pos()))),
                                input.nodes()))));
                return new Displaced<>(node, pos);
            },
                input.nodes())).value();

        return new Graph<T>()
        {
            @Override
            public Iterable<Node<T>> nodes()
            {
                return nodes;
            }


            @Override
            public double linkWeight(Node<T> a, Node<T> b)
            {
                return input.linkWeight(a, b);
            }
        };
    }


    private Vector netForce(Vector from, Vector to, double linkWeight, double mass, double charges)
    {
        double distance = new LengthOf(new Diff(from, to)).value();
        return new Scaled(new Normalized(from, to),
            (linkWeight * attractiveForce.value(distance) - charges * repulsiveForce.value(distance)) / mass);
    }

}
