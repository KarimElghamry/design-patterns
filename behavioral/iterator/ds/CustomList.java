package behavioral.iterator.ds;

import java.util.ArrayList;

public class CustomList<T> {
    private final ArrayList<T> list;

    public CustomList() {
        this.list = new ArrayList<T>();
    }

    public void push(T item) {
        this.list.add(item);
    }

    public int size() {
        return this.list.size();
    }

    public T get(int index) {
        return this.list.get(index);
    }

    /* Iterator implementation */
    public class DefaultIterator implements Iterator<T> {
        private int currentIndex;

        public DefaultIterator() {
            currentIndex = 0;
        }

        @Override
        public void reset() {
            this.currentIndex = 0;
        }

        @Override
        public void next() {
            if (!this.isDone())
                this.currentIndex++;
        }

        @Override
        public T current() {
            if (!this.isDone())
                return list.get(this.currentIndex);

            return null;
        }

        @Override
        public boolean isDone() {
            return this.currentIndex >= list.size();
        }

    }
}
