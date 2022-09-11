package org.dmfs.equilibrium;

public interface Node<T>
{
    Vector pos();

    double mass();

    double charge();

    T payload();
}
