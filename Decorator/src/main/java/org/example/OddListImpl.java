package org.example;

import java.util.AbstractList;
import java.util.List;

public class OddListImpl<Integer> extends AbstractList implements OddList {

    private final List<Integer> list;

    public OddListImpl(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Object get(int index) {

        list.stream().filter(s -> )


    }

    @Override
    public int size() {
        return 0;
    }
}
