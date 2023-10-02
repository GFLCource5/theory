package org.example;

import java.util.AbstractList;
import java.util.List;
import java.util.stream.Stream;

public class OddListImpl<T extends Integer> extends AbstractList implements OddList {

    private final List<Integer> list;

    public OddListImpl(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Object get(int index) {
        List<Integer> filtered = filterList();
        return filtered.get(index);
    }

    @Override
    public int size() {
        return filterList().size();
    }

    private List<Integer> filterList(){
        return list.stream().filter(s -> s % 2 != 0).toList();
    }

}
