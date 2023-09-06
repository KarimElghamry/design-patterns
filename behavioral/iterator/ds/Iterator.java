package behavioral.iterator.ds;

public interface Iterator<T> {
    public void reset();

    public void next();

    public T current();

    public boolean isDone();
}
