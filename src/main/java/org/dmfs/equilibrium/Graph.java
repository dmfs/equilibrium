package org.dmfs.equilibrium;

public interface Graph<T>
{
    Iterable<Node<T>> nodes();

    double linkWeight(Node<T> a, Node<T> b);
}
