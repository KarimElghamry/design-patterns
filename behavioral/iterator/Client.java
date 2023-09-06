package behavioral.iterator;

import behavioral.iterator.ds.CustomList;
import behavioral.iterator.ds.Iterator;

public class Client {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<Integer>();
        Iterator<Integer> iterator = list.new DefaultIterator();

        // push some elements
        for (int i = 0; i < 5; i++) {
            list.push(i);
        }

        // iterate
        while (!iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
