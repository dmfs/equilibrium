package org.dmfs.equilibrium;

public final class SimpleNode<T> implements Node<T>
{
    private final Vector pos;
    private final T payload;

    private final double mass;


    public SimpleNode(Vector pos, T payload)
    {
        this(pos, payload, 1);
    }


    public SimpleNode(Vector pos, T payload, double mass)
    {
        this.pos = pos;
        this.payload = payload;
        this.mass = mass;
    }


    @Override
    public Vector pos()
    {
        return pos;
    }


    @Override
    public double mass()
    {
        return mass;
    }


    @Override
    public double charge()
    {
        return 1;
    }


    @Override
    public T payload()
    {
        return payload;
    }
}
