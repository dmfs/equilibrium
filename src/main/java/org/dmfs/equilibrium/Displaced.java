package org.dmfs.equilibrium;

public final class Displaced<T> implements Node<T>
{
    private final Node<T> mDelegate;
    private final Vector mPos;


    public Displaced(Node<T> delegate, Vector pos)
    {
        mDelegate = delegate;
        mPos = pos;
    }


    @Override
    public Vector pos()
    {
        return mPos;
    }


    @Override
    public double mass()
    {
        return mDelegate.mass();
    }


    @Override
    public double charge()
    {
        return mDelegate.charge();
    }


    @Override
    public T payload()
    {
        return mDelegate.payload();
    }
}
